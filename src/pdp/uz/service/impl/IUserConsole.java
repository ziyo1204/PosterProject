package pdp.uz.service.impl;

import pdp.uz.model.User;
import pdp.uz.service.interfaces.UserConsole;

import java.util.Scanner;

public class IUserConsole implements UserConsole {
    private static UserConsole userConsole;

    public static UserConsole getInstance() {
        if (userConsole == null) {
            userConsole = new IUserConsole();
        }
        return userConsole;
    }

    @Override
    public void userConsole(User currentUser) {
        System.out.println("Welcome " + currentUser.getName());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    ===============
                     1.See all posts\s
                     2.Add post\s
                     3.Change post\s
                     4.Delete post\s
                     5.My posts\s
                     6.Change password\s
                     7.Chat\s
                     8.Report\s
                     0.Report\s
                     ===============\s""");
            int command = scanner.nextInt();
            if (command == 1) {
                seeAllPosts();
            } else if (command == 2) {
                addPost();
            } else if (command == 3) {
                changePost();
            } else if (command == 4) {
                deletePost();
            } else if (command == 5) {
                myPosts();
            } else if (command == 6) {
                changePassword();
            } else if (command == 7) {
                chat();
            } else if (command == 8) {
                report();
            } else if (command == 0) {
                break;
            } else {
                System.err.println("   Wrong command!   ");
            }
        }
    }

    private void report() {
    }

    private void chat() {
    }

    private void changePassword() {
    }

    private void myPosts() {
    }

    private void deletePost() {
    }

    private void changePost() {
    }

    private void addPost() {

    }

    private void seeAllPosts() {
        System.out.println("Category list: ");

    }
}
