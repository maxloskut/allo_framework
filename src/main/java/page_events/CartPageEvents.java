package main.java.page_events;

import main.java.page_objects.CartPageElements;
import main.java.utils.ElementsFetch;
import test.java.BaseTest;

public class CartPageEvents {
    public void enterQuantity(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Entering the quantity");
        elementsFetch.getWebElement("XPATH", CartPageElements.quantity).click();
        elementsFetch.getWebElement("XPATH", CartPageElements.quantity).clear();
        elementsFetch.getWebElement("XPATH", CartPageElements.quantity).sendKeys("3");
        elementsFetch.getWebElement("XPATH", "//*[@class=\"v-modal__cmp-body\"]").click();
    }
}
