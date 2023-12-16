package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.HomePage.MENU_ITEM;

public class BasePage {
    private WebDriver driver;


    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public void clickMenuItem(){
        driver.findElement(MENU_ITEM).click();
    }

    public void FindElementByText () {
}


}