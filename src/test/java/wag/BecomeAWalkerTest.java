package wag;

import org.junit.Test;

public class BecomeAWalkerTest extends BaseTest {

    @Test
    public void TestBecomeAWalker() throws InterruptedException {

        HomePage homePage = new HomePage(driver);

        homePage.clickBecomeAWalkerButton();

        Thread.sleep(5000);

        BecomeAWalker becomeAWalker = new BecomeAWalker(driver);

        becomeAWalker.inputFirstName("John");

        becomeAWalker.inputLastName("Smith");

        becomeAWalker.inputEmail("JohnS@gmail.com");

        becomeAWalker.inputPhone("123-456-7890");

        becomeAWalker.inputAddress("2315 Via Francisca, Los Angeles");

        becomeAWalker.inputApt("18");
    }
}
