package pages;

import org.openqa.selenium.WebDriver;

public class TestSandBox extends basePage{
    private String solucionesDropdown="//tbody/tr[11]/td[2]/select[1]";
   // private String solucionesDropdown="//body/nav[@id='site-navigation']/div[1]/div[2]/ul[1]/li[1]/a[1]/span[1]/span[1]";
    public TestSandBox() {
        super(driver);
    }
    public void navigateToSandbox(){
        navigateTo("https://demo.guru99.com/test/newtours/register.php");
    }
    public void selectCategoriaSoluciones(String Category){
        selectFromDropdownByValue(solucionesDropdown,Category);
    }
}
