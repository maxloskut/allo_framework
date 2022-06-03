package main.java.page_events;

import main.java.page_objects.GoodsDescriptionElements;
import main.java.utils.ElementsFetch;
import test.java.BaseTest;

public class GoodsDescriptionEvents {
    public void clickOnBuyButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on buy button");
        elementsFetch.getWebElement("XPATH", GoodsDescriptionElements.buyButton).click();
    }

    public void clickOnChooseLocation(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on buy button");
        elementsFetch.getWebElement("XPATH", GoodsDescriptionElements.selectLocation).click();
    }

    public void clickOnGiveFeedback(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on cancel button");
        elementsFetch.getWebElement("XPATH", GoodsDescriptionElements.giveFeedbackButton).click();
    }

    public void chooseTextOption(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Choose the option");
        elementsFetch.getWebElement("XPATH", GoodsDescriptionElements.textOption).click();
    }

    public void enterComment(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on cancel button");
        elementsFetch.getWebElement("XPATH", GoodsDescriptionElements.textArea).sendKeys("It works properly. I look forward to the next version");
    }

    public void clickOnSubmitComment(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Choose the option");
        elementsFetch.getWebElement("XPATH", GoodsDescriptionElements.submitComment).click();
    }
}
