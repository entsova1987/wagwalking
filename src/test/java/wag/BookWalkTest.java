package wag;

import org.junit.Test;

public class BookWalkTest extends BaseTest {

    @Test
    public void testBookWalk() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookWalkButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmail(user.getEmail());

        applyPage.inputPassword(user.getPassword());

        applyPage.inputFirstName(user.getFirstName());

        applyPage.inputLasName(user.getLastName());

        applyPage.inputCellPhoneField(user.getPhone());
    }
}
