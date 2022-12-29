package pdp.uz.service.impl;

import pdp.uz.model.User;
import pdp.uz.service.interfaces.UserConsole;

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

    }
}
