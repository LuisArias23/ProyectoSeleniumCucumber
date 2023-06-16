package pages;

import static pages.basePage.driver;

public class GridPage extends basePage {
    //private String cell="//tr/td[1]/p";
    public GridPage(){
        super(driver);
    }
    public void navigateToGrid(){
        navigateTo("https://www.utest.com.tr/es/25757/Celda-Triaxial");
    }
    public String getValueFromGrid(int row, int column){
        return getValueFromTable(row,column);
    }
}
