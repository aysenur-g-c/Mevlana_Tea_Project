package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {
    public Elements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title='Close']")
    public WebElement imgClose;

    @FindBy(xpath = "//ul[@id='menu-1-f3bd2bf']/li[1]")
    public WebElement anasayfaBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[2]")
    public WebElement hakkimizdaBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[3]")
    public WebElement shopBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[4]")
    public WebElement blogBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[5]")
    public WebElement galeriBtn;

    @FindBy(xpath = "(//*[text()='Dubai Gulfood 2024'])[1]")
    public WebElement galeriaDubai;

    @FindBy(xpath = "(//*[text()='World Food Istanbul 2024'])[1]")
    public WebElement galeriaWorldFood;

    @FindBy(xpath = "(//*[text()='Gulfood 2025'])[1]")
    public WebElement galeriaGulfood;

    @FindBy(xpath = "(//*[text()='MÜSİAD Avrupa Türk Gıda Forumu'])[1]")
    public WebElement galeriaMusiad;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[6]")
    public WebElement basindaBizBtn;

    @FindBy(xpath = "(//*[text()='Basında Biz'])[2]")
    public WebElement basindaBizAltMenu;

    @FindBy(xpath = "(//*[text()='TV Reklamları'])[1]")
    public WebElement TvReklamlari;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[7]")
    public WebElement iletisimBtn;

    @FindBy(xpath = "//*[text()='Ürünler']")
    public WebElement urunlerBtn;

    @FindBy(xpath = "(//*[text()='Morgenmarkt'])[1]")
    public WebElement morgenMrktBtn;

    @FindBy(xpath = "(//*[text()='Mevlana Çay'])[4]")
    public WebElement mevlanaCayBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[3]//li[2]")
    public WebElement mimarSinanCayBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[3]//li[3]")
    public WebElement sindbadCayBtn;


    // US_LANG

    @FindBy(xpath = "(//li[contains(@class, 'trp-language-switcher-container')])[1]")
    WebElement LangGerman;

    @FindBy(xpath = " (//li[contains(@class, 'trp-language-switcher-container')])[2]")
    WebElement LangEnglish;

    @FindBy(xpath = "(//li[contains(@class, 'trp-language-switcher-container')])[3]")
    WebElement LangTurkish;

    @FindBy(xpath = "//*[@class=\"elementor elementor-449\"]")
    WebElement Footer;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement footerEmailBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement footerSubmitBtn;

    @FindBy(xpath = "//*[@class='sib_msg_disp']/p")
    public WebElement footerInfoMsg;

    @FindBy(xpath = "//*[@class='next page-numbers']")
    public WebElement nextPageBtn;

    @FindBy(xpath = "(//*[@class='elementor-widget-container']/p)[2]")
    public WebElement footerAddress;

    @FindBy(xpath = "(//*[text()='info@mevlanacay.de'])[2]")
    public WebElement footerMail;

    @FindBy(xpath = "(//*[@class='elementor-widget-container']/p)[3]")
    public WebElement footerTel;

    @FindBy(xpath = "(//*[@class='elementor-grid-item'])[1]")
    public WebElement footerFacebookIcon;

    @FindBy(xpath = "(//*[@class='elementor-grid-item'])[2]")
    public WebElement footerYoutubeIcon;

    @FindBy(xpath = "(//*[@class='elementor-grid-item'])[3]")
    public WebElement footerXIcon;

    @FindBy(xpath = "(//*[@class='elementor-grid-item'])[4]")
    public WebElement footerInstagramIcon;


    // PROD 1 -- 2--

    @FindBy(xpath = "//div[@class='elementor-button-wrapper']/a/span/span[text()='Tüm Ürünler']")
    public WebElement allProductsBtn;

    @FindBy(xpath = "//ul[@class='products columns-3']/li//h3/a")
    public List<WebElement> nameProducts;

    @FindBy(xpath = "//ul[@class='products columns-3']/li//span[contains(@class, 'price')]")
    public List<WebElement> prices;

    @FindBy(xpath = "//ul[@class='products columns-3']/li//a[contains(@class, 'add_to_cart_button')]")
    public List<WebElement> addtoCart;

    @FindBy(xpath = "//span[contains(text(), 'Stokta Yok')]")
    public List<WebElement> noStockTexts;

//    @FindBy(xpath = "//*[contains(text(),'Mevlana Dökme Siyah Seylan Çay | Goran Tee | 1 Paket, 1000 g')]")
//    public WebElement firstProduct;
//
//    @FindBy(xpath = "//div[@class='summary entry-summary']/p/span/bdi")
//    public WebElement pricePrdct;
//
//    @FindBy(xpath = "//*[text()='Sepete Ekle']")
//    public WebElement firstBtnAddtoCart;
//    @FindBy(xpath = "//*[contains(text(),'Mimar Sinan Bergamot Aromalı Siyah Seylan Çay | Goran Tee 800g')]")
//    public WebElement secondProduct;
//
//    @FindBy(xpath = "//*[contains(text(),'Mimar Sinan Bergamot Aromalı Siyah Seylan Çay | Goran Tee 400g')]")
//    public WebElement thirdProduct;
//
//    @FindBy(xpath = "//*[contains(text(),'Mevlana Dökme Siyah Seylan Çay | Goran-Tee | 1 Paket, 500g')]")
//    public WebElement fourthProduct;
//
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(),'Mevlana Tee, CEYLON, GORAN TEE,')]")
//    public WebElement fifthProduct;

//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Mevlana Poşet')]")
//    public WebElement sixthProduct;
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Mevlana Siyah')]")
//    public WebElement seventhProduct;
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Mevlana Seylan')]")
//    public WebElement eighthProduct;
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Mevlana Yeşil Çay | 25 Poşetlik Paket')]")
//    public WebElement ninthProduct;
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Mevlana Kakule Aromalı Siyah Çay | 25 Poşetlik')]")
//    public WebElement tenthProduct;
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Mevlana Kakule Aromalı Siyah Çay | 6lı Poşet Çay Seti')]")
//    public WebElement eleventhProduct;
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Mevlana Yeşil Çay | 6 Paketlik Poşet Çay Seti')]")
//    public WebElement twelfthProduct;
//
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Sindbad Dökme Siyah Çay | Saf Seylan Çay | 1000g')]")
//    public WebElement thirteenthProduct;
//
//    @FindBy(xpath = "//h3[@class='woocommerce-loop-product__title']/a[contains(text(), 'Sindbad Dökme Siyah Çay | Saf Seylan Çay | 500g')]")
//    public WebElement fourteenthProduct;


    /// /////////////////////////////////////////
    @FindBy(xpath = "//h2[text()='Wir verwenden Cookies']")
    public WebElement cookieText;

    @FindBy(xpath = "//span[text()='Alle akzeptieren']")
    public WebElement cookieAcceptButton;

    @FindBy(xpath = "//span[text()='Ablehnen']")
    public WebElement cookieRejectButton;

}
