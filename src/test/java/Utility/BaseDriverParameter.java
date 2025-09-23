package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.time.*;

public class BaseDriverParameter {

    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    @Parameters("BrowserTipi")
    public void Setup(String browserTipi) {
        switch (browserTipi.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public WebElement waitForVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void hover(WebElement element) {
        new Actions(driver).moveToElement(element).perform();
    }

    public void verifyPage(String expectedUrlPart) {
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlPart),"Page verification failed");
    }


    @AfterClass
    public void TearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
