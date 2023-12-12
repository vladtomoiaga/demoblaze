package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BaseTests;

import java.util.Base64;

public class SignupPage extends BaseTests {
    public WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the Sign up page
    private By signUpText = By.id("signInModalLabel");
    private By closeSymbolButton = By.id("div#signInModal > div[role='document'] span");
    private By usernameText = By.cssSelector("div#signInModal > div[role='document'] form > div:nth-of-type(1) > .form-control-label");
    private By usernameField = By.id("sign-username");
    private By passwordText = By.cssSelector("div#signInModal > div[role='document'] form > div:nth-of-type(2) > .form-control-label");
    private By passwordField = By.id("sign-password");
    private By closeButton = By.cssSelector("div#signInModal > div[role='document'] .btn.btn-secondary");
    private By signUpButton = By.cssSelector("div#signInModal > div[role='document'] .btn.btn-primary");

    /** This method populate the Username field */
    public void setUserName(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    /** This method populate the Password field */
    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
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
}
