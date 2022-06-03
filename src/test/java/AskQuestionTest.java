package test.java;

import main.java.page_events.*;
import org.testng.annotations.Test;

public class AskQuestionTest extends BaseTest{
    @Test
    public void AskQuestionMethod(){
        HomePageEvents homePageEvents = new HomePageEvents();
        LoginPageEvents loginPageEvents = new LoginPageEvents();
        GoodsDescriptionEvents goodsDescriptionEvents = new GoodsDescriptionEvents();
        GoodsListPageEvents goodsListPageEvents = new GoodsListPageEvents();

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

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        goodsDescriptionEvents.clickOnGiveFeedback();
//        goodsDescriptionEvents.chooseTextOption();
        goodsDescriptionEvents.enterComment();
        goodsDescriptionEvents.clickOnSubmitComment();
    }
}
