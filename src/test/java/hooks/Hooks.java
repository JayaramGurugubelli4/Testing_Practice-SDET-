package hooks;

import factoryRunner.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
public class Hooks {
    protected WebDriver driver;
    protected DriverFactory driverFactory;
    @Before
    public void before(){
        driverFactory=new DriverFactory();
        driver=driverFactory.getDriver();
        driver.get("");
        driver.manage().window().maximize();
    }
    @After
    public void after(){
        if(driver!=null){
            driver.quit();
            driverFactory.tearDown();
        }
    }

}
