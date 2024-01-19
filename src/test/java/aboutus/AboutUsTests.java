package aboutus;

import org.testng.annotations.Test;
import pages.AboutUsPage;
import util.BaseTests;

import static org.testng.Assert.*;

public class AboutUsTests extends BaseTests {

    @Test
    public void testVideoAboutUs() {
        AboutUsPage aboutUs = homePage.clickAboutUs();
        // Wait until the About us window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Play Video button to start the video
        aboutUs.clickPlayVideoButton();
        // Verify if the remaining time is correct displayed
        assertEquals(aboutUs.getRemainingTime(), "18:40");
        // Click on the Time Slider bar
        aboutUs.clickTimeSlider();
        // Verify if the remaining time is correct displayed
        assertEquals(aboutUs.getRemainingTime(), "9:20"); // how to do not with String in ""
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click to mute
        aboutUs.clickMuteButton();
        // Verify if the un mute button is displayed
        assertTrue(driver.findElement(aboutUs.getUnMuteButton()).isDisplayed(), "Button is not displayed");
        // Verify if the Pause button is displayed
        assertTrue(driver.findElement(aboutUs.getPauseButton()).isDisplayed(), "Button is not displayed");
        // Click the Pause button to pause the video
        aboutUs.clickPauseButton();
        // Verify if the Pause button is displayed
        assertTrue(driver.findElement(aboutUs.getPlayButton()).isDisplayed(), "Button is not displayed");
        // Verify if the Picture-in-Picture button is displayed
        assertTrue(driver.findElement(aboutUs.getPictureInPictureButton()).isDisplayed(), "Button is not displayed");
        // Verify if the Fullscreen button is displayed
        assertTrue(driver.findElement(aboutUs.getFullscreenButton()).isDisplayed(), "Button is not displayed");
        // Verify if the Non-Fullscreen button is not displayed
        //assertFalse(driver.findElement(aboutUs.getNonFullscreenButton()).isDisplayed(), "Button is displayed"); // not working well
        // Click on the Full screen button
        aboutUs.clickFullscreenButton();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Verify if the Fullscreen button is not displayed
        // assertFalse(driver.findElement(aboutUs.getFullscreenButton()).isDisplayed(), "Button is displayed"); // not working well
        // Verify if the Non-Fullscreen button is not displayed
        assertTrue(driver.findElement(aboutUs.getNonFullscreenButton()).isDisplayed(), "Button is displayed");
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Non-Fullscreen button
        aboutUs.clickNonFullscreenButton();
        // Verify if the Fullscreen button is displayed
        assertTrue(driver.findElement(aboutUs.getFullscreenButton()).isDisplayed(), "Button is not displayed");
        // Click on the Picture-in-Picture button
        aboutUs.clickPictureInPictureButton();
        // Verify if the Exit Picture-in-Picture button is displayed
        assertTrue(driver.findElement(aboutUs.getExitPictureInPictureButton()).isDisplayed(), "Button is not displayed");
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Play button
        aboutUs.clickPlayButton();
        assertTrue(driver.findElement(aboutUs.getPauseButton()).isDisplayed(), "Button is not displayed");
        // Click to un mute
        aboutUs.clickUnMuteButton();
        // Waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Exit Picture-in-Picture button
        aboutUs.clickExitPictureInPictureButton();
        // Verify if the Picture-in-Picture button is displayed
        assertTrue(driver.findElement(aboutUs.getPictureInPictureButton()).isDisplayed(), "Button is not displayed");
        // Click on the Close button
        aboutUs.clickCloseButton();
    }

    @Test
    public void testCloseSymbolAboutUs() {
        AboutUsPage aboutUs = homePage.clickAboutUs();
        // Wait until the About us window appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Click on the Close symbol button
        aboutUs.clickCloseSymbolButton();
        // Verify if the About us button is displayed
        assertTrue(driver.findElement(homePage.getAboutUsButton()).isDisplayed(), "Button is not displayed");
    }

    @Test
    public void testCloseButtonAboutUs() {
        AboutUsPage aboutUs = homePage.clickAboutUs();
        // Wait until the About us window appear
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // Click on the Close button
        aboutUs.clickCloseButton();
        // Verify if the About us button is displayed
        assertTrue(driver.findElement(homePage.getAboutUsButton()).isDisplayed(), "Button is not displayed");
    }
}
