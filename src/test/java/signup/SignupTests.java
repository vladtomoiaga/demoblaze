package signup;

import org.testng.annotations.Test;
import pages.SignupPage;
import util.BaseTests;

import static org.testng.Assert.assertEquals;
import static util.UtilsValues.*;
import static util.UtilsValues.getUniqueUsername;

public class SignupTests extends BaseTests {

    @Test
    public void testSuccessfulSignup() {
        SignupPage signupPage = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Sign up button
        signupPage.signupSetup(getUniqueUsername(),CORRECT_PASSWORD);
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
    }

    @Test
    public void testNotSuccessfulSignupUserExists() {
        SignupPage signupPage = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Sign up button
        signupPage.signupSetup(CORRECT_USERNAME,CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "This user already exist."
        assertEquals(homePage.getAlertText(), "This user already exist.");
        // Click on the Ok button on alert
        homePage.acceptAlert();
        // Click on the Close button
        signupPage.clickCloseButton();
    }

    @Test
    public void testNotSuccessfulSignupUsernameNotFilled() {
        SignupPage signupPage = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Sign up button
        signupPage.signupSetup(EMPTY_USERNAME,CORRECT_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "Please fill out Username and Password."
        assertEquals(homePage.getAlertText(), "Please fill out Username and Password.");
        // Click on the Ok button on alert
        homePage.acceptAlert();
        // Click on the Close button
        signupPage.clickCloseButton();
    }

    @Test
    public void testNotSuccessfulSignupPasswordNotFilled() {
        SignupPage signupPage = homePage.clickSignup();
        // Wait until the Log in window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Fill in Username and Password and click on the Sign up button
        signupPage.signupSetup(getUniqueUsername(),EMPTY_PASSWORD);
        // Wait until all the fields are populated
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the user receive the message: "Please fill out Username and Password."
        assertEquals(homePage.getAlertText(), "Please fill out Username and Password.");
        // Click on the Ok button on alert
        homePage.acceptAlert();
        // Click on the Close button
        signupPage.clickCloseButton();
    }
}
