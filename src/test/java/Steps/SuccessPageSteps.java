package Steps;

import Pages.QAPage;
import io.qameta.allure.Step;
import static org.junit.Assert.*;

public class SuccessPageSteps {
    private QAPage success;

    public SuccessPageSteps(QAPage success){
        this.success = success;
    }

    @Step("Randomly answer the questions and submit the answers. Check if answers were submitted.")
    public void answerQA() throws InterruptedException {
        this.success.answerQuestions();
        assertTrue(this.success.answersSubmitted());
    }

    @Step("Look for the twitter link and necessary icon")
    public void lookForTwitter(){
        assertTrue(this.success.findTwitter());
    }
}
