package Tests;

import Steps.EmailSteps;
import Steps.SuccessPageSteps;
import org.junit.*;
public class TestClass extends FunctionalTest {

    @Test
    public void test() throws InterruptedException {
        EmailSteps step1 = new EmailSteps(driver);
        SuccessPageSteps step2 = new SuccessPageSteps(step1.enterEmail());
        step2.answerQA();
        step2.lookForTwitter();
    }
}
