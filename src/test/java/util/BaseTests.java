package util;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    public EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.get("https://demoblaze.com/index.html");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

//    @AfterClass
//    public void recordFailure(ITestResult result){
//        if(ITestResult.FAILURE == result.getStatus())
//        {
//            var camera = (TakesScreenshot)driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try{
//                Files.move(screenshot, new File("src/test/resources/screenshots/" + result.getName() + ".png"));
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
