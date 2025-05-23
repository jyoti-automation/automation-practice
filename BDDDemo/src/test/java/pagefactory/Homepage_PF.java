package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Homepage_PF {
    @FindBy(xpath = "//a[text()='Log out']")
    WebElement btn_Logout;


    WebDriver driver;
    public Homepage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public boolean CheckLogOutIsDisplayed(){
        return btn_Logout.isDisplayed();
    }
}
