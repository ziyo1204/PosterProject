package pdp.uz.service.impl;

import pdp.uz.Storage;
import pdp.uz.model.Role;
import pdp.uz.model.Status;
import pdp.uz.model.User;
import pdp.uz.service.interfaces.MainMenu;
import pdp.uz.service.interfaces.SignInSignUp;

import java.util.Scanner;

public class IMainMenu implements MainMenu {
    private  static MainMenu mainMenu;
    SignInSignUp signInSignUp=ISignInSignUp.getInstance();
    public static MainMenu getInstance(){
        if (mainMenu==null){
            mainMenu=new IMainMenu();
        }
        return mainMenu;
    }

    @Override
    public void startProject() {
        added();
        Storage.users.add(new User(User.getCurrentId(), "admin", "12",
                "777", Role.ADMIN, Status.ACTIVE));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to E-Poster!");
        while (true) {
            System.out.println("'1'-\"Kirish\" '2'-\"Ro'yxatdan o'tish\" '0'-\"Chiqish\"");
            String com = scanner.nextLine();
            if (com.equals("0")) {
                break;
            } else if (com.equals("1")) {
                signInSignUp.signIn();
            } else if (com.equals("2")) {
                signInSignUp.signUp();
            } else {
                System.out.println("Mavjud bo'lmagan buyruq!");
            }
        }
    }

    @Override
    public void added() {

    }
}
