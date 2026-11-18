package factoryRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
    private final ThreadLocal<WebDriver> factory=new ThreadLocal<>();
    private WebDriver driver;
    public void setUp(){
        driver =new ChromeDriver();
        factory.set(driver);
    }
    public WebDriver getDriver(){
        if(factory.get()!=null){
            return factory.get();
        }
        return null;
    }
    public void tearDown(){
        if(factory.get()!=null){
            factory.remove();
        }
    }
}
