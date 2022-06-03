package main.java.page_events;

import main.java.page_objects.AccountPageElements;
import main.java.utils.ElementsFetch;
import org.openqa.selenium.Keys;
import test.java.BaseTest;

public class AccountPageEvents {
    public void clickOnEditButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on edit button");
        elementsFetch.getWebElement("XPATH", AccountPageElements.addAddress).click();
    }

    public void enterNameOfCity(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the city");
        elementsFetch.getWebElement("XPATH", AccountPageElements.city).sendKeys("Харків" + Keys.ENTER);
    }

    public void enterNameOfStreet(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the street");
        elementsFetch.getWebElement("XPATH", AccountPageElements.street).sendKeys("Wolf Street");
    }

    public void enterNameOfHouse(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the house");
        elementsFetch.getWebElement("XPATH", AccountPageElements.house).sendKeys("White House");
    }

    public void enterNameOfApartment(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the apartment");
        elementsFetch.getWebElement("XPATH", AccountPageElements.apartment).sendKeys("228");
    }

    public void clickOnArea(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on edit button");
        elementsFetch.getWebElement("XPATH", AccountPageElements.formArea).click();
    }

    public void clickOnSubmitButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on edit button");
        elementsFetch.getWebElement("XPATH", AccountPageElements.addressSubmit).click();
    }

    public void clickOnDeclineButton(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on edit button");
        elementsFetch.getWebElement("XPATH", AccountPageElements.addressSubmit).click();
    }
}
