package wag;

import org.junit.Assert;
import org.junit.Test;

public class RequiredFieldTest extends BaseTest {

    @Test
    public void testRequiredField() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookWalkButton();

        Thread.sleep(5000);

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.clickEmailField();

        applyPage.clickPasswordField();

        applyPage.clickFirstNameField();

        applyPage.clickLastNameField();

        applyPage.clickCellPhoneField();

        applyPage.clickEmailField();

        String emailError = applyPage.getRequiredEmail();

        Assert.assertEquals("required", emailError);

        String firstNameError = applyPage.getFirstNameError();

        Assert.assertEquals("required", firstNameError);

        String lastNameError = applyPage.getLastNameError();

        Assert.assertEquals("required", lastNameError);

        String cellPhoneError = applyPage.getCellPhoneError();

        Assert.assertEquals("required", cellPhoneError);
    }
}
