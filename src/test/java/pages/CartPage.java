package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import java.util.List;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the Cart page
    private By productsText = By.linkText("Products");
    private By totalText = By.linkText("Total");
    private By picText = By.cssSelector("Pic");
    private By titleText = By.cssSelector("Title");
    private By priceText = By.cssSelector("Price");
    private By deleteText = By.cssSelector("x");
    private By priceTotal = By.id("totalp");
    private By deleteButton = By.linkText("Delete");
    private By placeOrderButton = By.cssSelector(".btn.btn-success");
    private By productName = By.cssSelector(".success td:nth-of-type(2)"); //need to be more general
    private By productPrice = By.cssSelector(".success td:nth-of-type(3)"); //need to be specified
    private By placeOrderText = By.cssSelector("h5#orderModalLabel");
    private By closeSymbolButton = By.cssSelector("div#orderModal > div[role='document'] span");
    private By totalSumText = By.cssSelector("label#totalm");
    private By nameText = By.linkText("Name:");
    private By nameField = By.id("name");
    private By countryText = By.linkText("Country:");
    private By countryField = By.id("country");
    private By cityText = By.linkText("City:");
    private By cityField = By.id("city");
    private By creditCardText = By.linkText("Credit card:");
    private By creditCardField = By.id("card");
    private By monthText = By.linkText("Month:");
    private By monthField = By.id("month");
    private By yearText = By.linkText("Year:");
    private By yearField = By.id("year");
    private By closeButton = By.cssSelector("div#orderModal > div[role='document'] .btn.btn-secondary");
    private By purchaseButton = By.cssSelector("div#orderModal > div[role='document'] .btn.btn-primary");
    private By successfulMessage = By.cssSelector("body [tabindex] h2");
    private By purchaseDetails = By.cssSelector(".text-muted");
    private By okButton = By.cssSelector("[tabindex='1']");

    /** This method return the name of the product */
    public String getProductName(int index) {
        List<WebElement> products = driver.findElements(productName);
        if (index >= 0 && index < products.size()) {
            WebElement productToBuy = products.get(index);
            return productToBuy.getText();
        } else {
            System.out.println("Enter a correct number");
            return "";
        }
    }

    /** This method return the price of the product */
    public String getProductPrice(int index) {
        List<WebElement> products = driver.findElements(productPrice);
        if (index >= 0 && index < products.size()) {
            WebElement productToBuy = products.get(index);
            return productToBuy.getText();
        } else {
            System.out.println("Enter a correct number");
            return "";
        }
    }

    /** This method click on the Place Order button */
    public CartPage clickPlaceOrderButton() {
        driver.findElement(placeOrderButton).click();
        return new CartPage(driver);
    }

    public CartPage clickDeleteButton(int index) {
//        List<WebElement> productsInTheCart = driver.findElements(deleteButton);
//        if (index >= 0 && index < productsInTheCart.size()) {
//            WebElement deleteElement = driver.findElements(deleteButton).get(index);
//            deleteElement.click();
//        } else {
//            System.out.println("Enter a correct number");
//        }
        driver.findElement(deleteButton).click();
        return new CartPage(driver);
    }

    /** This method populate the Name field */
    public void setName(String name) {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);
    }

    /** This method populate the Country field */
    public void setCountry(String country) {
        driver.findElement(countryField).clear();
        driver.findElement(countryField).sendKeys(country);
    }

    /** This method populate the City field */
    public void setCity(String city) {
        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(city);
    }

    /** This method populate the Credit Card field */
    public void setCreditCard(long creditCardNumber) {
        driver.findElement(creditCardField).clear();
        driver.findElement(creditCardField).sendKeys(String.valueOf(creditCardNumber));
    }

    /** This method populate the Month field */
    public void setMonth(int month) {
        driver.findElement(monthField).clear();
        driver.findElement(monthField).sendKeys(Integer.toString(month));
    }

    /** This method populate the Year field */
    public void setYear(int year) {
        driver.findElement(yearField).clear();
        driver.findElement(yearField).sendKeys(Integer.toString(year));
    }

    /** This method populate all the Credit Card fields */
    public void setAllCreditCardFields(long creditCardNumber, int month, int year) {
        setCreditCard(creditCardNumber);
        setMonth(month);
        setYear(year);
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

    /** This method return the message from the purchase */
    public String getSuccessfulMessage() {
        return driver.findElement(successfulMessage).getText();
    }

    // Getters

    public By getNameText() {
        return nameText;
    }

    public By getCreditCardField() {
        return creditCardField;
    }
}
