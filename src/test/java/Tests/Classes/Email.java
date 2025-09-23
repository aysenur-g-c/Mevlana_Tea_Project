package Tests.Classes;

import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Email extends BaseDriverParameter {

    @Test(priority = 1)
    public void SubscriptionArea(){
        Elements elements=new Elements(driver);

        driver.get("https://mevlanacay.de/tr/");

        waitForClickable(elements.imgClose).click();

        waitForVisible(elements.footerEmailBox).isDisplayed();
        waitForVisible(elements.footerSubmitBtn).isDisplayed();
    }

    @Test (priority = 2)
    public void SubscriptionTrue(){
        Elements elements=new Elements(driver);

        driver.get("https://mevlanacay.de/tr/");

        waitForVisible(elements.imgClose).click();

        waitForClickable(elements.footerEmailBox).sendKeys(generateRandomEmail());
        waitForClickable(elements.footerSubmitBtn).click();
        Assert.assertTrue(
                waitForVisible(elements.footerInfoMsg).isDisplayed(),
                "Footer info message did not appear as expected.");

    }

    @Test (priority = 3)
    public void SubscriptionFalse(){
        Elements elements=new Elements(driver);

        driver.get("https://mevlanacay.de/tr/");

        waitForVisible(elements.imgClose).click();

        waitForClickable(elements.footerEmailBox).sendKeys("aysenur@gvh");
        waitForClickable(elements.footerSubmitBtn).click();
        Assert.assertTrue(
                waitForVisible(elements.footerInfoMsg).isDisplayed(),
                "Footer info message did not appear as expected.");

    }

}
