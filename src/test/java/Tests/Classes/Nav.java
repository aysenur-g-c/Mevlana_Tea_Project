package Tests.Classes;

import Pages.Elements;
import Utility.BaseDriverParameter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Nav extends BaseDriverParameter {

    @Test(priority = 1)
    public void HomePage(){
        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

        waitForVisible(elements.imgClose).click();
        elements.anasayfaBtn.click();
        waitForVisible(elements.imgClose).click();
        waitForClickable(elements.hakkimizdaBtn).click();
        verifyPage("hakkimizda/");
        hover(elements.shopBtn);
        hover(elements.urunlerBtn);
        waitForClickable(elements.mevlanaCayBtn).click();
        verifyPage("mevlana-tees/");
        hover(elements.shopBtn);
        hover(elements.urunlerBtn);
        waitForClickable(elements.mimarSinanCayBtn).click();
        verifyPage("mimar-sinan-tee/");
        hover(elements.shopBtn);
        hover(elements.urunlerBtn);
        waitForClickable(elements.sindbadCayBtn).click();
        verifyPage("sindbad-tee/");
        hover(elements.shopBtn);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elements.morgenMrktBtn);

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlToBe("https://morgenmarkt.de/marken/goran-tee"));
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://morgenmarkt.de/marken/goran-tee",
                "Redirection to Goran Tee page failed.");
        driver.navigate().back();

        elements.blogBtn.click();
        verifyPage("turkce-blog/");
        hover(elements.galeriBtn);
        waitForClickable(elements.galeriaDubai).click();
        verifyPage("dubai-gulfood-2024/");
        hover(elements.galeriBtn);
        waitForClickable(elements.galeriaWorldFood).click();
        verifyPage("world-food-istanbul-2024/");
        hover(elements.galeriBtn);
        waitForClickable(elements.galeriaGulfood).click();
        verifyPage("gulfood-2025/");
        hover(elements.galeriBtn);
        waitForClickable(elements.galeriaMusiad).click();
        verifyPage("musiad-europaeischen-tuerkischen-lebensmittelforum/");
        hover(elements.basindaBizBtn);
        waitForClickable(elements.basindaBizAltMenu).click();
        verifyPage("in-der-presse/");
        hover(elements.basindaBizBtn);
        waitForClickable(elements.TvReklamlari).click();
        verifyPage("tv-reklamlari/");
        elements.iletisimBtn.click();
        verifyPage("iletisim/");

    }

    @Test(priority = 2)
    public void NextPage(){
        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

        waitForVisible(elements.imgClose).click();
        hover(elements.shopBtn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",elements.urunlerBtn);
        verifyPage("shop/");
        hover(elements.footerSubmitBtn); //cookie engel olduğu için sayfa biraz yukarı kaydırma amacıyla kullanıldı
        waitForClickable(elements.nextPageBtn).click();
        verifyPage("page/2/");


    }

}
