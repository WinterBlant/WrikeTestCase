package Steps;

import Pages.QAPage;
import io.qameta.allure.Step;
import static org.junit.Assert.*;

public class SuccessPageSteps {
    private QAPage success;

    public SuccessPageSteps(QAPage success){
        this.success = success;
    }

    @Step
    public void answerQA() throws InterruptedException {
        this.success.answerQuestions();
        assertTrue(this.success.answersSubmitted());
    }

    @Step
    public void lookForTwitter(){
        assertTrue(this.success.findTwitter());
    }
}