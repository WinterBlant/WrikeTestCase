package Steps;

import Pages.HomePage;
import Pages.QAPage;
import Utils.Randoms;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class EmailSteps {
    private HomePage home;
    private final String email = Randoms.getEmail();

    public EmailSteps(WebDriver driver){
        this.home = new HomePage(driver);
    }

    @Step
    public QAPage enterEmail() throws InterruptedException {
        this.home.bClick();
        QAPage success = this.home.inputEmail(email);
        assertTrue(success.isInitialized());
        return success;
    }
}
