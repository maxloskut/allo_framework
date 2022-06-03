package main.java.page_events;


import main.java.page_objects.LoginPageElements;
import main.java.utils.ElementsFetch;
import org.testng.Assert;
import test.java.BaseTest;

public class LoginPageEvents {
    public void verifyLoginPageOpenedOrNot() {
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Verifying that the login page opened or not");
        Assert.assertTrue(elementsFetch.getListWebElements("XPATH", LoginPageElements.loginText).size() > 0, "Login page didn't open((");
    }

    public void enterEmailId(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the email");
        elementsFetch.getWebElement("XPATH", LoginPageElements.emailAddress).sendKeys("loskutovmaks03@gmail.com");
    }

    public void enterPasswordId(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the password");
        elementsFetch.getWebElement("XPATH", LoginPageElements.passwordAddress).sendKeys("jdifbdr");
    }

    public void clickOnSubmitButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on Submit button");
        elementsFetch.getWebElement("XPATH", LoginPageElements.submitButton).click();
    }

    public void clickOnUserAccount(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on Submit button");
        elementsFetch.getWebElement("XPATH", LoginPageElements.userInfo).click();
    }
}