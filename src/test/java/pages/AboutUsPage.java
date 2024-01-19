package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.BaseTests;

public class AboutUsPage extends BaseTests {

    private WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the About us page
    private By aboutUsText = By.cssSelector("h5#videoModalLabel");
    private By closeSymbolButton = By.cssSelector("div#videoModal .close > span");
    private By playVideoButton = By.cssSelector("div#example-video > button[title='Play Video']");
    private By playButton = By.cssSelector("button[title='Play']");
    private By pauseButton = By.cssSelector("button[title='Pause']");
    private By muteButton = By.cssSelector("button[title='Mute']");
    private By unMuteButton = By.cssSelector("button[title='Unmute']");
    private By volumeSlider = By.cssSelector("div[role='slider'] > .vjs-volume-level");
    private By timeSlider = By.cssSelector(".vjs-control.vjs-progress-control");
    private By remainingTime = By.cssSelector(".vjs-control.vjs-remaining-time.vjs-time-control > span:nth-of-type(3)");
    private By pictureInPictureButton = By.cssSelector("button[title='Picture-in-Picture']");
    private By exitPictureInPictureButton = By.cssSelector("button[title='Exit Picture-in-Picture']");
    private By fullscreenButton = By.cssSelector("button[title='Fullscreen']");
    private By nonFullscreenButton = By.cssSelector("button[title='Non-Fullscreen']");
    private By closeButton = By.cssSelector("div#videoModal > .modal-dialog .btn.btn-secondary");

    /** This method click on the Play Video button */
    public AboutUsPage clickPlayVideoButton() {
        driver.findElement(playVideoButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Play button */
    public AboutUsPage clickPlayButton() {
        driver.findElement(playButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Play button */
    public AboutUsPage clickPauseButton() {
        driver.findElement(pauseButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click to mute the sound */
    public AboutUsPage clickMuteButton() {
        driver.findElement(muteButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click to unmute the sound */
    public AboutUsPage clickUnMuteButton() {
        driver.findElement(unMuteButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Volume slider */
    public AboutUsPage clickVolumeSlider() {
        driver.findElement(volumeSlider).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Time Bar */
    public void clickTimeSlider() {
        driver.findElement(timeSlider).click();
    }

    /** This method click on the Picture-in-Picture button */
    public AboutUsPage clickPictureInPictureButton() {
        driver.findElement(pictureInPictureButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Exit Picture-in-Picture button */
    public AboutUsPage clickExitPictureInPictureButton() {
        driver.findElement(exitPictureInPictureButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Fullscreen button */
    public AboutUsPage clickFullscreenButton() {
        driver.findElement(fullscreenButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Non-Fullscreen button */
    public AboutUsPage clickNonFullscreenButton() {
        driver.findElement(nonFullscreenButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Close symbol button */
    public HomePage clickCloseSymbolButton() {
        driver.findElement(closeSymbolButton).click();
        return new HomePage(driver);
    }

    /** This method click on the Close button */
    public HomePage clickCloseButton() {
        driver.findElement(closeButton).click();
        return new HomePage(driver);
    }

    /** This method return the remaining time from the video */
    public String getRemainingTime() {
        return driver.findElement(remainingTime).getText();
    }

    /** This method will hover the Volume button */
    public void hoverOverVolume() {
        WebElement elementVolumeButton = driver.findElement(muteButton);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementVolumeButton).perform();
    }

    // Getter
    public By getAboutUsText() {
        return aboutUsText;
    }

    public By getCloseSymbolButton() {
        return closeSymbolButton;
    }

    public By getPlayVideoButton() {
        return playVideoButton;
    }

    public By getPlayButton() {
        return playButton;
    }

    public By getPauseButton() {
        return pauseButton;
    }

    public By getMuteButton() {
        return muteButton;
    }

    public By getUnMuteButton() {
        return unMuteButton;
    }

    public By getVolumeSlider() {
        return volumeSlider;
    }

    public By getTimeSlider() {
        return timeSlider;
    }

    public By getPictureInPictureButton() {
        return pictureInPictureButton;
    }

    public By getExitPictureInPictureButton() {
        return exitPictureInPictureButton;
    }

    public By getFullscreenButton() {
        return fullscreenButton;
    }

    public By getNonFullscreenButton() {
        return nonFullscreenButton;
    }

    public By getCloseButton() {
        return closeButton;
    }
}
