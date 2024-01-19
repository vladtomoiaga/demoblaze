package login;

import org.testng.annotations.*;
import pages.LoginPage;
import util.BaseTests;

import static org.testng.Assert.*;
import static util.UtilsValues.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLogin();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password
        loginPage.loginSetup(CORRECT_USERNAME,CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if log out text is found
        assertTrue(homePage.getAlertLogOut().equals("Log out"),"Log out text is not found.");
    }

    @Test
    public void testNotSuccessfulLoginWrongUsername() {
        LoginPage loginPage = homePage.clickLogin();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password
        loginPage.loginSetup(WRONG_USERNAME,CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "User does not exist."
        assertEquals(homePage.getAlertText(),"User does not exist.");
        // Click on the Ok button
        homePage.acceptAlert();
        // Click on the Close button
        loginPage.clickCloseButton();
    }

    @Test
    public void testNotSuccessfulLoginWrongPassword() {
        LoginPage loginPage = homePage.clickLogin();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Log in button
        loginPage.loginSetup(CORRECT_USERNAME,WRONG_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "Wrong password."
        assertEquals(homePage.getAlertText(), "Wrong password.");
        // Click on the Ok button
        homePage.acceptAlert();
        // Click on the Close button
        loginPage.clickCloseButton();
    }
}
