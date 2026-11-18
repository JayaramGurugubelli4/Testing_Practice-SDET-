package pom;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    private final By firstName=By.id("first_name");
    private final By lastName=By.id("last_name");
    private final By email=By.id("email");
    private final By password=By.id("password");
    private final By regisetrBtn=By.cssSelector(".action_bottom input");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public boolean isRegisterationPage(){
        return driver.getCurrentUrl().equals("https://sauce-demo.myshopify.com/account/register");
    }
    public void register(String first,String last,String em,String pass){
        WebElement element=find(firstName);
        element.sendKeys(first);
        WebElement element1=find(lastName);
        element1.sendKeys(last);
        WebElement element2=find(email);
        element2.sendKeys(em);
        WebElement element3=find(password);
        element3.sendKeys(pass);
        click(regisetrBtn);
    }

}
