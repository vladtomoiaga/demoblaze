package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoblaze.com/index.html");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

//    @AfterClass
//    public void logOut() {
//        try {
//            driver.findElement(By.linkText("Log out")).click();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
