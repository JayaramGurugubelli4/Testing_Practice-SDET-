package baseTest;

import factoryRunner.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    DriverFactory driverFactory;
    @BeforeClass
    public void beforeClass(){
        driverFactory =new DriverFactory();
        driverFactory.setUp();
        driver= driverFactory.getDriver();
        driver.get("https://sauce-demo.myshopify.com/");
        driver.manage().window().maximize();
    }
    @AfterClass
    public void afterClass(){
        if(driver!=null) {
            driver.close();
            driverFactory.tearDown();
        }
    }
}
