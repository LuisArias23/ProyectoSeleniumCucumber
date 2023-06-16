package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class basePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public basePage(WebDriver driver) {
        basePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void ClickElement(String locator) {
        Find(locator).click();
    }

    public void Write(String locator, String textToWrite) {
        Find(locator).clear();
        Find(locator).sendKeys(textToWrite);
    }

    public void selectFromDropdownByValue(String locator, String valuetoSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(valuetoSelect);
    }

    public void selectFromDropdownByIndex(String locator, int valuetoSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(valuetoSelect);
    }

    public void selectFromDropdownByText(String locator, String valuetoSelect) {
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(valuetoSelect);
    }

    public void hoverOverElement(String locator) {
        action.moveToElement(Find(locator));
    }

    public void dobleclick(String locator) {
        action.doubleClick(Find(locator));
    }

    public void rigthClick(String locator) {
        action.contextClick(Find(locator));
    }

    public String getValueFromTable( int row, int column) {
        String cellNeed =  "//table/tbody/tr[" + row + "]/td[" + column + "]";
        return Find(cellNeed).getText();
    }
    public void setValueOnTable(int row, int column,String stringToSend){
        String cellToFill= "//table/tbody/tr[" + row + "]/td[" + column + "]";
        Find(cellToFill).sendKeys(stringToSend);
    }
}
