package wag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".sc-bxivhb.dmgvyV")
    private WebElement bookWalkButton;

    @FindBy(css = ".sc-bxivhb.faseOI")
    private WebElement becomeAWalkerButton;

    @FindBy(css = "div.sc-bdVaJa.fyUNwb.sc-iwsKbI.kVsYzb p.sc-bxivhb.jwbbfN")
    private List<WebElement> mainButtons;



    public BecomeAWalker clickBecomeAWalkerButton() {
        wait.until(ExpectedConditions.elementToBeClickable(mainButtons.get(0)));
        mainButtons.get(0).click();
        BecomeAWalker becomeAWalker = new BecomeAWalker(driver);
        return becomeAWalker;
    }


    public void clickBookWalkButton() {
        bookWalkButton.click();
    }
}
