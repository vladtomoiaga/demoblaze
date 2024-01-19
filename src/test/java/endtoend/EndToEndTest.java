package endtoend;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import util.UtilsValues;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static org.testng.Assert.assertEquals;

public class EndToEndTest{

    public WebDriver driver;
    protected HomePage homePage;

    @Given("I am in the home page of the Demoblaze")
    public void i_am_in_the_home_page_of_the_demoblaze() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2500));
        driver.get("https://demoblaze.com/index.html");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }
    @Then("I create a new valid customer")
    public void i_create_a_new_valid_customer() {
        SignupPage signup = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username
        signup.setUsername(UtilsValues.UNIQUE_USERNAME);
        // Fill in Password
        signup.setPassword(UtilsValues.CORRECT_PASSWORD);
        // Click on the Log in button
        signup.clickSignUpButton();
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "Sign up successful."
        assertEquals(driver.switchTo().alert().getText(), "Sign up successful.");
        // Click on the Ok button on alert
        driver.switchTo().alert().accept();
    }

    @And("I logged in the Demoblaze webpage")
    public void i_logged_in_the_demoblaze_webpage() {
        LoginPage loginPage = homePage.clickLogin();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username
        loginPage.setUsername(UtilsValues.UNIQUE_USERNAME);
        // Fill in Password
        loginPage.setPassword(UtilsValues.CORRECT_PASSWORD);
        // Click on the Log in button
        loginPage.clickLoginButton();
    }

    @Then("I click on Samsung galaxy s6")
    public void i_click_on_samsung_galaxy_s6() {
        homePage.clickOnTheProductByText("Samsung galaxy s6");
    }

    @And("I add to cart")
    public void i_add_to_cart() {
        ProductPage productPage = new ProductPage(driver);
        // Click on the Add to cart button
        productPage.clickAddToCartButton();
        // Wait until an alert message is displayed
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the alert button
        homePage.acceptAlert();
    }

    @Then("I go to the Cart")
    public void i_go_to_the_cart() {
        // Wait until an alert message is displayed
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage.clickCart();
    }

    @And("I place the order")
    public void i_place_the_order() {
        // Create the object cartPage
        CartPage cartPage = new CartPage(driver);
        // Click on the Place Order button
        cartPage.clickPlaceOrderButton();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Name
        cartPage.setName("Tester");
        // Fill in Country
        cartPage.setCountry("Romania");
        // Fill in City
        cartPage.setCity("Cluj-Napoca");
        // Fill in Credit Card
        cartPage.setCreditCard(Long.parseLong(("" + Math.abs(new Random().nextLong(Long.MAX_VALUE))).substring(0, 16)));
        // Fill in Month
        cartPage.setMonth(Integer.parseInt(DateTimeFormatter.ofPattern("MM").format(LocalDateTime.now()))); // cum sa fac ca daca nu e month-ul bun sa se opreasca testul, sa pun un assert? sau sa pun cu try and catch?
        // Fill in Year
        cartPage.setYear(Integer.parseInt(DateTimeFormatter.ofPattern("yyyy").format(LocalDateTime.now()))); // cum sa fac ca daca nu e anul bun sa se opreasca testul, sa pun un assert? sau sa pun cu try and catch?
        // Click on the Purchase button
        cartPage.clickPurchaseButton();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the message is correct
        assertEquals(cartPage.getSuccessfulMessage(),"Thank you for your purchase!");
        // Click on the OK button
        cartPage.clickOkButton();
    }


}
