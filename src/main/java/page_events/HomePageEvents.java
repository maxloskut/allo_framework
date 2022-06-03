package main.java.page_events;

import main.java.page_objects.HomePageElements;
import main.java.utils.ElementsFetch;
import org.openqa.selenium.Keys;
import test.java.BaseTest;

public class HomePageEvents {

    public void clickOnSighInButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on Sign in button");
        elementsFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
    }

    public void enterNameOfItem(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the name of item");
        elementsFetch.getWebElement("ID", HomePageElements.searchInput).sendKeys("iphone 13" + Keys.ENTER) ;
    }

    public void clickOnYoutubeButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on Sign in button");
        elementsFetch.getWebElement("XPATH", HomePageElements.youtube).click();
    }

    public void clickOnTikTokButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on Sign in button");
        elementsFetch.getWebElement("XPATH", HomePageElements.tiktok).click();
    }
}
