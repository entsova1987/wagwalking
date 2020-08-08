package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BecomeAWalker extends BasePage {

    public BecomeAWalker(WebDriver driver) {
        super(driver);
    }



    @FindBy(css ="input[id=\"first_name\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[id=\"last_name\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[id=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[id=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = "input[id=\"address__line-one\"]")
    private WebElement addressField;

    @FindBy(css = "input[id=\"address_line_2\"]")
    private WebElement aptField;

    @FindBy(css = ".button-text-wrapper")
    private WebElement applyButton;

    @FindBy(css = ".error-message")
    private List<WebElement> errorMessages;




    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPhone(String phone) {
        phoneField.sendKeys(phone);
    }

    public void inputAddress(String address) {
        addressField.sendKeys(address);
    }

    public void inputApt(String apt) {
        aptField.sendKeys(apt);
    }

    public void clickApplyButton() {
        wait.until(ExpectedConditions.elementToBeClickable(applyButton));
        applyButton.click();
    }

    public String getRequredFirstName() {
        wait.until(ExpectedConditions.visibilityOf(errorMessages.get(0)));
        String result = errorMessages.get(0).getText();
        return result;
    }

    public String getRequiredLastName() {
        wait.until(ExpectedConditions.visibilityOf(errorMessages.get(1)));
        String result = errorMessages.get(1).getText();
        return result;
    }

    public String getRequiredEmail() {
        String result = errorMessages.get(2).getText();
        return result;
    }

    public String getRequiredPhone() {
        String result = errorMessages.get(3).getText();
        return result;
    }
}
