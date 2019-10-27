package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
    private static WebDriver driver = null;

    private static void registerChromeDriver() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }

    public static void main(String[] args) {
        googleSearch();

    }

    public static void googleSearch() {
        registerChromeDriver();
        GoogleSearchPage g = new GoogleSearchPage(driver);

        g.textbox_search().sendKeys("Java selenium cucumber");
        g.button_search().sendKeys(Keys.RETURN);

    }
}
