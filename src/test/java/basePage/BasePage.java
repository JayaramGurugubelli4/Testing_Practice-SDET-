package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected final FluentWait<WebDriver> wait;
    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
    }
    public WebElement find(By selector){
        return wait.until(driver1 -> driver1.findElement(selector));
    }
    public void click(By selector){
        WebElement element=find(selector);
        element.click();
    }

    public void sendKeys(By selector,String data){
        WebElement element=find(selector);
        element.clear();
        element.sendKeys(data);
    }
    public String getText(By selector){
        return find(selector).getText();
    }
}
