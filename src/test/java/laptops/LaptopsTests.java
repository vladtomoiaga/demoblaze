package laptops;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import util.BaseTests;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class LaptopsTests extends BaseTests {
    @Test
    public void testNumberOfLaptops() {
        HomePage laptops = homePage.clickLaptops();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 6 laptops
        assertEquals(laptops.getSizeProductName(), 6);
        // Create a list with the laptops which need to be verified
        ArrayList<String> productsToVerify = new ArrayList<>();
        productsToVerify.add("Sony vaio i5");
        productsToVerify.add("Sony vaio i7");
        productsToVerify.add("MacBook air");
        productsToVerify.add("Dell i7 8gb");
        productsToVerify.add("2017 Dell 15.6 Inch");
        productsToVerify.add("MacBook Pro");
        // Create a list where it can be stored the laptops read from the internet webpage
        ArrayList<String> laptopsReadFromLaptops = new ArrayList<>();
        List<WebElement> tableElement = driver.findElements(homePage.getProductName());
        for (WebElement webElement : tableElement) {
            // Read each laptop and add to the list
            laptopsReadFromLaptops.add(webElement.getText());
        }
        // Verify if the phones from the internet webpage are the same as the phones from the list
        assertEquals(laptopsReadFromLaptops, productsToVerify);
    }

    @Test
    public void testMonitorsNextButton() {
        HomePage laptops = homePage.clickLaptops();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Next button
        laptops.clickNext();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 6 products
        assertEquals(laptops.getSizeProductName(), 6);
    }

    @Test
    public void testMonitorsPreviousButton() {
        HomePage laptops = homePage.clickLaptops();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Previous button
        laptops.clickPrevious();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 9 products
        assertEquals(laptops.getSizeProductName(), 9);
    }
}
