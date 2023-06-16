package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestSandBox;

public class TestSandboxSteps {
    TestSandBox sandboxPage=new TestSandBox();

    @Given("I navigate to the sandbox page")
    public void navigateToSandboxSites(){
        sandboxPage.navigateToSandbox();
    }
    @And("select a value from the dropdown")
    public void SelectState(){
        sandboxPage.selectCategoriaSoluciones("COLOMBIA");
    }
}
