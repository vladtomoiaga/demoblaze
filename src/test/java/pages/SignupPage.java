package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BaseTests;

public class SignupPage extends BaseTests {
    private WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver=driver;
    }

    // Finding the elements on the Sign up page
    private By signUpText = By.id("signInModalLabel");
    private By closeSymbolButton = By.cssSelector("div#signInModal > div[role='document'] span");
    private By usernameText = By.cssSelector("div#signInModal > div[role='document'] form > div:nth-of-type(1) > .form-control-label");
    private By usernameField = By.id("sign-username");
    private By passwordText = By.cssSelector("div#signInModal > div[role='document'] form > div:nth-of-type(2) > .form-control-label");
    private By passwordField = By.id("sign-password");
    private By closeButton = By.cssSelector("div#signInModal > div[role='document'] .btn.btn-secondary");
    private By signUpButton = By.cssSelector("div#signInModal > div[role='document'] .btn.btn-primary");

    /** This method populate the Username field */
    public void setUsername(String username) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
    }

    /** This method populate the Password field */
    public void setPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }

    /** This method populate the Username and Password fields */
    public void setUsernameAndPassword(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    /** This method populate the Username and Password fields and click on the Sign up  button */
    public void signupSetup(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickSignUpButton();
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

    /** This method click on the Sign up button */
    public HomePage clickSignUpButton() {
        driver.findElement(signUpButton).click();
        return new HomePage(driver);
    }

    // Getters

    public By getSignUpText() {
        return signUpText;
    }

    public By getCloseSymbolButton() {
        return closeSymbolButton;
    }

    public By getUsernameText() {
        return usernameText;
    }

    public By getUsernameField() {
        return usernameField;
    }

    public By getPasswordText() {
        return passwordText;
    }

    public By getPasswordField() {
        return passwordField;
    }

    public By getCloseButton() {
        return closeButton;
    }

    public By getSignUpButton() {
        return signUpButton;
    }
}
