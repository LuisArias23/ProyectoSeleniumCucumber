package pages;

import org.openqa.selenium.WebDriver;

public class googlePage extends basePage{
    public googlePage() {
        super(driver);
    }
    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }
}
