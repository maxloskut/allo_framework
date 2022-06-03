package main.java.page_events;

import main.java.page_objects.GoodsListPageElements;
import main.java.utils.ElementsFetch;
import test.java.BaseTest;

public class GoodsListPageEvents {
    public void clickOnCartElement(){
        ElementsFetch elementsFetch = new ElementsFetch();
        BaseTest.logger.info("Clicking on cart element");
        elementsFetch.getWebElement("XPATH", GoodsListPageElements.cartElement).click();
    }

}
