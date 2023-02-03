package com.linkedin.step_defs;

import com.linkedin.steps.HomePageSteps;
import com.linkedin.utils.Driver;
import io.cucumber.java.en.Then;

import java.util.List;

public class HomePage_step_defs extends HomePageSteps {

    @Then("User should see the following elements")
    public void user_should_see_the_following_elements(List<String> expectedElements) {
        verifyIfElementsAreExist(expectedElements);
        Driver.closeDriver();
    }

    @Then("User should click every main {string} on Home as expected")
    public void userShouldClickEveryMainOnHomeAsExpected(String optionalElement) throws InterruptedException {
        Thread.sleep(10000);
        clickOnElement(optionalElement);
        Driver.closeDriver();
    }

    @Then("User should click every main {string} and check {string} on Home Page")
    public void userShouldClickEveryMainAndCheckOnHomePage(String element, String urlPart) {
        checkUrl(element,urlPart);
        Driver.closeDriver();
    }
}

