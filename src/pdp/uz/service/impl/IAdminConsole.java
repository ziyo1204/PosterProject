package pdp.uz.service.impl;

import pdp.uz.model.User;
import pdp.uz.service.interfaces.AdminConsole;

import java.util.Scanner;

public class IAdminConsole implements AdminConsole {
    private static AdminConsole adminConsole;

    public static AdminConsole getInstance() {
        if (adminConsole == null) {
            adminConsole = new IAdminConsole();
        }
        return adminConsole;
    }
    @Override
    public void adminConsole(User currentUser) {
        while (true) {
            System.out.println("1-E'lon qo'shish || 2-E'lonlarni ko'rish || 3-E'lon statusini o'zgartirish || 4-Userlarni ko'rish || 5-Shikoyatlarni ko'rish || 6-Userni blok qilish || 7-Chiqish");
            Scanner scanner=new Scanner(System.in);
            int command= scanner.nextInt();
            if (command==1){

            } else if (command==2) {

            } else if (command==3) {

            } else if (command==4) {

            } else if (command==5) {

            } else if (command==6) {

            } else if (command==7) {
                break;
            } else {
                System.out.println("Qaytadan kiriting:");
            }
        }
    }
}
