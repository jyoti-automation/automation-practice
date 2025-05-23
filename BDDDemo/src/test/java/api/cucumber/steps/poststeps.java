package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class poststeps {
    @Given("user should be logged in and should be present on his wall")
    public void userShouldBeLoggedInAndShouldBePresentOnHisWall() {
        System.out.println(" userShouldBeLoggedInAndShouldBePresentOnHisWall");

    }
    @When("I type the message in the box")
    public void iTypeTheMessageInTheBox() {
        System.out.println(" iTypeTheMessageInTheBox");
    }




    @And("click on the post button")
    public void clickOnThePostButton() {
        System.out.println("clickOnThePostButton");
    }

    @Then("The message should get posted")
    public void theMessageShouldGetPosted() {
        System.out.println("theMessageShouldGetPosted");
    }

    @When("user supply the youtube link as {string} in the text box")
    public void userSupplyTheYoutubeLinkAsInTheTextBox(String arg0) {
        System.out.println(" userSupplyTheYoutubeLinkAsInTheTextBox ");
    }

    @And("Click on post button")
    public void clickOnPostButton() {
        System.out.println("clickOnPostButton");
    }

    @Then("The video should get posted on user wall")
    public void theVideoShouldGetPostedOnUserWall() {
        System.out.println(" theVideoShouldGetPostedOnUserWall");
    }

    @And("the video should have proper thumbnail")
    public void theVideoShouldHaveProperThumbnail() {
        System.out.println(" theVideoShouldHaveProperThumbnail");
    }
}


