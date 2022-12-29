package pdp.uz.service.impl;

import pdp.uz.Storage;
import pdp.uz.model.Role;
import pdp.uz.model.User;
import pdp.uz.service.interfaces.SignInSignUp;

import java.util.Scanner;

public class ISignInSignUp implements SignInSignUp {
    private static SignInSignUp signInSignUp;

    public static SignInSignUp getInstance() {
        if (signInSignUp == null) {
            signInSignUp = new ISignInSignUp();
        }
        return signInSignUp;
    }

    @Override
    public void signIn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Password: ");
            String password = scanner.nextLine();
            User user = Storage.users.stream().filter(user1 ->
                            user1.getPassword().equals(password))
                    .findFirst().orElse(null);
            if (user == null) {
                System.out.println("Kirish uchun registratsiyadan o'ting!");
                break;
            } else {
                if (user.getRole().equals(Role.ADMIN)) {
                    IAdminConsole.getInstance().adminConsole(user);
                    break;
                }
                if (user.getRole().equals(Role.USER)) {
                    IUserConsole.getInstance().userConsole(user);
                    break;
                }
            }
        }
    }

    @Override
    public void signUp() {

    }
}
