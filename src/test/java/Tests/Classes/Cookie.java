package Tests.Classes;

import Pages.Elements;
import Utility.BaseDriverParameter;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Cookie extends BaseDriverParameter {


    @Test(priority = 1)
    public void CookieTC001() throws InterruptedException {
        Elements elements = new Elements(driver);
        driver.get("https://mevlanacay.de");
        wait.until(ExpectedConditions.elementToBeClickable(elements.imgClose)).click();
        wait.until(ExpectedConditions.visibilityOf(elements.cookieText));

        Assert.assertTrue(elements.cookieText.isDisplayed());

        TearDown();

    }

    @Test(priority = 2)
    public void CookieTC002() throws InterruptedException {
        Elements elements = new Elements(driver);
        driver.get("https://mevlanacay.de");
        wait.until(ExpectedConditions.visibilityOf(elements.cookieText));
        elements.imgClose.click();

        Assert.assertTrue(elements.cookieText.isDisplayed());
        elements.cookieAcceptButton.click();
        Assert.assertFalse(elements.cookieText.isDisplayed());

        TearDown();
    }

    @Test(priority = 3)
    public void CookieTC003() throws InterruptedException {
        Elements elements = new Elements(driver);
        driver.get("https://mevlanacay.de");
        wait.until(ExpectedConditions.visibilityOf(elements.cookieText));
        elements.imgClose.click();

        Assert.assertTrue(elements.cookieRejectButton.isDisplayed());
        elements.cookieRejectButton.click();
        Assert.assertFalse(elements.cookieRejectButton.isDisplayed());


        TearDown();
    }
}
