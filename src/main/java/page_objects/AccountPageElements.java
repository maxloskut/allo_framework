package main.java.page_objects;

public interface AccountPageElements {
    String addAddress = "//*[@class=\"blue-link personal-info__add-new\"]";
    String city = "//*[@id=\"city\"]";
    String street = "//*[@id=\"street\"]";
    String house = "//*[@id=\"house\"]";
    String apartment = "//*[@id=\"apartment\"]";
    String addressSubmit = "//*[@class=\"customer-btn__submit\"]";
    String addressDecline = "";
    String formArea = "//*[@class=\"personal-info__block personal-info__section address\"]";
}
