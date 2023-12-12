package login;

import org.testng.annotations.*;
import pages.LoginPage;
import util.BaseTests;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage login = homePage.clickLogin();
        // Wait until the Log in window appear
        synchronized (login) {
            try {
                login.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Fill in Username
        login.setUserName("usernamedemoblaze@gmail.com");
        // Fill in Password
        login.setPassword("password");
        // Click on the Log in button
        login.clickLoginButton();
        // Wait until all the fields are populated
        synchronized (login) {
            try {
                login.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Verify if log out text is found
        assertTrue(homePage.getAlertLogOut().equals("Log out"),"Log out text is not found.");
    }

    @Test
    public void testNotSuccessfulLoginWrongUsername() {
        LoginPage login = homePage.clickLogin();
        // Wait until the Log in window appear
        synchronized (login) {
            try {
                login.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Fill in Username
        login.setUserName("usernamedemoblaze@gmail.co");
        // Fill Password
        login.setPassword("password");
        // Click on the Log in button
        login.clickLoginButton();
        // Wait until all the fields are populated
        synchronized (login) {
            try {
                login.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Verify if the user receive the message: "User does not exist."
        assertEquals(driver.switchTo().alert().getText(),"User does not exist.");
        // Click on the Ok button
        homePage.acceptAlert();
        // Click on the Close button
        login.clickCloseButton();
    }

    @Test
    public void testNotSuccessfulLoginWrongPassword() {
        LoginPage login = homePage.clickLogin();
        // Wait until the Log in window appear
        synchronized (login) {
            try {
                login.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Fill in Username
        login.setUserName("usernamedemoblaze@gmail.com");
        // Fill in Password
        login.setPassword("passwor");
        // Click on the Log in button
        login.clickLoginButton();
        // Wait until all the fields are populated
        synchronized (login) {
            try {
                login.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Verify if the user receive the message: "Wrong password."
        assertEquals(driver.switchTo().alert().getText(), "Wrong password.");
        // Click on the Ok button
        homePage.acceptAlert();
        // Click on the Close button
        login.clickCloseButton();
        assertFalse(homePage.getAlertLogOut().contains("Log in"),"The user is connected.");
    }

}
