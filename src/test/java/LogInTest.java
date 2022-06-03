package test.java;

import main.java.page_events.HomePageEvents;
import main.java.page_events.LoginPageEvents;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
    @Test
    public void sampleMethodForCredentialsEntering(){
        HomePageEvents homePageEvents = new HomePageEvents();
        LoginPageEvents loginPageEvents = new LoginPageEvents();

        homePageEvents.clickOnSighInButton();

        //Logging in process

        loginPageEvents.verifyLoginPageOpenedOrNot();
        loginPageEvents.enterEmailId();
        loginPageEvents.enterPasswordId();
        loginPageEvents.clickOnSubmitButton();
    }
}
