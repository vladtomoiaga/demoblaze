package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage {

    private WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Finding the elements on the About us page
    private By aboutUsText = By.cssSelector("h5#videoModalLabel");
    private By closeSymbolButton = By.cssSelector("div#videoModal .close > span");
    private By playVideoButton = By.cssSelector("div#example-video > button[title='Play Video']");
    private By playPauseButton = By.cssSelector("div#example-video");
    private By volumeButton = By.cssSelector(".vjs-control.vjs-volume-panel.vjs-volume-panel-horizontal");
    private By volumeBar = By.cssSelector("div[role='slider'] > .vjs-volume-level");
    private By timeBar = By.cssSelector(".vjs-control.vjs-progress-control");
    private By pictureInPictureButton = By.cssSelector("button[title='Picture-in-Picture'] > .vjs-icon-placeholder");
    private By fullscreenButton = By.cssSelector("body [type='button']:nth-child(17) .vjs-icon-placeholder");
    private By nonFullscreenButton = By.cssSelector("button[title='Non-Fullscreen'] > .vjs-icon-placeholder");
    private By closeButton = By.cssSelector("div#videoModal > .modal-dialog .btn.btn-secondary");


    /** This method click on the Play Video button */
    public AboutUsPage clickPlayVideoButton() {
        driver.findElement(playVideoButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Play button */
    public AboutUsPage clickPlayPauseButton() {
        driver.findElement(playPauseButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Volume button */
    public AboutUsPage clickVolumeButton() {
        driver.findElement(volumeButton).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Time Bar */
    public AboutUsPage clickTimeBar() {
        driver.findElement(timeBar).click();
        return new AboutUsPage(driver);
    }

    /** This method click on the Picture-in-Picture button */
    public AboutUsPage clickPictureInPictureButton() {
        driver.findElement(pictureInPictureButton).click();
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
}
