package wag;

import org.junit.Test;

public class BookWalkTest extends BaseTest {

    @Test
    public void testBookWalk() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookWalkButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmail();

        applyPage.inputPassword();

        applyPage.inputFirstName();

        applyPage.inputLasName();

        applyPage.inputCellPhoneField();







    }





}
