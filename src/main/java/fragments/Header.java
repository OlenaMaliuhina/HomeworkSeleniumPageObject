package fragments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    public static final By HEADER_LOGO = By.xpath("//*[@class='navbar-main-item-logo pb-1']");
private WebDriver driver;
public Header(){
    this.driver = driver;

}
     public String getText() {
        return driver.findElement(HEADER_LOGO).getText();
    }
}