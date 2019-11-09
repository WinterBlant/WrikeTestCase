package Pages;

import Utils.Randoms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class QAPage extends PageObject {
    private static final String SUCCESS_URL = "https://www.wrike.com/resend/";

    @FindBy(xpath = "//*[@class=\"survey\"]")
    private WebElement survey;

    @FindBy(xpath = "//*[@class=\"switch__button\"]")
    private List<WebElement> bAnswers;

    @FindBy(xpath = "//*[@class=\"submit wg-btn wg-btn--navy js-survey-submit\"]")
    private WebElement bSubmit;

    @FindBy(xpath = "//*[@class=\"survey-success\"]")
    private WebElement success;

    @FindBy(xpath = "//a[@class=\"wg-footer__social-link\"]")
    private List<WebElement> socialInfo;

    public QAPage(WebDriver driver) throws InterruptedException {
        super(driver);
        Thread.sleep(10000);
    }

    public boolean isInitialized(){
        return getDriver().getCurrentUrl().equals(SUCCESS_URL);
    }

    public boolean answersSubmitted(){
        return success.isDisplayed();
    }

    public void answerQuestions() throws InterruptedException {
        bAnswers.get(Randoms.getRandomNumber(0,1)).click();
        bAnswers.get(Randoms.getRandomNumber(2,6)).click();
        bAnswers.get(Randoms.getRandomNumber(7,8)).click();
        bSubmit.click();
        Thread.sleep(5000);
    }

    public boolean findTwitter(){
        for(WebElement element: socialInfo){
            if(element.getAttribute("href").equals("https://twitter.com/wrike")){
                return element.findElement(By.xpath(".//*[name()=\"use\"]")).getAttribute("xlink:href").contains("twitter");
            }
        }
        return false;
    }
}
