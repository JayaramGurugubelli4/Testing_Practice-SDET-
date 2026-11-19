package pom;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By username=By.cssSelector("input[id='customer_email']");
    private final By password=By.cssSelector("input[id='customer_password']");
    private final By loginBtn=By.cssSelector(".action_bottom input[value='Sign In']");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public boolean checkIsLoginPage(){
        return driver.getCurrentUrl().equals("https://sauce-demo.myshopify.com/account/login");
    }
    public LoginPage userName(String name){
        WebElement element=find(username);
        element.sendKeys(name);
        return this;
    }
    public LoginPage password(String pass){
        WebElement element=find(password);
        element.sendKeys(pass);
        return this;
    }
    public LoginPage login(){
        click(loginBtn);
        return this;
    }
}
