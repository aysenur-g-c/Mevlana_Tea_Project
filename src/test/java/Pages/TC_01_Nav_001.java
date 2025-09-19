package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class TC_01_Nav_001 extends BaseDriverParameter {

    @Test
    public void Anasayfa(){
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

        waitForClickable(elements.morgenMrktBtn); //açılmadı buraya bak
        //komple farklı bir link var ayrı assert at
        //sayfada geri gel ekle

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

}
