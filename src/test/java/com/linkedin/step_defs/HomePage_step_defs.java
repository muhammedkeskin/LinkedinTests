package com.linkedin.step_defs;

import com.linkedin.steps.HomePageSteps;
import com.linkedin.utils.Driver;
import io.cucumber.java.en.Then;

import java.util.List;

public class HomePage_step_defs extends HomePageSteps{

    @Then("User should see the following elements")
    public void user_should_see_the_following_elements(List<String> expectedElements) {
        verifyIfElementsAreExist(expectedElements);
        Driver.closeDriver();
    }

    @Then("User should click every main {string} on Home as expected")
    public void userShouldClickEveryMainOnHomeAsExpected(String optionalElement) {
        clickOnElement(optionalElement);
        Driver.closeDriver();
    }
}
