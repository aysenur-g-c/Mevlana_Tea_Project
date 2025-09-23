package Pages;

import Utility.BaseDriverParameter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_PROD extends BaseDriverParameter {
    @Test
    public void AssertionProduct() {
        Elements elements = new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");
        waitForClickable(elements.imgClose).click();

        waitForClickable(elements.allProductsBtn).click();


        // firstProduct

        waitForVisible(elements.firstProduct);
        elements.firstProduct.click();

        waitForVisible(elements.pricePrdct);
        Assert.assertTrue(elements.pricePrdct.isDisplayed());

        waitForClickable(elements.firstBtnAddtoCart);
        Assert.assertTrue(elements.firstBtnAddtoCart.isDisplayed());

        driver.navigate().back();

        // secondProduct


        waitForVisible(elements.secondProduct);
        elements.secondProduct.click();

        waitForVisible(elements.pricePrdct);
        Assert.assertTrue(elements.pricePrdct.isDisplayed());

        waitForClickable(elements.firstBtnAddtoCart);
        Assert.assertTrue(elements.firstBtnAddtoCart.isDisplayed());

        driver.navigate().back();


        // thirdProduct

        waitForVisible(elements.thirdProduct);
        elements.thirdProduct.click();

        waitForVisible(elements.pricePrdct);
        Assert.assertTrue(elements.pricePrdct.isDisplayed());

        waitForClickable(elements.firstBtnAddtoCart);
        Assert.assertTrue(elements.firstBtnAddtoCart.isDisplayed());

        driver.navigate().back();

        // fourthProduct

        waitForVisible(elements.fourthProduct);
        elements.fourthProduct.click();

        waitForVisible(elements.pricePrdct);
        Assert.assertTrue(elements.pricePrdct.isDisplayed());

        waitForClickable(elements.firstBtnAddtoCart);
        Assert.assertTrue(elements.firstBtnAddtoCart.isDisplayed());

        driver.navigate().back();

























    }
}
