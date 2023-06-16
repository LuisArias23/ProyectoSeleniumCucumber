package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridPage;

public class GrindTestSteps {
    GridPage grid=new GridPage();
    @Given("I navigate to the static table")
    public void navigateToGridPage(){
        grid.navigateToGrid();
    }
    @Then("I can return the value I wanted")
    public void returnValue(){
       String value= grid.getValueFromGrid(2,1);
        System.out.println(value);
    }
}
