package pom;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public boolean checkIsLoginPage(){
        return driver.getCurrentUrl().equals("https://sauce-demo.myshopify.com/account/login");
    }
}
