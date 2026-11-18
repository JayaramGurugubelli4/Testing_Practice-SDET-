package baseTest;

import factoryRunner.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    DriverFactory driverFactory;
    @BeforeMethod
    public void beforeClass(){
        driverFactory =new DriverFactory();
        driverFactory.setUp();
        driver= driverFactory.getDriver();
        driver.get("https://sauce-demo.myshopify.com/");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterClass(){
        if(driver!=null) {
            driver.close();
            driverFactory.tearDown();
        }
    }
}
