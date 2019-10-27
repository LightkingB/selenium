package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_YandexSearch {
    public static void main(String[] args) throws InterruptedException {
        yandexSearch();
    }

    public static void yandexSearch() throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://yandex.ru/");

        driver.findElement(By.xpath("//input[@id='text']")).sendKeys("Java selenium cucumber");
        driver.findElement(By.xpath("//div[@class='search2__button']")).click();
        driver.findElement(By.xpath("//div[@class='search2__button']"));
       // driver.findElement(By.xpath("//div[@class='search2__button']")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
