package Tests.Classes;

import Utility.BaseDriverParameter;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Foot extends BaseDriverParameter {

    @Test (priority = 1)
    public void FooterCommunication(){
        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

        waitForVisible(elements.imgClose).click();
        hover(elements.footerAddress);
        waitForVisible(elements.footerAddress);
        waitForVisible(elements.footerMail);
        waitForVisible(elements.footerTel);
    }

    @Test (priority = 2)
    public void SocialMedia(){
        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");
        String originalWindow = driver.getWindowHandle();

        waitForVisible(elements.imgClose).click();
        hover(elements.footerFacebookIcon);

        new Actions(driver).moveToElement(elements.footerFacebookIcon).click().perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.getWindowHandles().size() > 1);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://www.facebook.com/mevlanacay.de"));
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.facebook.com/mevlanacay.de",
                "Redirection to Facebook page failed.");
        driver.close();
        driver.switchTo().window(originalWindow);

        new Actions(driver).moveToElement(elements.footerYoutubeIcon).click().perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.getWindowHandles().size() > 1);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://www.youtube.com/channel/UCAz9J9R6tvp3K76s9zor3bA"));
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.youtube.com/channel/UCAz9J9R6tvp3K76s9zor3bA",
                "Redirection to Facebook page failed.");
        driver.close();
        driver.switchTo().window(originalWindow);

        new Actions(driver).moveToElement(elements.footerXIcon).click().perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.getWindowHandles().size() > 1);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://x.com/mevlanacayde"));
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://x.com/mevlanacayde",
                "Redirection to Facebook page failed.");
        driver.close();
        driver.switchTo().window(originalWindow);

        new Actions(driver).moveToElement(elements.footerInstagramIcon).click().perform();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.getWindowHandles().size() > 1);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://www.instagram.com/mevlanacayde/#"));
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://www.instagram.com/mevlanacayde/#",
                "Redirection to Facebook page failed.");
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @Test (priority = 3)
    public void PaymentMethods(){
        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

        waitForVisible(elements.footerPaymentMetIcon);
    }
}
