package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginstepsDefinitionsForScenarioWithExamples {
    private WebDriver driver;
    @Given("user is on Home page")
    public void userIsOnHomePage() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("user Navigate to LogIn page")
    public void userNavigateToLogInPage() {
        System.out.println("userNavigateToLogInPage");
    }


    @And("user enters{string}and{string}")
    public void userEntersAnd(String username, String password) {
        System.out.println("username is"+username+"password is"+password);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() throws InterruptedException {
        System.out.println(" messageDisplayedLoginSuccessfully");
        Thread.sleep(2000);
        driver.close();


    }
}
