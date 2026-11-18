package pom;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private By loginPage=By.linkText("Log In");
    private By registerPage=By.linkText("Sign up");
    public LoginPage loginpage(){
        click(loginPage);
        return new LoginPage(driver);
    }
    public RegisterPage registerpage(){
        click(registerPage);
        return new RegisterPage();
    }
}
