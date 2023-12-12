package signup;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignupPage;
import util.BaseTests;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SignupTests extends BaseTests {

    @Test
    public void testSuccessfulSignup() {
        SignupPage signup = homePage.clickSignup();
        // Wait until the Log in window appear
        synchronized (signup) {
            try {
                signup.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Fill in Username (concatenate the date and time with @gmail.com to have each running an unique user)
        signup.setUserName("username" + DateTimeFormatter.ofPattern("yyMMddHHmmss").format(LocalDateTime.now()) + "@gmail.com");
        // Fill in Password
        signup.setPassword("password");
        // Click on the Log in button
        signup.clickSignUpButton();
        // Wait until all the fields are populated
        synchronized (signup) {
            try {
                signup.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verify if the user receive the message: "Sign up successful."
        assertEquals(driver.switchTo().alert().getText(), "Sign up successful.");
        driver.switchTo().alert().accept();
        // Verify if - need to be completed !!!
        assertTrue(homePage.getAlertSignUp().contains("Sign up"),"The user is not connected.");
    }

    @Test
    public void testNotSuccessfulSignupUserExists() {
        SignupPage signup = homePage.clickSignup();
        // Wait until the Log in window appear
        synchronized (signup) {
            try {
                signup.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Fill in Username
        signup.setUserName("usernamedemoblaze@gmail.com");
        // Fill in Password
        signup.setPassword("password");
        // Click on the Log in button
        signup.clickSignUpButton();
        // Wait until all the fields are populated
        synchronized (signup) {
            try {
                signup.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verify if the user receive the message: "User does not exist."
        assertEquals(driver.switchTo().alert().getText(), "This user already exist.");
        driver.switchTo().alert().accept();
        signup.clickCloseButton();
        // Verify if - need to be completed !!!
        //assertTrue(homePage.getAlertSignUp().contains("Sign up"),"The user is not connected.");
    }

    @Test
    public void testNotSuccessfulSignupUsernameNotFilled() {
        SignupPage signup = homePage.clickSignup();
        // Wait until the Log in window appear
        synchronized (signup) {
            try {
                signup.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Fill in Username
        signup.setUserName("");
        // Fill in Password
        signup.setPassword("password");
        // Click on the Log in button
        signup.clickSignUpButton();
        // Wait until all the fields are populated
        synchronized (signup) {
            try {
                signup.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verify if the user receive the message: "Please fill out Username and Password."
        assertEquals(driver.switchTo().alert().getText(), "Please fill out Username and Password.");
        driver.switchTo().alert().accept();
        signup.clickCloseButton();
        // Verify if - need to be completed !!!
        //assertTrue(homePage.getAlertSignUp().contains("Sign up"),"The user is not connected.");
    }

    @Test
    public void testNotSuccessfulSignupPasswordNotFilled() {
        SignupPage signup = homePage.clickSignup();
        // Wait until the Log in window appear
        synchronized (signup) {
            try {
                signup.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Fill in Username (concatenate the date and time with @gmail.com to have each running an unique user)
        signup.setUserName("username" + DateTimeFormatter.ofPattern("yyMMddHHmmss").format(LocalDateTime.now()) + "@gmail.com");
        // Fill in Password
        signup.setPassword("");
        // Click on the Log in button
        signup.clickSignUpButton();
        // Wait until all the fields are populated
        synchronized (signup) {
            try {
                signup.wait(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Verify if the user receive the message: "Please fill out Username and Password."
        assertEquals(driver.switchTo().alert().getText(), "Please fill out Username and Password.");
        driver.switchTo().alert().accept();
        signup.clickCloseButton();
        // Verify if - need to be completed !!!
        //assertTrue(homePage.getAlertSignUp().contains("Sign up"),"The user is not connected.");
    }
}
