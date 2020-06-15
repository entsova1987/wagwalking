package wag;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SixthTest extends BaseTest{

    @Test
    public void testSixth() throws InterruptedException {

        List<WebElement> login = driver.findElements(By.cssSelector(".sc-bxivhb.lonzbf"));

        login.get(2).click();

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-secondary.btn-block"));

        loginButton.click();

        List<WebElement> requiredFields = driver.findElements(By.cssSelector(".invalid-feedback.d-block"));

        String emailError = requiredFields.get(0).getText();

        String passwordError = requiredFields.get(1).getText();

        String expectedResult = "Required";

        Assert.assertEquals(expectedResult, emailError);

        Assert.assertEquals(expectedResult, passwordError);











    }






}
