package wag;

import org.junit.Assert;
import org.junit.Test;

public class BecomeAWalkerNegativeTest extends BaseTest {

    @Test
    public void TestBecomeAWalkerNegative() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        BecomeAWalker becomeAWalker = homePage.clickBecomeAWalkerButton();

        becomeAWalker.clickApplyButton();

        String firstNameError = becomeAWalker.getRequredFirstName();

        Assert.assertEquals("First name cannot be blank", firstNameError);

        String lastNameError = becomeAWalker.getRequiredLastName();

        Assert.assertEquals("Last name cannot be blank", lastNameError);

        String emailError = becomeAWalker.getRequiredEmail();

        Assert.assertEquals("Enter a valid email address", emailError);

        String phoneError = becomeAWalker.getRequiredPhone();

        Assert.assertEquals("Enter a valid phone number", phoneError);
    }
}
