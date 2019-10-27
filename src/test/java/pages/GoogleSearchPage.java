package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private static WebElement element = null;
    private static WebDriver driver = null;

    public GoogleSearchPage(WebDriver webDriver) {
        driver = webDriver;
    }

    public  WebElement textbox_search() {
        element = driver.findElement(By.name("q"));
        return element;

    }

    public  WebElement button_search(){
        element = driver.findElement(By.name("btnK"));
        return element;
    }
}
