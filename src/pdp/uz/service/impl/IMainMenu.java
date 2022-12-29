package pdp.uz.service.impl;

import pdp.uz.service.interfaces.MainMenu;

public class IMainMenu implements MainMenu {
    private  static MainMenu mainMenu;
    public static MainMenu getInstance(){
        if (mainMenu==null){
            mainMenu=new IMainMenu();
        }
        return mainMenu;
    }
    @Override
    public void startProject() {

    }
}
