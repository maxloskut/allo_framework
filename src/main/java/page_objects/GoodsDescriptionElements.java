package main.java.page_objects;

public interface GoodsDescriptionElements {
    String buyButton = "//*[@id=\"product-buy-button\"]";
    String giveFeedbackButton = "//*[@id=\"p-comments\"]/div/div[1]/div[2]/div[3]/button[1]";
    String textOption = "//*[@class=\"tabs__item\"]";
    String textArea = "//*[@id=\"reviews-message\"]";
    String submitComment = "//*[@class=\"apply__button\"]";
    String selectLocation = "//*[@data-select-store-button]";
}
