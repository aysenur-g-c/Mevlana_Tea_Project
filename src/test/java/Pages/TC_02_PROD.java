package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_02_PROD extends BaseDriverParameter {
    @Test
    public void ControlOfOutOfStockProducts() {
        Elements elements = new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");
        waitForClickable(elements.imgClose).click();

        waitForClickable(elements.urunlerBtn).click();














    }
}
