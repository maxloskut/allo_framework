package test.java;

import main.java.page_events.HomePageEvents;
import main.java.page_events.LoginPageEvents;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class ReviewSocialMediaTest extends BaseTest{
    @Test
    public void sampleMethodForCredentialsEntering(){
        HomePageEvents homePageEvents = new HomePageEvents();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        JavascriptExecutor jse = (JavascriptExecutor) driver;

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

        jse.executeScript("window.scrollBy(0, document.body.scrollHeight);");

        homePageEvents.clickOnYoutubeButton();
        homePageEvents.clickOnTikTokButton();
    }
}
