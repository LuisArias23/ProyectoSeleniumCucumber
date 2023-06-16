package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.googlePage;

public class GoogleSteps {

    googlePage google = new googlePage();

    @Given("I am on the Google search page")
    public void navigateToGoogle() {
        google.navigateToGoogle();

    }

    @Then("I enter a search criteria")
    public void enterSearchCriteria() {
        google.enterSearch("Fundacion Magdalena");
    }

    @And("Click on the search button")
    public void clickSearchButton() {
        google.clickGoogleSearch();
    }

    @When("The result mach the criteria")
    public void validateResults() {
    }
}
