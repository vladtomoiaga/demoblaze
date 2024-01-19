package monitors;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import util.BaseTests;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;


public class MonitorsTests extends BaseTests {

    @Test
    public void testNumbersOfMonitors() {
        HomePage monitors = homePage.clickMonitors();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 2 monitors
        assertEquals(monitors.getSizeProductName(), 2);
        // Create a list with the monitors which need to be verified
        ArrayList<String> productsToVerify = new ArrayList<>();
        productsToVerify.add("Apple monitor 24");
        productsToVerify.add("ASUS Full HD");
        // Create a list where it can be stored the laptops read from the internet webpage
        ArrayList<String> monitorsReadFromMonitors = new ArrayList<>();
        List<WebElement> tableElement = driver.findElements(homePage.getProductName());
        for (WebElement webElement : tableElement) {
            // Read each laptop and add to the list
            monitorsReadFromMonitors.add(webElement.getText());
        }
        // Verify if the phones from the internet webpage are the same as the phones from a list
        assertEquals(monitorsReadFromMonitors, productsToVerify);
    }

    @Test
    public void testMonitorsNextButton() {
        HomePage monitors = homePage.clickMonitors();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Next button
        monitors.clickNext();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 6 products
        assertEquals(monitors.getSizeProductName(), 6);
    }

    @Test
    public void testMonitorsPreviousButton() {
        HomePage monitors = homePage.clickMonitors();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Previous button
        monitors.clickPrevious();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if are displayed 9 products
        assertEquals(monitors.getSizeProductName(), 9);
    }
}