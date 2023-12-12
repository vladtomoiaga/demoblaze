package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    private WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the Contact page
    private By newMessageText = By.id("exampleModalLabel");
    private By closeSymbolButton = By.cssSelector("div#exampleModal > div[role='document'] span");
    private By contactEmailText = By.cssSelector("div#exampleModal > div[role='document'] form > div:nth-of-type(1) > .form-control-label");
    private By contactEmailField = By.cssSelector("input#recipient-email");
    private By contactNameText = By.cssSelector("div#exampleModal > div[role='document'] form > div:nth-of-type(2) > .form-control-label");
    private By contactNameField = By.cssSelector("input#recipient-name");
    private By messageText = By.cssSelector("div#exampleModal > div[role='document'] form > div:nth-of-type(3) > .form-control-label");
    private By messageField = By.cssSelector("textarea#message-text");
    private By closeButton = By.cssSelector("div#exampleModal > div[role='document'] .btn.btn-secondary");
    private By sendMessageButton = By.cssSelector("div#exampleModal > div[role='document'] .btn.btn-primary");

    /** This method populate the Contact Email field */
    public void setContactEmail(String email) {
        driver.findElement(contactEmailField).sendKeys(email);
    }

    /** This method populate the Contact Name field */
    public void setContactName(String name) {
        driver.findElement(contactNameField).sendKeys(name);
    }

    /** This method populate the Message field */
    public void setMessage(String message) {
        driver.findElement(messageField).sendKeys(message);
    }


    /** This method click on the Close symbol button */
    public HomePage clickCloseSymbolButton() {
        driver.findElement(closeSymbolButton).click();
        return new HomePage(driver);
    }

    /** This method click on the Close button */
    public HomePage clickCloseButton() {
        driver.findElement(closeButton).click();
        return new HomePage(driver);
    }

    /** This method click on the Send message button */
    public HomePage clickSendMessageButton() {
        driver.findElement(sendMessageButton).click();
        return new HomePage(driver);
    }
}
