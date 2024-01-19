package UI;

import org.testng.annotations.Test;
import pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import util.BaseTests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class UITests extends BaseTests {

    @Test
    public void testSuccessfulHomeButtonsDisplayed() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the Image from ProductStore is displayed
        assertTrue(driver.findElement(homePage.getbImage()).isDisplayed());
        // Verify if the ProductStore button is displayed
        assertTrue(driver.findElement(homePage.getProductStoreButton()).isDisplayed());
        // Verify if the Navigation Bar Top is displayed
        assertTrue(driver.findElement(homePage.getNavigationBarTop()).isDisplayed());
        // Verify if the Home button is displayed
        assertTrue(driver.findElement(homePage.getHomeButton()).isDisplayed());
        // Verify if the Contact button is displayed
        assertTrue(driver.findElement(homePage.getContactButton()).isDisplayed());
        // Verify if the About us button is displayed
        assertTrue(driver.findElement(homePage.getAboutUsButton()).isDisplayed());
        // Verify if the Cart button is displayed
        assertTrue(driver.findElement(homePage.getCartButton()).isDisplayed());
        // Verify if the Log in button is displayed
        assertTrue(driver.findElement(homePage.getLogInButton()).isDisplayed());
        // Verify if the Log out button is not displayed
        assertFalse(driver.findElement(homePage.getLogOutButton()).isDisplayed());
        // Verify if the Sign up button is displayed
        assertTrue(driver.findElement(homePage.getSignUpButton()).isDisplayed());
        // Verify if the Log out button is not displayed
        assertFalse(driver.findElement(homePage.getWelcomeButton()).isDisplayed());
        // Verify if the Previous Arrow is displayed
        assertTrue(driver.findElement(homePage.getPreviousArrowButton()).isDisplayed());
        // Verify if the Next Arrow is displayed
        assertTrue(driver.findElement(homePage.getNextArrowButton()).isDisplayed());
        // Verify if the Categories button is displayed
        assertTrue(driver.findElement(homePage.getCategoriesButton()).isDisplayed());
        // Verify if the Phones button is displayed
        assertTrue(driver.findElement(homePage.getPhonesButton()).isDisplayed());
        // Verify if the Laptops button is displayed
        assertTrue(driver.findElement(homePage.getLaptopsButton()).isDisplayed());
        // Verify if the Laptops button is displayed
        assertTrue(driver.findElement(homePage.getMonitorsButton()).isDisplayed());
        // Verify if 9 Products are displayed
        HomePage products = new HomePage(driver);
        assertEquals(products.getSizeProductName(), 9);
        // Verify if the Previous button is displayed
        assertTrue(driver.findElement(homePage.getPreviousButton()).isDisplayed());
        // Verify if the Next button is displayed
        assertTrue(driver.findElement(homePage.getNextButton()).isDisplayed());
        // Verify if the Navigation bar bottom is displayed
        assertTrue(driver.findElement(homePage.getNavigationBarBottom()).isDisplayed());
        // Verify if the Copyrights text is displayed
        assertTrue(driver.findElement(homePage.getCopyrightText()).isDisplayed());
    }

    @Test
    public void testSuccessfulContactButtonsDisplayed() {
        ContactPage contactPage = homePage.clickContact();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the New message text is displayed
        assertTrue(driver.findElement(contactPage.getNewMessageText()).isDisplayed());
        // Verify if the Close symbol button is displayed
        assertTrue(driver.findElement(contactPage.getCloseSymbolButton()).isDisplayed());
        // Verify if the Contact Email text is displayed
        assertTrue(driver.findElement(contactPage.getContactEmailText()).isDisplayed());
        // Verify if the Contact Email field is displayed
        assertTrue(driver.findElement(contactPage.getContactEmailField()).isDisplayed());
        // Verify if the Contact Name text is displayed
        assertTrue(driver.findElement(contactPage.getContactNameText()).isDisplayed());
        // Verify if the Contact Name field is displayed
        assertTrue(driver.findElement(contactPage.getContactNameField()).isDisplayed());
        // Verify if the Message text is displayed
        assertTrue(driver.findElement(contactPage.getMessageField()).isDisplayed());
        // Verify if the Message field is displayed
        assertTrue(driver.findElement(contactPage.getMessageText()).isDisplayed());
        // Verify if the Close button is displayed
        assertTrue(driver.findElement(contactPage.getCloseButton()).isDisplayed());
        // Verify if the Send message button is displayed
        assertTrue(driver.findElement(contactPage.getSendMessageButton()).isDisplayed());
        // Click on the Close button
        contactPage.clickCloseButton();
    }

    @Test
    public void testSuccessfulLoginButtonsDisplayed() {
        LoginPage loginPage = homePage.clickLogin();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the Log in text is displayed
        assertTrue(driver.findElement(loginPage.getLogInText()).isDisplayed());
        // Verify if the Close symbol button is displayed
        assertTrue(driver.findElement(loginPage.getCloseSymbolButton()).isDisplayed());
        // Verify if the Username text is displayed
        assertTrue(driver.findElement(loginPage.getUsernameText()).isDisplayed());
        // Verify if the Username field is displayed
        assertTrue(driver.findElement(loginPage.getUsernameField()).isDisplayed());
        // Verify if the Password text is displayed
        assertTrue(driver.findElement(loginPage.getPasswordText()).isDisplayed());
        // Verify if the Password field is displayed
        assertTrue(driver.findElement(loginPage.getPasswordField()).isDisplayed());
        // Verify if the Close button is displayed
        assertTrue(driver.findElement(loginPage.getCloseButton()).isDisplayed());
        // Verify if the Log in button is displayed
        assertTrue(driver.findElement(loginPage.getLogInButton()).isDisplayed());
        // Click on the Close button
        loginPage.clickCloseButton();
    }

    @Test
    public void testSuccessfulSignupButtonsDisplayed() {
        SignupPage signupPage = homePage.clickSignup();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the Log in text is displayed
        assertTrue(driver.findElement(signupPage.getSignUpText()).isDisplayed());
        // Verify if the Close symbol button is displayed
        assertTrue(driver.findElement(signupPage.getCloseSymbolButton()).isDisplayed());
        // Verify if the Username text is displayed
        assertTrue(driver.findElement(signupPage.getUsernameText()).isDisplayed());
        // Verify if the Username field is displayed
        assertTrue(driver.findElement(signupPage.getUsernameField()).isDisplayed());
        // Verify if the Password text is displayed
        assertTrue(driver.findElement(signupPage.getPasswordText()).isDisplayed());
        // Verify if the Password field is displayed
        assertTrue(driver.findElement(signupPage.getPasswordField()).isDisplayed());
        // Verify if the Close button is displayed
        assertTrue(driver.findElement(signupPage.getCloseButton()).isDisplayed());
        // Verify if the Sign up button is displayed
        assertTrue(driver.findElement(signupPage.getSignUpButton()).isDisplayed());
        // Click on the Close button
        signupPage.clickCloseButton();
    }
}
