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

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[3]//li[1]")
    public WebElement urunlerBtn;

    @FindBy(xpath = "(//*[text()='Morgenmarkt'])[1]")
    public WebElement morgenMrktBtn;

    @FindBy(xpath = "(//*[text()='Mevlana Çay'])[4]")
    public WebElement mevlanaCayBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[3]//li[2]")
    public WebElement mimarSinanCayBtn;

    @FindBy(xpath = "//*[@id='menu-1-f3bd2bf']/li[3]//li[3]")
    public WebElement sindbadCayBtn;









}
