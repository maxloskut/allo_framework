package test.java;

import main.java.page_events.*;
import org.testng.annotations.Test;

public class AddItemToBasketTest extends BaseTest{
    @Test
    public void addItemToBasketMethod(){
        HomePageEvents homePageEvents = new HomePageEvents();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        GoodsDescriptionEvents goodsDescriptionEvents = new GoodsDescriptionEvents();
        GoodsListPageEvents goodsListPageEvents = new GoodsListPageEvents();
        CartPageEvents cartPageEvents = new CartPageEvents();

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

        homePageEvents.enterNameOfItem();
        goodsListPageEvents.clickOnCartElement();
        goodsDescriptionEvents.clickOnBuyButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        goodsDescriptionEvents.clickOnChooseLocation();
        cartPageEvents.enterQuantity();
    }
}

