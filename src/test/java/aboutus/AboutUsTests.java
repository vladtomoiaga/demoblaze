package aboutus;

import org.testng.annotations.Test;
import pages.AboutUsPage;
import util.BaseTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AboutUsTests extends BaseTests {

    @Test
    public void testVideoAboutUs() {
        AboutUsPage aboutUs = homePage.clickAboutUs();

        // Wait until the About us window appear
        synchronized (aboutUs) {
            try {
                aboutUs.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Click on the Play Video button to start the video
        aboutUs.clickPlayVideoButton();
        synchronized (aboutUs) {
            try {
                aboutUs.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Click the Play button (now is the Pause button) to paused the video
        aboutUs.clickPlayPauseButton();
        synchronized (aboutUs) {
            try {
                aboutUs.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        aboutUs.clickVolumeButton();
        //aboutUs.clickTimeBar();
    }

    @Test
    public void testCloseSymbolAboutUs() {
        AboutUsPage aboutUs = homePage.clickAboutUs();

        // Wait until the About us window appear
        synchronized (aboutUs) {
            try {
                aboutUs.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Click on the Close symbol button
        aboutUs.clickCloseSymbolButton();
        // Verify if the window is closed => About us is visible


    }

    @Test
    public void testCloseAboutUs() {
        AboutUsPage aboutUs = homePage.clickAboutUs();

        // Wait until the About us window appear
        synchronized (aboutUs) {
            try {
                aboutUs.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Click on the Close button
        aboutUs.clickCloseButton();
        // Verify if the window is closed => About us is visible



    }
}
