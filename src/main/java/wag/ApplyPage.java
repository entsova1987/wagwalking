package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(css = ".sc-bdVaJa.sc-bxivhb.laYMsi")
    private List<WebElement> requiredFields;

    @FindBy(css = ".sc-bdVaJa.sc-bxivhb.cGxaMp")
    private WebElement provideAValidEmail;



    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void inputLasName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputCellPhoneField(String phone) {
        cellPhoneField.sendKeys(phone);
    }


    public void clickEmailField() {
        emailField.click();
    }

    public void clickPasswordField() {
        passwordField.click();
    }

    public void clickFirstNameField() {
        firstNameField.click();
    }

    public void clickLastNameField() {
        lastNameField.click();
    }

    public void clickCellPhoneField() {
        cellPhoneField.click();
    }

    public String getRequiredEmail() {
        String result = requiredFields.get(0).getText();
        return result;
    }

    public String getFirstNameError() {
        String result = requiredFields.get(1).getText();
        return result;
    }

    public String getLastNameError() {
        String result = requiredFields.get(2).getText();
        return result;
    }

    public String getCellPhoneError() {
        String result = requiredFields.get(3).getText();
        return result;
    }


    public String provideAValidEmail() {
        String result = provideAValidEmail.getText();
        return result;
    }
}
