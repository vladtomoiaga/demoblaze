package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the Home page
    private By bImage = By.cssSelector("a#nava > img");
    private By productStoreButton = By.cssSelector("a#nava");
    private By homeButton = By.cssSelector("li:nth-of-type(1) > .nav-link");
    private By contactButton = By.cssSelector("li:nth-of-type(2) > .nav-link");
    private By aboutUsButton = By.cssSelector("li:nth-of-type(3) > .nav-link");
    private By cartButton = By.cssSelector("a#cartur");
    private By logInButton = By.cssSelector("a#login2");
    private By logOutButton = By.cssSelector("a#logout2");
    private By signUpButton = By.cssSelector("a#signin2");
    private By welcomeButton = By.cssSelector("a#nameofuser");
    private By previousLogoButton = By.cssSelector(".carousel-control-prev-icon");
    private By nextLogoButton = By.cssSelector(".carousel-control-next-icon");
    private By categoriesButton = By.id("cat");
    private By phonesButton = By.cssSelector(".list-group .list-group-item:nth-of-type(2)");
    private By laptopsButton = By.cssSelector(".list-group > a:nth-of-type(3)");
    private By monitorsButton = By.cssSelector(".list-group > a:nth-of-type(4)");
    private By product = By.className("hrefch");
    private By previousButton = By.cssSelector("form#frm > ul > li:nth-of-type(1)");
    private By nextButton = By.cssSelector("form#frm > ul > li:nth-of-type(2)");
    private By productsTable = By.id("tbodyid");

    /** This method click on Contact */
    public HomePage clickHome() {
        clickLink("Home");
        return new HomePage(driver);
    }

    public void returnProducts() {
        //System.out.println(driver.findElement(productsTable).findElements());
    }

    /** This method click on Contact */
    public ContactPage clickContact() {
        clickLink("Contact");
        return new ContactPage(driver);
    }

    /** This method click on About us */
    public AboutUsPage clickAboutUs() {
        clickLink("About us");
        return new AboutUsPage(driver);
    }

    /** This method click on Cart */
    public CartPage clickCart() {
        clickLink("Cart");
        return new CartPage(driver);
    }

    /** This method click on Log in */
    public LoginPage clickLogin() {
        clickLink("Log in");
        return new LoginPage(driver);
    }

    /** This method click on Log out */
    public LoginPage clickLogout() {
        clickLink("Log out");
        return new LoginPage(driver);
    }

    /** This method click on Sign up */
    public SignupPage clickSignup() {
        clickLink("Sign up");
        return new SignupPage(driver);
    }

    /** This method click on Categories */
    public HomePage clickCategories() {
        clickLink("Categories");
        return new HomePage(driver);
    }

    /** This method click on Phones */
    public HomePage clickPhones() {
        clickLink("Phones");
        return new HomePage(driver);
    }

    /** This method click on Laptops */
    public HomePage clickLaptops() {
        clickLink("Laptops");
        return new HomePage(driver);
    }

    /** This method click on Monitors */
    public HomePage clickMonitors() {
        clickLink("Monitors");
        return new HomePage(driver);
    }

    public ProductPage clickProduct(String product) {
        driver.findElement(By.className("hrefch")).click();
        return new ProductPage(driver);
    }

    /** This method click on the Previous button */
    public HomePage clickPrevious() {
        driver.findElement(previousButton).click();
        return new HomePage(driver);
    }

    /** This method click on the Next button */
    public HomePage clickNext() {
        clickLink("Next");
        return new HomePage(driver);
    }

    private void clickLink(String text) {
        driver.findElement(By.linkText(text)).click();
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


    /** This method click on the Ok alert button */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
