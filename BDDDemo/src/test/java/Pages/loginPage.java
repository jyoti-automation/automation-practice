package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;

    private By txt_username = By.id("username");
    private By txt_password = By.id("password");
    private By btn_submit = By.id("submit");
   // private By btn_logout = By.Xpath("//a[contains(text(),'Log out')]");

    public loginPage(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().equals("practice-test-login")) {
           throw new IllegalStateException("This is not the login page. The current page is " + driver.getCurrentUrl());
        }
    }

    public void enterUsername(String username) {
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(btn_submit).click();
    }
//public boolean checkLogOutIsDisplayed(){
      //  return driver.findElement(btn_logout).isDisplayed();

public void logInValidUser(String username,String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_submit).click();

    }
}











