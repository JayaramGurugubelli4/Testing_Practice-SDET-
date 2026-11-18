package testFiles;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import pom.RegisterPage;

public class FirstTest extends BaseTest {
    private LoginPage loginpage;
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test(testName = "TC_0001")
    public void loginTest(){
        homePage=new HomePage(driver);
        loginpage=homePage.loginpage();

       Assert.assertTrue(loginpage.checkIsLoginPage());
    }
    @Test(testName = "TC_0002")
    public void registrationTest(){
        homePage=new HomePage(driver);
        registerPage=homePage.registerpage();
        Assert.assertTrue(registerPage.isRegisterationPage());
        registerPage.register("Jayaram","Gurugubelli","jayaram@gmail.com","Jayaram@123");
    }
}
