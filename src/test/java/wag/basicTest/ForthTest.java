package wag.basicTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import wag.BaseTest;

public class ForthTest extends BaseTest {

    @Test
    public void testForth() throws InterruptedException {

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookWalkButton.click();

        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.sendKeys("dry4657hgj");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".sc-bdVaJa.sc-bxivhb.laYMsi"));

        String actualResult = errorMessage.getText();

        String expectedResult = "please provide a valid email";

        Assert.assertEquals(expectedResult, actualResult);

        System.out.println(actualResult);
    }
}
