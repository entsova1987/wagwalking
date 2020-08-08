package wag.basicTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import wag.BaseTest;

import java.util.List;

public class SeventhTest extends BaseTest {

    @Test
    public void testSeventh() throws InterruptedException {

        List<WebElement> topButtons = driver.findElements(By.cssSelector(".sc-bxivhb.lonzbf"));

        topButtons.get(2).click();

        Thread.sleep(3000);

        WebElement forgotPasswordLink = driver.findElement(By.cssSelector("a[data-testid=\"forgot-password-link\"]"));

        forgotPasswordLink.click();

        Thread.sleep(3000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.sendKeys("wefdhdj@gmail.com");

        WebElement resetPassword = driver.findElement(By.cssSelector("button"));

        resetPassword.click();

        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.cssSelector(".alert.alert-warning"));

        String expectedResult = errorMessage.getText();

        String actualResult = "There was an error processing your request.";

        Assert.assertEquals(expectedResult, actualResult);

        WebElement backToLogin = driver.findElement(By.cssSelector("a"));

        backToLogin.click();

        WebElement signUpLink = driver.findElement(By.cssSelector("a[data-testid=\"signup-link\"]"));

        signUpLink.click();
    }
}
