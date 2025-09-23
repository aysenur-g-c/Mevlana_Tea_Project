package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elements {

    public Elements(WebDriver driver){
        PageFactory.initElements(driver,this);
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

    @FindBy(xpath = "(//li[contains(@class, 'trp-language-switcher-container')])[1]")
    public WebElement LangGerman;

    @FindBy(xpath = " (//li[contains(@class, 'trp-language-switcher-container')])[2]")
    public WebElement LangEnglish;

    @FindBy(xpath = "(//li[contains(@class, 'trp-language-switcher-container')])[3]")
    public WebElement LangTurkish;

    @FindBy(xpath = "//*[@class=\"elementor elementor-449\"]")
    public WebElement Footer;

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

    @FindBy(xpath = "//h2[text()='Wir verwenden Cookies']")
    public WebElement cookieText;

    @FindBy(xpath = "//span[text()='Alle akzeptieren']")
    public WebElement cookieAcceptButton;

    @FindBy(xpath = "//span[text()='Ablehnen']")
    public WebElement cookieRejectButton;

    @FindBy(xpath ="//*[@class='woocommerce-LostPassword lost_password']")
    public WebElement forgotPasswordBtn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[@class='woocommerce-MyAccount-content']")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//*[@class='woocommerce-error']")
    public WebElement errorMessage;

    @FindBy(xpath = "//*[@id='reg_email']")
    public WebElement registerMail;

    @FindBy(xpath = "//*[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")
    public WebElement registerSubmit;

    @FindBy(xpath = "//*[@id='reg_password']")
    public WebElement registerPassword;

    @FindBy(xpath = "//*[@id='reg_username']")
    public  WebElement regUsername;

}
