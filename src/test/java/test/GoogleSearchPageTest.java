package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.GoogleSearchPage;
import pages.GoogleSearchPageObjects;

import java.security.Key;

public class GoogleSearchPageTest {
    private static WebDriver driver = null;

    private static void registerChromeDriver() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void main(String[] args) throws InterruptedException {
        googleSearchTest();

    }

    public static void googleSearchTest() throws InterruptedException {
        registerChromeDriver();

        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
        Actions action = new Actions(driver);
        driver.get("https://market.yandex.ru");

        driver.findElement(By.xpath("//div[@class='n-w-tab__control-hamburger']")).click();
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//a[@href='/catalog--produkty-napitki/54434']")).sendKeys(Keys.RETURN);
        WebElement elem = driver.findElement(By.xpath("//a[@href='/catalog--tovary-dlia-zhivotnykh/54496']"));
        action.moveToElement(elem).perform();
       /*try {
            Thread.sleep(1000);
            action.build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        driver.findElement(By.xpath("//a[@title='Лакомства']")).sendKeys(Keys.RETURN);
       // driver.findElement(By.xpath("//div[@class='n-w-tabs__tabs-column']//div[11]//a[1]")).sendKeys(Keys.RETURN);

        Thread.sleep(3000);
        //searchPageObj.setTextInSearchBox("Java selenium cucumber");
        //searchPageObj.clickSearchButton();

        driver.close();

    }
}
