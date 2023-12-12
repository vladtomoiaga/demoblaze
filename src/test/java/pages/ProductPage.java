package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    private By image = By.cssSelector("div#imgp  img");
    private By productName = By.cssSelector("div#tbodyid > .name");
    private By productPrice = By.cssSelector("div#tbodyid > .price-container");
    private By productDescriptionTitle = By.cssSelector("div#more-information > strong");
    private By productDescriptionText = By.cssSelector("div#more-information > p");
    private By addToCartButton = By.cssSelector(".btn.btn-lg.btn-success");

    /** This method click on the Add to cart button */
    public ProductPage clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
        return new ProductPage(driver);
    }

}
