package pdp.uz;

import pdp.uz.service.impl.IMainMenu;

public class Application {
    public static void main(String[] args) {
        IMainMenu.getInstance().startProject();
    }
}
