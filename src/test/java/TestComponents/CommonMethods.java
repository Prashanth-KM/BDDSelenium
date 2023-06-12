package TestComponents;

import com.web.pages.LoginPage;

public class CommonMethods extends LaunchApplication{

    public LoginPage loginPage;


    public void initPageObjectClasses(){
        loginPage = new LoginPage(driver);



    }

    public void launchApp() {
        launchApplication();
        initPageObjectClasses();
    }


}
