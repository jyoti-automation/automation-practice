package pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_PF {
    WebDriver driver;
    @FindBy(id="username")
    @CacheLookup
    WebElement txt_username;

    @FindBy(id="password")
    WebElement txt_password;


    @FindBy(id="submit")
    WebElement btn_submit;

    public loginpage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }
    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }
    public void clickLogin(){
        btn_submit.click();
    }
}
