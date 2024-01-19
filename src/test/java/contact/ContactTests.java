package contact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.ContactPage;
import util.BaseTests;

import static org.testng.Assert.*;

public class ContactTests extends BaseTests {

    @Test
    public void testSuccessfulContactMessage() {
        ContactPage contactMessage = homePage.clickContact();
        // Wait until the Contact window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Contact Email
        contactMessage.setContactEmail("usernamedemoblaze@gmail.com");
        // Fill in Contact Name
        contactMessage.setContactName("Username");
        // Fill in Message
        contactMessage.setMessage("This is a test.");
        // Click on the Send message button
        contactMessage.clickSendMessageButton();
        assertEquals(driver.switchTo().alert().getText(), "Thanks for the message!!");
        // Click on the Ok button
        homePage.acceptAlert();
    }

    @Test
    public void testCloseButton() {
        ContactPage contactPage = homePage.clickContact();
        // Wait until the Contact window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contactPage.clickCloseButton();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the Contact button is visible
        assertTrue(driver.findElement(homePage.getContactButton()).isDisplayed(), "Button is not displayed."); // not working well
    }
}