package pages;
import fragments.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    static final By MENU_ITEM = By.xpath("/html/body/div[1]/header/section/div/div/ul/li[1]/a");private static final By TEXT_BOX  = By.id("item-0");
    private static final By ACCEPT_COOKIES_BUTTON  = By.id("js_set_gdpr_cookie");
    public static final By HEADER_LOGO = By.xpath("//*[@class='navbar-main-item-logo pb-1']");
    private static final By CHECK_BOX = By.id("item-1");

   // private Header header;
    private WebDriver driver;
      public HomePage(WebDriver driver){
        this.driver = driver;

      }
public String getText(){
     return driver.findElement(TEXT_BOX).getText();
}
    public void clickCheckBox(){
        driver.findElement(CHECK_BOX).click();
    }
    public void clickMenuItem(){
        driver.findElement(MENU_ITEM).click();
    }

    public void testAcceptCookiesButton(){
        driver.findElement(ACCEPT_COOKIES_BUTTON).click();
    }
 public void headerLogo(){
         driver.findElement(HEADER_LOGO).isDisplayed();
 }
}
