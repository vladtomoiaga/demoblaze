package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilsValues {
    public static WebDriver driver;

    // Credentials
    public static final String CORRECT_USERNAME = "usernamedemoblaze@gmail.com";
    public static final String CORRECT_PASSWORD = "password";
    public static final String WRONG_USERNAME = CORRECT_USERNAME.substring(0, CORRECT_USERNAME.length()-1);
    public static final String WRONG_PASSWORD = CORRECT_PASSWORD.substring(0, CORRECT_PASSWORD.length()-1);
    public static final String UNIQUE_USERNAME = getUniqueUsername();
    public static final String WRONG_UNIQUE_USERNAME = getUniqueUsername().substring(0, getUniqueUsername().length()-1);
    public static final String EMPTY_USERNAME = "";
    public static final String EMPTY_PASSWORD = "";

    // Values for Place order
    public static final String NAME = "User";
    public static final String EMPTY_NAME = "";
    public static final String COUNTRY = "Romania";
    public static final String EMPTY_COUNTRY = "";
    public static final String CITY = "Cluj-Napoca";
    public static final String EMPTY_CITY = "";
    public static final long CREDIT_CARD_NUMBER = Long.parseLong(("" + Math.abs(new Random().nextLong(Long.MAX_VALUE))).substring(0, 16));
    public static final long CREDIT_CARD_NUMBER_SHORT = Long.parseLong(("" + Math.abs(new Random().nextLong(Long.MAX_VALUE))).substring(0, 15));
    public static final long CREDIT_CARD_NUMBER_LONG = Long.parseLong(("" + Math.abs(new Random().nextLong(Long.MAX_VALUE))).substring(0, 17));
    public static final int CURRENT_MONTH = Integer.parseInt(DateTimeFormatter.ofPattern("MM").format(LocalDateTime.now()));
    public static final int MONTH_LOW_LIMIT = 1;
    public static final int MONTH_TOP_LIMIT = 12;
    public static final int INVALID_MONTH_LOW_LIMIT = 0;
    public static final int INVALID_MONTH_TOP_LIMIT = 13;
    public static final int CURRENT_YEAR = Integer.parseInt(String.valueOf(Year.now(Clock.systemUTC())).substring(2));
    public static final int YEAR_TOP_LIMIT = CURRENT_YEAR + 5;
    public static final int INVALID_YEAR_LOW_LIMIT = CURRENT_YEAR - 1;
    public static final int INVALID_YEAR_OVER_LIMIT = CURRENT_YEAR + 6;

    /** This method return a unique Username */
    public static String getUniqueUsername() {
        return "username" + DateTimeFormatter.ofPattern("yyMMddHHmmss").format(LocalDateTime.now()) + "@gmail.com";
    }

    /** This method return true if a valid name is set */
    public static boolean nameBoolean(String name) {
        if (!name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /** This method return true if a valid country is set */
    public static boolean countryBoolean(String country) {
        if (!country.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /** This method return true if a valid city is set */
    public static boolean cityBoolean(String city) {
        if (!city.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /** This method return true if a valid year is set */
    public static boolean yearBoolean(int year) {
        if (year >= CURRENT_YEAR && year <= (CURRENT_YEAR + 5)) {
            return true;
        } else {
            return false;
        }
    }

    /** This method return true if a valid month is set */
    public static boolean monthBoolean(int month) {
        if (month >= 1 && month <= 12) {
            return true;
        } else {
            return false;
        }
    }

    /** This method populate the Username and Password fields */
    public static void setUsernameAndPassword(By usernameField, String username, By passwordField, String password) {
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }
}