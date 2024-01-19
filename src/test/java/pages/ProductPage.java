package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.BaseTests;

public class ProductPage extends BaseTests {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver=driver;
    }

    private By image = By.cssSelector("div#imgp  img");
    private By productName = By.cssSelector(".name");
    private By productPrice = By.cssSelector(".price-container");
    private By productDescriptionTitle = By.cssSelector("strong");
    private By productDescriptionText = By.cssSelector("#more-information p");
    private By addToCartButton = By.cssSelector(".btn.btn-lg.btn-success");

    /** This method click on the Add to cart button */
    public ProductPage clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
        return new ProductPage(driver);
    }

    /** This method return the name of the product */
    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    /** This method return the name of the product */
    public String getProductDescription() {
        return driver.findElement(productDescriptionText).getText();
    }

    /** This method return the price of the product */
    public String getProductPrice() {
        String productPriceText = driver.findElement(productPrice).getText();
        return productPriceText.substring(1, productPriceText.length() - 14);
    }
}
