package testFiles;

import basePage.BasePage;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import pom.RegisterPage;

public class FirstTest extends BaseTest {
    private LoginPage loginpage;
    private HomePage homePage;
    @Test
    public void firstTest(){
        homePage=new HomePage(driver);
        homePage.loginpage();
        loginpage=new LoginPage(driver);
       Assert.assertTrue(loginpage.checkIsLoginPage());
    }
}
