package cartPage;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import util.BaseTests;

import static org.testng.Assert.*;
import static util.UtilsValues.*;

public class MonthTests extends BaseTests {

    @Test
    public void testSuccessfulMonthLow() {
        // Click on the Home button
        homePage.clickHome();
        // Click on the Phone button
        HomePage phones = homePage.clickPhones();
        // Wait until the Phones are loaded
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Define and initialize the variable indexOfTheProduct
        int indexOfTheProduct = 2;
        // Define and initialize the variable product name from HomePage
        String productNameHomePage = phones.getProductName(indexOfTheProduct);
        // Define and initialize the variable product price from HomePage
        String productPriceHomePage = phones.getProductPrice(indexOfTheProduct);
        // Define and initialize the variable product description from HomePage
        String productDescriptionHomePage = phones.getProductDescription(indexOfTheProduct);
        // Click on the product with the define index
        phones.clickOnTheProductByText(productNameHomePage);
        // Wait until the ProductPage with the select product is displayed
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Create the object productPage
        ProductPage productPage = new ProductPage(driver);
        // Define and initialize the variable product name from ProductPage
        String productNameProductPage = productPage.getProductName();
        // Define and initialize the variable product price from ProductPage
        String productPriceProductPage = productPage.getProductPrice();
        // Verify if the product has the same name on the HomePage and on the ProductPage
        assertEquals(productPage.getProductName(), productNameHomePage);
        // Verify if the product has the same price on the HomePage and on the ProductPage
        assertEquals(productPage.getProductPrice(), productPriceHomePage);
        // Verify if the description of the product from HomePage is contained in the description of the product from the ProductPage
        assertTrue(productPage.getProductDescription().contains(productDescriptionHomePage));
        // Click on the Add to Cart button
        productPage.clickAddToCartButton();
        // Wait until an alert message is displayed
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the alert button
        homePage.acceptAlert();
        // Click on the Cart button
        homePage.clickCart();
        // Wait until the CartPage is loaded
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Create the object cartPage
        CartPage cartPage = new CartPage(driver);
        // Define and initialize the variable indexOfTheProductInTheCart
        int indexOfTheProductInTheCart = 0;
        // Verify if the product has the same name on the CartPage and on the ProductPage
        assertEquals(cartPage.getProductName(indexOfTheProductInTheCart),productNameProductPage);
        // Verify if the product has the same price on the CartPage and on the ProductPage
        assertEquals(cartPage.getProductPrice(indexOfTheProductInTheCart),productPriceProductPage);
        // Wait until the Cart window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Place Order button
        cartPage.clickPlaceOrderButton();
        // Wait until the Place order window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Name
        cartPage.setName(NAME);
        // Verify if a valid name is set
        assertTrue(nameBoolean(NAME), "Enter a valid name");
        // Fill in Country
        cartPage.setCountry(COUNTRY);
        // Verify if a valid country is set
        assertTrue(countryBoolean(COUNTRY), "Enter a valid country");
        // Fill in City
        cartPage.setCity(CITY);
        // Verify if a valid city is set
        assertTrue(cityBoolean(CITY), "Enter a valid city");
        // Fill in Credit Card
        cartPage.setCreditCard(CREDIT_CARD_NUMBER);
        // Verify if the length of the card is 16
        assertEquals(String.valueOf(CREDIT_CARD_NUMBER).length(), 16);
        // Fill in Month
        cartPage.setMonth(INVALID_MONTH_LOW_LIMIT);
        // Verify if the month is smaller than 1
        assertFalse(monthBoolean(INVALID_MONTH_LOW_LIMIT), "A valid month was entered");
        // Click on the Close button
        cartPage.clickCloseButton();
        // Click on the Delete button
        cartPage.clickDeleteButton(indexOfTheProductInTheCart);
        // Click on the Home button
        homePage.clickHome();
    }

    @Test
    public void testSuccessfulMonthTop() {
        // Click on the Home button
        homePage.clickHome();
        // Click on the Phone button
        HomePage phones = homePage.clickPhones();
        // Wait until the Phones are loaded
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Define and initialize the variable indexOfTheProduct
        int indexOfTheProduct = 2;
        // Define and initialize the variable product name from HomePage
        String productNameHomePage = phones.getProductName(indexOfTheProduct);
        // Define and initialize the variable product price from HomePage
        String productPriceHomePage = phones.getProductPrice(indexOfTheProduct);
        // Define and initialize the variable product description from HomePage
        String productDescriptionHomePage = phones.getProductDescription(indexOfTheProduct);
        // Click on the product with the define index
        phones.clickOnTheProductByText(productNameHomePage);
        // Wait until the ProductPage with the select product is displayed
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Create the object productPage
        ProductPage productPage = new ProductPage(driver);
        // Define and initialize the variable product name from ProductPage
        String productNameProductPage = productPage.getProductName();
        // Define and initialize the variable product price from ProductPage
        String productPriceProductPage = productPage.getProductPrice();
        // Verify if the product has the same name on the HomePage and on the ProductPage
        assertEquals(productPage.getProductName(), productNameHomePage);
        // Verify if the product has the same price on the HomePage and on the ProductPage
        assertEquals(productPage.getProductPrice(), productPriceHomePage);
        // Verify if the description of the product from HomePage is contained in the description of the product from the ProductPage
        assertTrue(productPage.getProductDescription().contains(productDescriptionHomePage));
        // Click on the Add to Cart button
        productPage.clickAddToCartButton();
        // Wait until an alert message is displayed
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the alert button
        homePage.acceptAlert();
        // Click on the Cart button
        homePage.clickCart();
        // Wait until the CartPage is loaded
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Create the object cartPage
        CartPage cartPage = new CartPage(driver);
        // Define and initialize the variable indexOfTheProductInTheCart
        int indexOfTheProductInTheCart = 0;
        // Verify if the product has the same name on the CartPage and on the ProductPage
        assertEquals(cartPage.getProductName(indexOfTheProductInTheCart),productNameProductPage);
        // Verify if the product has the same price on the CartPage and on the ProductPage
        assertEquals(cartPage.getProductPrice(indexOfTheProductInTheCart),productPriceProductPage);
        // Wait until the Cart window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Place Order button
        cartPage.clickPlaceOrderButton();
        // Wait until the Place order window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Name
        cartPage.setName(NAME);
        // Verify if a valid name is set
        assertTrue(nameBoolean(NAME), "Enter a valid name");
        // Fill in Country
        cartPage.setCountry(COUNTRY);
        // Verify if a valid country is set
        assertTrue(countryBoolean(COUNTRY), "Enter a valid country");
        // Fill in City
        cartPage.setCity(CITY);
        // Verify if a valid city is set
        assertTrue(cityBoolean(CITY), "Enter a valid city");
        // Fill in Credit Card
        cartPage.setCreditCard(CREDIT_CARD_NUMBER);
        // Verify if the length of the card is 16
        assertEquals(String.valueOf(CREDIT_CARD_NUMBER).length(), 16);
        // Fill in Month
        cartPage.setMonth(INVALID_MONTH_TOP_LIMIT);
        // Verify if the month is bigger than 12
        assertFalse(monthBoolean(INVALID_MONTH_TOP_LIMIT), "A valid month was entered");
        // Click on the Close button
        cartPage.clickCloseButton();
        // Click on the Delete button
        cartPage.clickDeleteButton(indexOfTheProductInTheCart);
        // Click on the Home button
        homePage.clickHome();
    }
}