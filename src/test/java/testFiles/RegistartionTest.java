package testFiles;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.RegisterPage;

public class RegistartionTest extends BaseTest {
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test(testName = "TC_0002",description = "Testing the Registration Feature")
    public void registrationTest(){
        homePage=new HomePage(driver);
        registerPage=homePage.registerpage()
                .firstName("Nani1")
                .lastName("Hanumansetti1")
                .email("nani@gmail1.com")
                .password("Nani1@2205")
                .register();
        //Assert.assertTrue(registerPage.isRegisterationPage());
        Assert.assertTrue(registerPage.isRegistrationSuccess());
    }
}
