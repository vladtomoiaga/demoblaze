package cart;

import org.testng.annotations.Test;
import pages.CartPage;
import util.BaseTests;

import static org.testng.Assert.*;

public class CartTests extends BaseTests {
    @Test
    public void testSuccessfulPurchase() {
        CartPage cart = homePage.clickCart();

        // Wait until the Cart window appear
        synchronized (cart) {
            try {
                cart.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Click on the Place Order button
        cart.clickPlaceOrderButton();
        // Fill in Name
        cart.setName("Username");
        // Fill in Country
        cart.setCountry("Romania");
        // Fill in City
        cart.setCity("Cluj");
        // Fill in Credit Card
        cart.setCreditCard("1234 1234 1234 1234");
        // Fill in Month
        cart.setMonth(12);
        // Fill in Year
        cart.setYear(2050);
        // Click on the Purchase button
        cart.clickPurchaseButton();
        assertEquals(driver.switchTo().alert().getText(),"Thank you for your purchase!");
        // Click on the OK button
        cart.clickOkButton();

    }
}
