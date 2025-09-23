package Tests.Classes;

import Utility.BaseDriverParameter;
import org.testng.annotations.Test;

public class Blog extends BaseDriverParameter {

    @Test
    public void Blog(){
        Elements elements=new Elements(driver);
        driver.get("https://mevlanacay.de/tr/");

        waitForVisible(elements.imgClose).click();

        for (int i = 0; i < elements.blogArticles.size(); i++) {

            
        }

    }
}
