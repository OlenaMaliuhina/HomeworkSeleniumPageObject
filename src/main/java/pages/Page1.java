package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1{
    private static final By CHECK_BOX1 = By.xpath("//label[text()='Milka']");
    private final By CHECK_BOX2 = By.xpath("//label[text()='Конфеты']");
    private static final By ACCEPT_COOKIES_BUTTON  = By.id("js_set_gdpr_cookie");
    private static final By DROPDOWN = By.xpath( "//*[@class='button region-tag js-region js-region-title']");

    private static final By DROPDOWN_ITEM = By.xpath("//*[contains(text(),'Харьковская область')]");

    private static WebDriver driver;
    public Page1(WebDriver driver){
        this.driver = driver;
    }

    public static void clickCheckBox1(){
        driver.findElement(CHECK_BOX1).click();
    }
    public void clickCheckBox2(){
        driver.findElement(CHECK_BOX2).click();
    }
    public void testAcceptCookiesButton(){
        driver.findElement(ACCEPT_COOKIES_BUTTON).click();
    }
        public void clickDropdown(){
            driver.findElement(DROPDOWN).click();
    }
    public void clickDropdownItem(){
        driver.findElement(DROPDOWN_ITEM).click();
    }

}
