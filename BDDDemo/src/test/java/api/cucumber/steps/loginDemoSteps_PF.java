package api.cucumber.steps;

import Pages.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.Homepage_PF;
import pagefactory.loginpage_PF;

import java.util.concurrent.TimeUnit;

public class loginDemoSteps_PF {

        WebDriver driver=null;
        loginpage_PF login;
        Homepage_PF home;

        @Given("browser is open")
        public void browserIsOpen() {
            System.out.println("browser is open");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @And("user is on login page")
        public void userIsOnLoginPage() {
            driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

        }

        @When("user enters {string} and {string}")
        public void userEntersAnd(String username, String password) throws InterruptedException {
            login=new loginpage_PF(driver);
            login.enterUsername(username);
            login.enterPassword(password);
            Thread.sleep(2000);


        }

        @And("user clicks on submit")
        public void userClicksOnSubmit() {
            login.clickLogin();
            System.out.println("user click on submit");

        }

        @Then("user is navigated to the home page")
        public void userIsNavigatedToTheHomePage() {
            home=new Homepage_PF(driver);
            Assert.assertTrue(home.CheckLogOutIsDisplayed());
            System.out.println("user is navigated to the home page");
        }
    }

