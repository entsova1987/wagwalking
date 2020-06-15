package wag;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ThirdTest extends BaseTest{

    @Test
    public void thirdTest() throws InterruptedException {

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookWalkButton.click();

        Thread.sleep(5000);

        List<WebElement> fields = driver.findElements(By.cssSelector("input"));

        fields.get(0).click();

        fields.get(1).click();

        fields.get(2).click();

        fields.get(3).click();

        fields.get(4).click();

        fields.get(0).click();

        List<WebElement> requiredFields = driver.findElements(By.cssSelector(".sc-bdVaJa.sc-bxivhb.laYMsi"));

        String emailError = requiredFields.get(0).getText();

        String firstNameError = requiredFields.get(1).getText();

        String lastNameError = requiredFields.get(2).getText();

        String phoneError = requiredFields.get(3).getText();

        String expectedResult = "required";

        Assert.assertEquals(expectedResult, emailError);

        Assert.assertEquals(expectedResult, firstNameError);

        Assert.assertEquals(expectedResult, lastNameError);

        Assert.assertEquals(expectedResult, phoneError);
    }
}
