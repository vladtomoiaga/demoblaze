package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the Log in page
    private By logInText = By.id("logInModalLabel");
    private By closeSymbolButton = By.cssSelector("div#logInModal > div[role='document'] span");
    private By usernameText = By.cssSelector("div#logInModal > div[role='document'] form > div:nth-of-type(1) > .form-control-label");
    private By usernameField = By.id("loginusername");
    private By passwordText = By.cssSelector("div#logInModal > div[role='document'] form > div:nth-of-type(2) > .form-control-label");
    private By passwordField = By.id("loginpassword");
    private By closeButton = By.cssSelector("div#logInModal > div[role='document'] .btn.btn-secondary");
    private By logInButton = By.cssSelector("div#logInModal > div[role='document'] .btn.btn-primary");

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

    /** This method populate the Username and Password fields and click on the Log in button */
    public void loginSetup(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
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

    /** This method click on the Log in button */
    public HomePage clickLoginButton() {
        driver.findElement(logInButton).click();
        return new HomePage(driver);
    }

    // Getters
    public By getLogInText() {
        return logInText;
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

    public By getLogInButton() {
        return logInButton;
    }
}
