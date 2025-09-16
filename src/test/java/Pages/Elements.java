package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Elements {
    public Elements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }





}
