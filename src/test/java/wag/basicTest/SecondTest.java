package wag.basicTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import wag.BaseTest;

import java.util.List;

public class SecondTest extends BaseTest {

    @Test
    public void secondTest() throws InterruptedException {

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookWalkButton.click();

        Thread.sleep(5000);

        List<WebElement> fields = driver.findElements(By.cssSelector("input"));

        fields.get(0).sendKeys("elena@gmail.com");

        fields.get(1).sendKeys("ABC123");

        fields.get(2).sendKeys("Anna");

        fields.get(3).sendKeys("Entsova");

        fields.get(4).sendKeys("7028869393");
    }







}
