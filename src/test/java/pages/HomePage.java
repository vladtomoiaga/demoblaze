package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.BaseTests;

import java.util.List;

public class HomePage extends BaseTests {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    // Finding the elements on the Home page
    private By bImage = By.cssSelector("a#nava > img");
    private By productStoreButton = By.id("nava");
    private By navigationBarTop = By.id("navbarExample");
    private By homeButton = By.cssSelector("li:nth-of-type(1) > .nav-link");
    private By contactButton = By.linkText("Contact");
    private By aboutUsButton = By.linkText("About us");
    private By cartButton = By.id("cartur");
    private By logInButton = By.id("login2");
    private By logOutButton = By.id("logout2");
    private By signUpButton = By.id("signin2");
    private By welcomeButton = By.id("nameofuser");
    private By previousArrowButton = By.cssSelector(".carousel-control-prev-icon");
    private By nextArrowButton = By.cssSelector(".carousel-control-next-icon");
    private By categoriesButton = By.id("cat");
    private By phonesButton = By.cssSelector(".list-group .list-group-item:nth-of-type(2)");
    private By laptopsButton = By.cssSelector(".list-group > a:nth-of-type(3)");
    private By monitorsButton = By.cssSelector(".list-group > a:nth-of-type(4)");
    private By productName = By.className("card-title");
    private By productPrice = By.xpath("/html//div[@id='tbodyid']//h5");
    private By productDescription = By.id("article");
    private By previousButton = By.id("prev2");
    private By nextButton = By.id("next2");
    private By navigationBarBottom = By.id("footc");
    private By copyrightText = By.cssSelector("[class='m-0 text-center text-white']");

    /** This method click on Contact */
    public HomePage clickHome() {
        clickLink(homeButton);
        return new HomePage(driver);
    }

    /** This method click on Contact */
    public ContactPage clickContact() {
        clickLink(contactButton);
        return new ContactPage(driver);
    }

    /** This method click on About us */
    public AboutUsPage clickAboutUs() {
        clickLink(aboutUsButton);
        return new AboutUsPage(driver);
    }

    /** This method click on Cart */
    public CartPage clickCart() {
        clickLink(cartButton);
        return new CartPage(driver);
    }

    /** This method click on Log in */
    public LoginPage clickLogin() {
        clickLink(logInButton);
        return new LoginPage(driver);
    }

    /** This method click on Log out */
    public LoginPage clickLogout() {
        clickLink(logOutButton);
        return new LoginPage(driver);
    }

    /** This method click on Sign up */
    public SignupPage clickSignup() {
        clickLink(signUpButton);
        return new SignupPage(driver);
    }

    /** This method click on Categories */
    public HomePage clickCategories() {
        clickLink(categoriesButton);
        return new HomePage(driver);
    }

    /** This method click on Phones */
    public HomePage clickPhones() {
        clickLink(phonesButton);
        return new HomePage(driver);
    }

    /** This method click on Laptops */
    public HomePage clickLaptops() {
        clickLink(laptopsButton);
        return new HomePage(driver);
    }

    /** This method click on Monitors */
    public HomePage clickMonitors() {
        clickLink(monitorsButton);
        return new HomePage(driver);
    }

    /** This method click on a specific product by index */
    public void clickOnTheProduct(int index){
        List<WebElement> products = driver.findElements(productName);
        if (index >= 0 && index < products.size()) {
            WebElement productToBuy = products.get(index);
            productToBuy.click();
        } else {
            System.out.println("Enter a correct number.");
        }
    }

    /** This method click on a specific product by index */
    public void clickOnTheProductByText(String name){
        driver.findElement(By.linkText(name)).click();
    }

    /** This method click on the Previous button */
    public HomePage clickPrevious() {
        driver.findElement(previousButton).click();
        return new HomePage(driver);
    }

    /** This method click on the Next button */
    public HomePage clickNext() {
        driver.findElement(nextButton).click();
        return new HomePage(driver);
    }

    private void clickLink(By locator) {
        driver.findElement(locator).click();
    }

    public String getAlertContact() {
        return driver.findElement(contactButton).getText();
    }

    public String getAlertAboutUs() {
        return driver.findElement(aboutUsButton).getText();
    }

    public String getAlertLogOut() {
        return driver.findElement(logOutButton).getText();
    }

    public String getAlertSignUp() {
        return driver.findElement(signUpButton).getText();
    }

    /** This method return the name of the product */
    public By getProductName() {
        return productName;
    }

    /** This method return the name of the product */
    public String getProductName(int index) {
        List<WebElement> products = driver.findElements(productName);
        if (index >= 0 && index < products.size()) {
            WebElement productToBuy = products.get(index);
            return productToBuy.getText();
        } else {
            System.out.println("Enter a correct number.");
            return "";
        }
    }

    /** This method return the name of the product */
    // This method works not correct, because of the locators
    public String getProductPrice(int index) {
        List<WebElement> products = driver.findElements(productPrice);
        if (index >= 0 && index < products.size()) {
            WebElement productToBuy = products.get(index);
            return productToBuy.getText().substring(1);
        } else {
            System.out.println("Enter a correct number.");
            return "";
        }
    }

    /** This method return the description of the product */
    public String getProductDescription(int index) {
        List<WebElement> products = driver.findElements(productDescription);
        if (index >= 0 && index < products.size()) {
            WebElement productToBuy = products.get(index);
            return productToBuy.getText();
        } else {
            System.out.println("Enter a correct number.");
            return "";
        }
    }

    /** This method return the size of the products */
    public int getSizeProductName() {
        return driver.findElements(productName).size();
    }

    /** This method click on the Ok alert button */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    /** This method return the name of the alert text */
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    // Getters
    public By getbImage() {
        return bImage;
    }

    public By getProductStoreButton() {
        return productStoreButton;
    }

    public By getNavigationBarTop() {
        return navigationBarTop;
    }

    public By getHomeButton() {
        return homeButton;
    }

    public By getContactButton() {
        return contactButton;
    }

    public By getAboutUsButton() {
        return aboutUsButton;
    }

    public By getCartButton() {
        return cartButton;
    }

    public By getLogInButton() {
        return logInButton;
    }

    public By getLogOutButton() {
        return logOutButton;
    }

    public By getSignUpButton() {
        return signUpButton;
    }

    public By getWelcomeButton() {
        return welcomeButton;
    }

    public By getPreviousArrowButton() {
        return previousArrowButton;
    }

    public By getNextArrowButton() {
        return nextArrowButton;
    }

    public By getCategoriesButton() {
        return categoriesButton;
    }

    public By getPhonesButton() {
        return phonesButton;
    }

    public By getLaptopsButton() {
        return laptopsButton;
    }

    public By getMonitorsButton() {
        return monitorsButton;
    }

    public By getProductPrice() {
        return productPrice;
    }

    public By getProductDescription() {
        return productDescription;
    }

    public By getPreviousButton() {
        return previousButton;
    }

    public By getNextButton() {
        return nextButton;
    }

    public By getNavigationBarBottom() {
        return navigationBarBottom;
    }

    public By getCopyrightText() {
        return copyrightText;
    }
}
