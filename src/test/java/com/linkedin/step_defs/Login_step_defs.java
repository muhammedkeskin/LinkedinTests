package com.linkedin.step_defs;

import com.linkedin.steps.LoginSteps;
import com.linkedin.utils.ConfigurationReader;
import com.linkedin.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_step_defs extends LoginSteps{


    @Given("User navigate to login page")
    public void user_navigate_to_login_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("User enter valid email")
    public void user_enter_valid_email() {
        String validEmail = ConfigurationReader.get("validEmail");
        enterEmail(validEmail);
    }

    @When("User enter valid password")
    public void user_enter_valid_password() {
        String validPassword = ConfigurationReader.get("validPassword");
        enterPassword(validPassword);
        acceptAndJoinButton.click();
    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        confirmLogin();
    }

    @And("User enter invalid password")
    public void userEnterInvalidPassword() {
        String invalidPassword=ConfigurationReader.get("invalidP");
        enterPassword(invalidPassword);
        acceptAndJoinButton.click();
    }

    @Then("User should not be able to login")
    public void user_should_not_be_able_to_login() {
        confirmNotLogin();
    }

    @And("User enter invalid email")
    public void userEnterInvalidEmail() {
        String invalidPassword = ConfigurationReader.get("invalidE");
        enterEmail(invalidPassword);
    }

    @And("User enter missing password")
    public void userEnterMissingPassword() {
        String missingPassword = ConfigurationReader.get("missingP");
        enterPassword(missingPassword);
        acceptAndJoinButton.click();
    }

    @Then("User should see the warning about missing password")
    public void userShouldSeeTheWarningAboutMissingPassword() {
        missingPasswordWarning();
    }
}
