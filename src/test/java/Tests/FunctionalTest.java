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
        System.setProperty("webdriver.chrome.driver", "src/test/resources/ChromeDriver/chromedriver.exe");
        // this was necessary for my YandexBrowser
        // uncomment, configure your chrome binary if needed, then initialize ChromeDriver with parameter "options"
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Users/WinterSun/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
