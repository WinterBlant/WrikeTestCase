package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionalTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Users/WinterSun/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
