package laptops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import util.BaseTests;

import java.util.List;

public class LaptopsTests extends BaseTests {

    @Test
    public void testProds() {
        homePage.clickLaptops();
        homePage.returnProducts();
    }

    @Test
    public void testLaptops() {
        homePage.clickLaptops();

        List<WebElement> tableElement = driver.findElements(By.xpath("/html//div[@id='tbodyid']")); // findElements will return a list of table elements
        for (WebElement webElement : tableElement) {
            System.out.println(webElement.getText());
            /*if (webElement.getText().contains(MacBook Pro)) { //rowData is the data value which we are looking for to perform operation on
                webElement.click();
                break;*/
            }
        //int countingElements= driver.findElements(By.className("card-title")).size();
       // System.out.println(countingElements);
        synchronized (homePage) {
            try {
                homePage.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //homePage.clickPrevious();
    }
}
