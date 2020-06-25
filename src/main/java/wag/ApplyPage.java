package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = "input[type=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[type=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[name=\"phone\"]")
    private WebElement cellPhoneField;





    public void inputEmail() {
        emailField.sendKeys("entsova@gmail.com");
    }

    public void inputPassword() {
        passwordField.sendKeys("ABC123");
    }

    public void inputFirstName() {
        firstNameField.sendKeys("John");
    }

    public void inputLasName() {
        lastNameField.sendKeys("Smith");
    }

    public void inputCellPhoneField() {
        cellPhoneField.sendKeys("123-456-7890");
    }






}
