import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().version("77.0").setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yandex.ru/");
        driver.findElement(By.xpath("//input[@id='text']")).sendKeys("selenium java cucumber");


        Thread.sleep(3000);
        driver.close();
        driver.quit();

    }
}
