package integration;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignupPage;
import util.BaseTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static util.UtilsValues.*;

public class SignupLoginTests extends BaseTests {
    @Test
    public void testSuccessfulSignupLogin() {
        // Define and initialize username
        String username = getUniqueUsername();
        // Click on the Sign up button
        SignupPage signupPage = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Sign up button
        signupPage.signupSetup(username, CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "Sign up successful."
        assertEquals(homePage.getAlertText(), "Sign up successful.");
        // Click on the Ok button on alert
        homePage.acceptAlert();
        // Click on the Log in button
        LoginPage loginPage = homePage.clickLogin();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Log in button
        loginPage.loginSetup(username, CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if Log out text is found
        assertTrue(homePage.getAlertLogOut().equals("Log out"),"Log out text is not found.");
    }

    @Test
    public void testNotSuccessfulSignupLoginWrongUsername() {
        // Define and initialize username
        String username = getUniqueUsername();
        // Click on the Sign up button
        SignupPage signupPage = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Sign up button
        signupPage.signupSetup(username, CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "Sign up successful."
        assertEquals(homePage.getAlertText(), "Sign up successful.");
        // Click on the Ok button on alert
        homePage.acceptAlert();
        // Click on the Log in button
        LoginPage loginPage = homePage.clickLogin();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Log in button
        loginPage.loginSetup(username.substring(0, username.length()-1), CORRECT_PASSWORD);
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
    public void testNotSuccessfulSignupLoginWrongPassword() {
        // Define and initialize username
        String username = getUniqueUsername();
        // Click on the Sign up button
        SignupPage signupPage = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Sign up button
        signupPage.signupSetup(username, CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "Sign up successful."
        assertEquals(homePage.getAlertText(), "Sign up successful.");
        // Click on the Ok button on alert
        homePage.acceptAlert();
        // Click on the Log in button
        LoginPage loginPage = homePage.clickLogin();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Log in button
        loginPage.loginSetup(username, WRONG_PASSWORD);
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