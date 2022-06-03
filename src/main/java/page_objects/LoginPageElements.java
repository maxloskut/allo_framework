package main.java.page_objects;

public interface LoginPageElements {
   String loginText = "//*[@id=\"customer-popup-menu\"]/ul/li[1]";
   String emailAddress = "//*[@id=\"auth\"]";
   String passwordAddress = "//*[@id=\"v-login-password\"]";
   String submitButton = "//*[@class=\"modal-submit-button\"]";
   String userInfo = "//*[@class=\"mh-button info\"]";
}
