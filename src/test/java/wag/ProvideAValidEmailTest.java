package wag;

import org.junit.Assert;
import org.junit.Test;

public class ProvideAValidEmailTest extends BaseTest {

    @Test
    public void TestProvideAValidEmail() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookWalkButton();

        Thread.sleep(5000);

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmail(invalidUser.getEmail());

        applyPage.clickPasswordField();

        String invalidEmailError = applyPage.provideAValidEmail();

        Assert.assertEquals("please provide a valid email", invalidEmailError);

    }
}
