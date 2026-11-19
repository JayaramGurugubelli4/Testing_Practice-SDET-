package pom;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    private final By firstName=By.cssSelector("input[id='first_name']");
    private final By lastName=By.cssSelector("input[id='last_name']");
    private final By email=By.cssSelector("input[id='email']");
    private final By password=By.cssSelector("input[id='password']");
    private final By registerBtn=By.cssSelector(".action_bottom input");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public boolean isRegisterationPage(){
        return driver.getCurrentUrl().equals("https://sauce-demo.myshopify.com/account/register");
    }
    public RegisterPage register(){
        click(registerBtn);
        return this;
    }
    public RegisterPage firstName(String name){
        WebElement element=find(firstName);
        element.sendKeys(name);
        return this;
    }
    public RegisterPage lastName(String last){
        WebElement element=find(lastName);
        element.sendKeys(last);
        return this;
    }
    public RegisterPage email(String em){
        WebElement element=find(email);
        element.sendKeys(em);
        return this;
    }
    public RegisterPage password(String pass){
        WebElement element=find(password);
        element.sendKeys(pass);
        return this;
    }
    public boolean isRegistrationSuccess(){
        return "https://sauce-demo.myshopify.com/".equals(driver.getCurrentUrl());
    }
    public HomePage goToHomePage(){
        return new HomePage(driver);
    }
}
