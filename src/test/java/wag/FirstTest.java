package wag;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst() throws InterruptedException {

        System.out.println("Start testFirst");

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookWalkButton.click();

        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.sendKeys("Elena@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.sendKeys("Abc123DEF");

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstNameField.sendKeys("Elena");

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastNameField.sendKeys("Entsova");

        WebElement phoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));

        phoneField.sendKeys("702-886-9000");

//        some changes

//        new test
    }






}
