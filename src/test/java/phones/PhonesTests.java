package phones;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import util.BaseTests;

public class PhonesTests extends BaseTests {

    @Test
    public void testPhones() {
        homePage.clickPhones();
        int countingElements= driver.findElements(By.className("card-title")).size();
        System.out.println(countingElements);
        homePage.clickNext();
    }
}
