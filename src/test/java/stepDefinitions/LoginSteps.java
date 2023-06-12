package stepDefinitions;

import TestComponents.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.log4testng.Logger;

public class LoginSteps extends CommonMethods {
    public static final Logger log = Logger.getLogger(LoginSteps.class);


    @Given("Launch Application")
    public void launchUATApplication() {
        launchApp();
        log.info("Successfully launch the CRM url");
    }

    @When("Logged in with username and password")
    public void loggedInWithCrmFinanceOperationCredentials() {
        loginPage.loginWithCredentials();
        log.info("Successfully login to CRM");
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.isLoginPageDisplayed();
    }

   
    @When("I click the Log In button")
    public void i_click_the_log_in_button() {
        loginPage.clickLogin();

    }

    @Then("I should see a Dashboard")
    public void i_should_see_a_dashboard() {
        loginPage.isDashboardDisplayed();

    }

   

    @Then("I should stay on the login page")
    public void i_should_stay_on_the_login_page() {
        loginPage.isLoginPageDisplayed();

    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message_saying() {
        loginPage.isErrorMessageDisplayed();

    }

    @When("I enter my username and password as{string} and {string}")
    public void iEnterMyUsernameAndPasswordAsUsernameAndPassword(String username,String password) {
        loginPage.enterCredentials(username, password);
        
    }

    @When("I enter incorrect username and password {string} and {string}")
    public void iEnterIncorrectUsernameAndPasswordUsernameAndPassword(String username,String password) {
        loginPage.enterCredentials(username, password);
    }
}
