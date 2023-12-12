package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the Cart page
    private By productsText = By.cssSelector(".col-lg-8 > h2");
    private By totalText = By.cssSelector(".col-lg-1 > h2");
    private By picText = By.cssSelector("tr > th:nth-of-type(1)");
    private By titleText = By.cssSelector("tr > th:nth-of-type(2)");
    private By priceText = By.cssSelector("tr > th:nth-of-type(3)");
    private By deleteText = By.cssSelector("tr > th:nth-of-type(4)");
    private By priceTotal = By.id("totalp");
    private By deleteButton = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(4) > a");
    private By placeOrderButton = By.cssSelector(".btn.btn-success");
    private By placeOrderText = By.cssSelector("h5#orderModalLabel");
    private By closeSymbolButton = By.cssSelector("div#orderModal > div[role='document'] span");
    private By totalSumText = By.cssSelector("label#totalm");
    private By nameText = By.cssSelector("div#orderModal > div[role='document'] form > div:nth-of-type(1) > .form-control-label");
    private By nameField = By.cssSelector("input#name");
    private By countryText = By.cssSelector("div#orderModal > div[role='document'] form > div:nth-of-type(2) > .form-control-label");
    private By countryField = By.id("country");
    private By cityText = By.cssSelector("div#orderModal > div[role='document'] form > div:nth-of-type(3) > .form-control-label");
    private By cityField = By.id("city");
    private By creditCardText = By.cssSelector("div:nth-of-type(4) > .form-control-label");
    private By creditCardField = By.id("card");
    private By monthText = By.cssSelector("div:nth-of-type(5) > .form-control-label");
    private By monthField = By.id("month");
    private By yearText = By.cssSelector("div:nth-of-type(6) > .form-control-label");
    private By yearField = By.id("year");
    private By closeButton = By.cssSelector("div#orderModal > div[role='document'] .btn.btn-secondary");
    private By purchaseButton = By.cssSelector("div#orderModal > div[role='document'] .btn.btn-primary");
    private By successfulMessage = By.cssSelector(".showSweetAlert.sweet-alert.visible > h2");
    private By purchaseDetails = By.cssSelector(".showSweetAlert.sweet-alert.visible > .lead.text-muted");
    private By okButton = By.cssSelector(".btn.btn-lg.btn-primary.confirm");

    /** This method click on the Place Order button */
    public CartPage clickPlaceOrderButton() {
        driver.findElement(placeOrderButton).click();
        return new CartPage(driver);
    }

    /** This method populate the Name field */
    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    /** This method populate the Country field */
    public void setCountry(String country) {
        driver.findElement(countryField).sendKeys(country);
    }

    /** This method populate the City field */
    public void setCity(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    /** This method populate the Credit Card field */
    public void setCreditCard(String creditCardNumber) {
        driver.findElement(creditCardField).sendKeys(creditCardNumber);
    }

    /** This method populate the Month field */
    public void setMonth(int month) {
        driver.findElement(monthField).sendKeys(String.valueOf(month));
    }

    /** This method populate the Year field */
    public void setYear(int year) {
        driver.findElement(monthField).sendKeys(String.valueOf(year));
    }

    /** This method click on the Close symbol button */
    public HomePage clickCloseSymbolButton() {
        driver.findElement(closeSymbolButton).click();
        return new HomePage(driver);
    }

    /** This method click pe Close button */
    public HomePage clickCloseButton() {
        driver.findElement(closeButton).click();
        return new HomePage(driver);
    }

    /** This method click on the Purchase button */
    public CartPage clickPurchaseButton() {
        driver.findElement(purchaseButton).click();
        return new CartPage(driver);
    }

    /** This method click on the OK button */
    public HomePage clickOkButton() {
        driver.findElement(okButton).click();
        return new HomePage(driver);
    }

}
