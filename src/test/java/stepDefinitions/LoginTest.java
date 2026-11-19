package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.HomePage;
import pom.LoginPage;

public class LoginTest extends Hooks {
    private LoginPage homePage;
    private LoginPage loginPage;
    @Given("User enters into the login page")
    public void user_enters_into_the_login_page() {
        homePage=new HomePage(driver).loginpage();
    }
    @When("enters the details")
    public void enters_the_details(io.cucumber.datatable.DataTable dataTable) {
        homePage.userName("").password("").login();
    }
    @Then("homepage will display")
    public void homepage_will_display() {

    }
}
