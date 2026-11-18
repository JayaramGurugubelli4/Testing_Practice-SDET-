package pom;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By username=By.id("customer_email");
    private By password=By.id("customer_password");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public boolean checkIsLoginPage(){
        return driver.getCurrentUrl().equals("https://sauce-demo.myshopify.com/account/login");
    }
}
