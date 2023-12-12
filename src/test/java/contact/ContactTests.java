package contact;

import org.testng.annotations.*;
import pages.ContactPage;
import util.BaseTests;

import static org.testng.Assert.*;

public class ContactTests extends BaseTests {



    @Test
    public void testSuccessfulContactMessage() {
        ContactPage contactMessage = homePage.clickContact();

        // Wait until the Contact window appear
        synchronized (contactMessage) {
            try {
                contactMessage.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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

        driver.switchTo().alert().accept();
        assertTrue(homePage.getAlertContact().contains("Contact"),"The message was not send.");
    }
}
