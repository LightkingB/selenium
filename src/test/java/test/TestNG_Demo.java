package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
    private WebDriver driver = null;

    @BeforeTest
    public void setUpTest() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void yandexSearch() throws InterruptedException {
        driver.get("https://yandex.ru/");
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys("Java selenium cucumber");
        driver.findElement(By.xpath("//div[@class='search2__button']")).click();
        driver.findElement(By.xpath("//div[@class='search2__button']"));
        // driver.findElement(By.xpath("//div[@class='search2__button']")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);

    }

    @AfterTest
    public void tearDownTest(){
        driver.close();
        driver.quit();
        System.out.println("Test completed successfully");
    }
}
