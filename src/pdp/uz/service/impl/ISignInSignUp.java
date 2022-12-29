package pdp.uz.service.impl;

import pdp.uz.Storage;
import pdp.uz.model.Role;
import pdp.uz.model.Status;
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
            System.out.print("User_Name: ");
            String userName = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            User user = Storage.users.stream().filter(user1 ->
                            user1.getUserName().equals(userName)&&user1.getPassword().equals(password))
                    .findFirst().orElse(null);
            if (user == null) {
                System.out.println("Login yoki parol xato!");
                break;
            } else {
                if (user.getStatus().equals(Status.ACTIVE)){
                    if(user.getRole().equals(Role.ADMIN)){
                        IAdminConsole.getInstance().adminConsole(user);
                        break;
                    }
                    if(user.getRole().equals(Role.USER)){
                        IUserConsole.getInstance().userConsole(user);
                        break;
                    }
                } else {
                    System.out.println(user.getStatus().equals(Status.BLOCKED) ?
                            "Bu accaunt bloklangan!" :
                            "Bu accaunt o'chirilgan!");
                }
            }
        }
    }

    @Override
    public void signUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User_Name: ");
        String userName = scanner.nextLine();
        User user = Storage.users.stream().filter(a ->
                a.getUserName().equals(userName)).findFirst().orElse(null);
        if (user!=null){
            System.out.println("Bu userName ro'yxatdan o'tgan!");
        }else {
            System.out.print("Password: ");
            String password = scanner.nextLine();
            System.out.print("Phone_Number: ");
            String phoneNumber = scanner.nextLine();
            Storage.users.add(new User(User.getCurrentId(), userName, password, phoneNumber, Role.USER, Status.ACTIVE));
            System.out.println("Succesfully registred!");
        }
    }
}
