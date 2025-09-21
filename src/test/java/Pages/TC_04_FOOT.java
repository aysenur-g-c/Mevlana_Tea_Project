package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_04_FOOT extends BaseDriverParameter {

    @Test (priority = 1)
    public void FooterCommunication(){
        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

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

        hover(elements.footerFacebookIcon);
        waitForClickable(elements.footerFacebookIcon);
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

    }
}
