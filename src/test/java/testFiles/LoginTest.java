package testFiles;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.LoginPage;
import pom.RegisterPage;

public class LoginTest extends BaseTest {
    private LoginPage loginpage;
    private HomePage homePage;
    @Test(testName = "TC_0001",description = "Testing the Login Feature")
    public void loginTest(){
        homePage=new HomePage(driver);
       //Assert.assertTrue(loginpage.checkIsLoginPage());
        loginpage=homePage.loginpage()
                .userName("nani@gmail.com")
                .password("Nani@2205")
                .login();
    }
}
