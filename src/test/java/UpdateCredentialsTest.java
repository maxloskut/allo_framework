package test.java;

import main.java.page_events.*;
import org.testng.annotations.Test;

public class UpdateCredentialsTest extends BaseTest{
    @Test
    public void updateCredentialsMethod() {
        HomePageEvents homePageEvents = new HomePageEvents();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        AccountPageEvents accountPageEvents = new AccountPageEvents();

        homePageEvents.clickOnSighInButton();

        loginPageEvents.verifyLoginPageOpenedOrNot();
        loginPageEvents.enterEmailId();
        loginPageEvents.enterPasswordId();
        loginPageEvents.clickOnSubmitButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        homePageEvents.clickOnSighInButton();
        loginPageEvents.clickOnUserAccount();

        accountPageEvents.clickOnEditButton();

        accountPageEvents.enterNameOfCity();
        accountPageEvents.clickOnArea();
        accountPageEvents.enterNameOfStreet();
        accountPageEvents.enterNameOfHouse();
        accountPageEvents.enterNameOfApartment();

        accountPageEvents.clickOnSubmitButton();
    }
}
