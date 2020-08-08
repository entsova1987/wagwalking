package wag.basicTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import wag.BaseTest;

import java.util.List;

public class FifthTest extends BaseTest {

    @Test
    public void TestFifth() throws InterruptedException {

        List<WebElement> login = driver.findElements(By.cssSelector(".sc-bxivhb.lonzbf"));

        login.get(2).click();

        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.sendKeys("ryudh@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.sendKeys("ABC123");

        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        loginButton.click();

        Thread.sleep(2000);

        WebElement errorField = driver.findElement(By.cssSelector(".WagLoginForm_alert__1AnhH.bootstrap_alert__micD4." +
                "bootstrap_alert-warning__3CyDn"));

        String actualResult = errorField.getText();

        String expectedResult = "Authentication Failed";

        Assert.assertEquals(actualResult, expectedResult);
    }
}
