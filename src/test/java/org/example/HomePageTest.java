package org.example;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class HomePageTest {
    private HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void beforeHook(){
         driver = new ChromeDriver();
         homePage = new HomePage(driver);
         driver.get("https://www.kidstaff.com.ua/");
    }
    @Test
    public void firstPageObjectTest(){
        System.setProperty("webdriver.chrome.driver","/Users/omali/IdeaProjects/Homework13/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://www.kidstaff.com.ua/");
         homePage.clickMenuItem();

        try {
         TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException intEx) {
            throw new RuntimeException();
        }
    }

    @Test
    public void acceptCookieTest(){
        System.setProperty("webdriver.chrome.driver","/Users/omali/IdeaProjects/Homework13/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://www.kidstaff.com.ua/");
        homePage.testAcceptCookiesButton();

        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException intEx) {
            throw new RuntimeException();
        }
    }
        @Test
        public void checkHeaderLogo(){
            System.setProperty("webdriver.chrome.driver","/Users/omali/IdeaProjects/Homework13/chromedriver-win64/chromedriver.exe");
            driver = new ChromeDriver();
            homePage = new HomePage(driver);
            driver.get("https://www.kidstaff.com.ua/");
            homePage.headerLogo();

            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException intEx) {
                throw new RuntimeException();
            }
        }

    @AfterMethod
    public void afterHook (){
     driver.quit();
    }

}
