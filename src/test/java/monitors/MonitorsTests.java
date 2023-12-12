package monitors;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.BaseTests;



public class MonitorsTests extends BaseTests {

    @Test
    public void testMonitors() {
        homePage.clickMonitors();
        int countingElements= driver.findElements(By.className("card-title")).size();
        System.out.println(countingElements);
        homePage.clickNext();
    }

}
