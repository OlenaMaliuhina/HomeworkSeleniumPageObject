package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.Page1;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Page1Test {
    private Page1 page1;
    private WebDriver driver;

    @Test
    public void checkboxesOnPage1(){
        System.setProperty("webdriver.chrome.driver","/Users/omali/IdeaProjects/Homework13/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        page1 = new Page1(driver);
        driver.get("https://www.kidstaff.com.ua/");

        driver.navigate().to("https://www.kidstaff.com.ua/list-novogodnie-nabory");
       page1.testAcceptCookiesButton();
        page1.clickCheckBox1();
         page1.clickCheckBox2();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException intEx) {
            throw new RuntimeException();
        }

    List<WebElement> goods = driver.findElements(By.xpath("//*[@class='goodscard column border-bottom-dotted is-half-mobile is-one-third-tablet is-one-quarter-desktop']"));
        //int count;
        for (WebElement element : goods){
               if(element.isDisplayed()){
                   System.out.println("element found");
          }
              Assert.assertEquals(goods.size(),7);
             }
    }
    @Test
    public void dropdownOnPage1(){
        System.setProperty("webdriver.chrome.driver","/Users/omali/IdeaProjects/Homework13/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        page1 = new Page1(driver);
        driver.get("https://www.kidstaff.com.ua/list-novogodnie-nabory");
        page1.testAcceptCookiesButton();
        page1.clickDropdown();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        page1.clickDropdownItem();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void afterHook (){
        driver.quit();
    }
}





