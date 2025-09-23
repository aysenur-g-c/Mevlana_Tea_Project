package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC_01_02_PROD extends BaseDriverParameter {

    @Test(priority = 1)
    public void AssertionProduct() {
        Elements elements = new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

        waitForClickable(elements.imgClose).click();
        waitForClickable(elements.allProductsBtn).click();

        wait.until(ExpectedConditions.visibilityOfAllElements(elements.nameProducts));

        List<WebElement> urunIsimleri = elements.nameProducts;
        List<WebElement> fiyatlar = elements.prices;
        List<WebElement> butonlar = elements.addtoCart;

        Assert.assertFalse(urunIsimleri.isEmpty(), "Sayfada hiç ürün bulunamadı!");

        Assert.assertEquals(urunIsimleri.size(), fiyatlar.size(), "Fiyat sayısı ile ürün sayısı eşleşmiyor");
        Assert.assertEquals(urunIsimleri.size(), butonlar.size(), "Buton sayısı ile ürün sayısı eşleşmiyor");

        for (int i = 0; i < urunIsimleri.size(); i++) {
            WebElement product = urunIsimleri.get(i);
            WebElement price = fiyatlar.get(i);
            WebElement button = butonlar.get(i);
            String namePrdct = product.getText();

            Assert.assertTrue(product.isDisplayed(), "Ürün adı görünmüyor! - " + namePrdct);
            Assert.assertTrue(price.isDisplayed(), "Fiyat bilgisi görünmüyor! - " + namePrdct);
            Assert.assertTrue(button.isDisplayed(), "Sepete ekle butonu görünmüyor! - " + namePrdct);
        }
    }

    @Test(priority = 2)
    public void ControlOfOutOfStockProducts() {
        Elements elements = new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

        waitForClickable(elements.imgClose).click();
        waitForClickable(elements.allProductsBtn).click();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='products columns-3']/li")));

        List<WebElement> stoktaYokEtiketleri = elements.noStockTexts;

        for (WebElement etiket : stoktaYokEtiketleri) {
            Assert.assertEquals(etiket.getText().trim(), "Stokta Yok", "'Stokta Yok' etiketi görünmeli ama görünmedi.");
        }

        waitForClickable(elements.nextPageBtn).click();

        wait.until(ExpectedConditions.stalenessOf(stoktaYokEtiketleri.getFirst()));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class='products columns-3']/li")));

        List<WebElement> stoktaYokEtiketleri2 = elements.noStockTexts;

        for (WebElement etiket : stoktaYokEtiketleri2) {
            Assert.assertEquals(etiket.getText().trim(), "Stokta Yok", "'Stokta Yok' etiketi görünmeli ama görünmedi (2. sayfa).");
        }
    }
}