package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageObject {
    private WebDriverWait waiter;
    private static final String HOME_PAGE = "https://www.wrike.com/";

    @FindBy(xpath = "//div[@class=\"r\"]//button[@class=\"wg-header__free-trial-button wg-btn wg-btn--green\"]")
    private WebElement bGetStarted;

    @FindBy(xpath = "//label[@class=\"modal-form-trial__label\"]//input[@name=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//label[@class=\"modal-form-trial__label\"]//button[@class=\"wg-btn wg-btn--blue modal-form-trial__submit\"]")
    private WebElement bRedirect;

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get(HOME_PAGE);
        waiter = new WebDriverWait(driver, 10);
        waiter.until(ExpectedConditions.visibilityOf(bGetStarted));
}

    public void bClick(){
        this.bGetStarted.click();
    }

    public QAPage inputEmail(String email) throws InterruptedException {
        waiter.until(ExpectedConditions.visibilityOf(bRedirect));
        this.email.sendKeys(email);
        this.bRedirect.click();
        return new QAPage(getDriver());
    }
}
