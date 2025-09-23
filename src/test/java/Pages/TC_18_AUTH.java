package Pages;

import Utility.BaseDriverParameter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_18_AUTH extends BaseDriverParameter {
    private WebDriver driver;
    private final String validEmail="edaylm47@gmail.com";


    @Test
    public void checkSignup (){
        // None of the locators worked. I couldn't find it.



    }

    @Test
    public void showWarningMessage(){

        Elements elements=new Elements(driver);
        elements.regUsername.sendKeys(" ");
        elements.registerMail.sendKeys(" ");
        elements.registerPassword.sendKeys(" ");
        elements.registerSubmit.click();

        Assert.assertTrue(elements.errorMessage.isDisplayed(),"The message is not shown.");

    }


    @Test
    public void invalidEmailSignUp(){

        // In this part, there is a bug.
        Elements elements=new Elements(driver);
        elements.registerMail.sendKeys("user23@gmail.com");
        elements.registerSubmit.click();

        Assert.assertTrue(elements.errorMessage.isDisplayed(),"Error message is not shown for invalid email."  );




    }

    @Test
    public void createUserWithValidInfo(){
        Elements elements=new Elements(driver);

        elements.registerMail.sendKeys(validEmail);
        elements.registerPassword.sendKeys("Mevlanacay.12345");
        elements.registerSubmit.click();
        Assert.assertTrue(elements.welcomeMessage.isDisplayed(),"The message is not visible.");

    }

    @Test
    public void errorOnDuplicateEmail(){
        Elements elements=new Elements(driver);
        elements.registerMail.sendKeys(validEmail);
        elements.registerSubmit.click();
        Assert.assertTrue(elements.errorMessage.isDisplayed(),"The error message is not visible.");



    }

    @Test
    public void emailPasswordVisible(){

        Elements elements= new Elements(driver);
        Assert.assertTrue(elements.usernameInput.isDisplayed(),"Username or email field is not visible.");
        Assert.assertTrue(elements.passwordInput.isDisplayed(),"Password field is not visible.");
        System.out.println("The username and password fields are visible.");



    }

    @DataProvider(name="invalidPasswords")
    public Object[][] provideInvalidPassword(){
        return new Object[][]{
                {"wrongpass123456"},
                {"invalidddd234!!!"},
                {""},

        };
    }

    @Test(dataProvider = "invalidPasswords")
    public void invalidPasswordWarning(String invalidPassword){

        Elements elements=new Elements(driver);
        elements.usernameInput.clear();
        elements.usernameInput.sendKeys(validEmail);

        elements.passwordInput.clear();
        elements.passwordInput.sendKeys(invalidPassword);

        elements.submitBtn.click();

        Assert.assertTrue(elements.errorMessage.isDisplayed(),"Error message not displayed for password");


    }

    @Test
    public void  userRedirectedAfterLogin(){
        Elements elements= new Elements(driver);
        elements.usernameInput.sendKeys(validEmail);
        elements.passwordInput.sendKeys("Mevlanacay.12345");
        elements.submitBtn.click();
        Assert.assertTrue(elements.welcomeMessage.isDisplayed(),"Login failed.The message is not visible. ");

    }

    @Test
    public void forgotPasswordLinkIsClickable(){
        Elements elements=new Elements(driver);

        if (elements.forgotPasswordBtn.isDisplayed() && elements.forgotPasswordBtn.isEnabled()){
            elements.forgotPasswordBtn.click();

            String currentUrl= driver.getCurrentUrl();

            if (currentUrl.contains("lost-password")){
                System.out.println("The user redirected to password reset page.");

            } else {
                System.out.println("The user didn't redirect to password reset page.");
            }


        } else
            System.out.println("Forgot password link is not visible and clickable.");


    }
}



