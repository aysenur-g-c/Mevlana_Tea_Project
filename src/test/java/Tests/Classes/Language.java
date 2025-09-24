package Tests.Classes;

import Pages.Elements;
import Utility.BaseDriverParameter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Language extends BaseDriverParameter {
    @Test
    public void languageOptions(){

        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de");

        elements.LangGerman.isDisplayed();
        Assert.assertTrue(elements.LangGerman.isDisplayed(),"German language option is not visible.");

        elements.LangEnglish.isDisplayed();
        Assert.assertTrue(elements.LangEnglish.isDisplayed(),"English language option is not visible.");

        elements.LangTurkish.isDisplayed();
        Assert.assertTrue(elements.LangTurkish.isDisplayed(),"Turkish language option is not visible.");


    }


    public void selectLanguageAndVerify(WebElement languageElement, String expectedURL){
        languageElement.click();
        wait.until(ExpectedConditions.urlContains(expectedURL));
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedURL),"The URL did not change to"+expectedURL+"version");
        closePopUpIfPresent(driver);
    }

    @Test
    public void testLanguageSwitching (){

        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de");

        selectLanguageAndVerify(elements.LangGerman,"de");
        selectLanguageAndVerify(elements.LangEnglish,"/en/");
        selectLanguageAndVerify(elements.LangTurkish,"/tr/");

    }




    @Test
    public void testContentLanguage(String lang){




    }




    @DataProvider(name="Languages")
    public Object[][] languageSettings()
    {
        Map<String, Map<String, String[]>> footerParts = new HashMap<>();

        footerParts.put("de", Map.of(
                "texts", new String[]{
                        "Unsere E-Mailliste","Adresse","Telefon","Folgen Sie dem Genuss!",
                        "Zahlungsmodalitäten","Mevlana Tee","Über uns","Produkte"
                },
                "subTexts",new String[]{
                        "Tragen Sie sich in unsere E-Mailliste ein und bleiben Sie mit aktuellsten Angeboten af dem Laufenden!","Mo – Fr: 09:00 – 18:00",
                        "Home", "Datenschutz", "AGB", "Impressum", "Kontakt",
                        "Wer sind wir?", "Mevlana Tee Türkei", "Häufig gestellte Fragen", "TV-Spots", "Produkte",
                        "Mevlana Tee 500g", "Mevlana Tee 1000g", "Mevlana Tee Schwarzer", "Beuteltee", "Mevlana Tee Grüner Beuteltee",
                        "Mevlana Tee Cardamom Beuteltee", "Mevlana Tee Schwarzer Beuteltee 100", "Mevlana Tee 500g + Metal Dose 500g",
                        "Copyright © 2022 Mevlâna Tee – Goran Tee." + "\n" + "Alle Rechte vorbehalten","Gestaltung"
                }
        ));

        footerParts.put("en", Map.of(
                "texts", new String[]{
                        "Our E-Mail List","Address","Telephone","Follow the Flavor!",
                        "Payment Methods","Mevlana Tea","About Us","Products"
                },
                "subTexts", new String[]{
                        "By signing up for our e-mail list, you can be informed about the most up-to-date campaigns and opportunities.","Mo – Fr: 09:00 – 18:00",
                        "Home","Privacy policy","Distance Sales Agreement","Delivery and Return Policy","Contact",
                        "Who are we?","Frequently Asked Questions","TV-Spots","Products",
                        "Mevlana Tea 500g","Mevlana Tea 1000g","Mevlana Tea Black Tea Bags","Mevlana Tea Green Tea Bag",
                        "Copyright © 2022 Mevlâna Tea – Goran Tee." + "\n" + "All Rights Reserved.","Design"
                }

        ));
        footerParts.put("tr", Map.of(
                "texts", new String[]{
                        "E-Posta Listemiz","Adres","Telefon","Bu Lezzeti Takip Edin",
                        "Ödeme Yöntemleri","Mevlana Çay","Hakkımızda","Ürünler"
                },
                "subTexts", new String[]{
                        "E-Posta listemize kaydolarak, en güncel kampanya ve fırsatlardan haberdar olabilirsiniz.","Pzt – Cum: 09:00 – 18:00",
                        "Anasayfa","Gizlilik Politikası","Mesafeli Satış Sözleşmesi","Teslimat ve İade Koşulları","İletişim",
                        "Biz kimiz?","Sıkça Sorulan Sorular","TV Reklamları","Ürünler",
                        "Mevlana Çay 500g","Mevlana Çay 1000g","Mevlana Çay Siyah Çay Poşetleri","Mevlana Çay Yeşil Çay Poşeti",
                        "Copyright © 2022 Mevlâna Çay – Goran Tee." + "\n" + "Tüm Hakları Saklıdır.","Tasarım"
                }
        ));


        return new Object[][] {
                {"de", footerParts.get("de").get("texts"), footerParts.get("de").get("subTexts")},
                {"en", footerParts.get("en").get("texts"), footerParts.get("en").get("subTexts")},
                {"tr", footerParts.get("tr").get("texts"), footerParts.get("tr").get("subTexts")}
        };
    }


    @Test(dataProvider = "Languages")
    public void testFooterLangChange(String language,String[] texts,String[] subTexts){
        Elements elements=new Elements(driver);
        String url="https://mevlanacay.de/"+language;
        driver.get(url);

        wait.until(ExpectedConditions.visibilityOf(elements.Footer));
        for (String text:texts){
            boolean isPresent = elements.Footer.getText().contains(text);
            Assert.assertTrue(isPresent, "Texts are not found: " + text + " (Language: " + language + ")");

        }

        for (String sub: subTexts) {
            boolean isPresent = elements.Footer.getText().contains(sub);
            Assert.assertTrue(isPresent, "Subtexts are not found: " + sub + " (Language: " + language + ")");
        }
    }


}
