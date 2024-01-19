package phones;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import util.BaseTests;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class PhonesTests extends BaseTests {

    @Test
    public void testNumberOfPhones() {
        HomePage phones = homePage.clickPhones();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 7 phones
        assertEquals(phones.getSizeProductName(), 7);
        // Create a list with the phones which need to be verified
        ArrayList<String> productsToVerify = new ArrayList<>();
        productsToVerify.add("Samsung galaxy s6");
        productsToVerify.add("Nokia lumia 1520");
        productsToVerify.add("Nexus 6");
        productsToVerify.add("Samsung galaxy s7");
        productsToVerify.add("Iphone 6 32gb");
        productsToVerify.add("Sony xperia z5");
        productsToVerify.add("HTC One M9");
        // Create a list where it can be stored the phones read from the internet webpage
        ArrayList<String> productsReadFromPhones = new ArrayList<>();
        List<WebElement> tableElement = driver.findElements(homePage.getProductName());
        for (WebElement webElement : tableElement) {
            // Read each phone and add to the list
            productsReadFromPhones.add(webElement.getText());
            }
        // Verify if the phones from the internet webpage are the same as the phones from a list
        assertEquals(productsReadFromPhones, productsToVerify);
        }


    @Test
    public void testPhonesNextButton() {
        HomePage phones = homePage.clickPhones();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Next button
        phones.clickNext();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 6 products
        assertEquals(phones.getSizeProductName(), 6);
    }


    @Test
    public void testPhonesPreviousButton() {
        HomePage phones = homePage.clickPhones();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Previous button
        phones.clickPrevious();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 9 products
        assertEquals(phones.getSizeProductName(), 9);
    }
}