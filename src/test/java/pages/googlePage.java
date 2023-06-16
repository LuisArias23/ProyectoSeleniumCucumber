package pages;

import org.openqa.selenium.WebDriver;

public class googlePage extends basePage{
    private String searchButton="//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]";
    private String searchText="//textarea[@id='APjFqb']";
    public googlePage() {
        super(driver);
    }
    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }
    public void clickGoogleSearch(){
     ClickElement(searchButton);
    }

    public void enterSearch(String criteria) {
    Write(searchText,criteria);
    }
}
