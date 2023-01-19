package com.linkedin.steps;

import com.linkedin.pages.LoginPage;
import com.linkedin.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginSteps extends LoginPage{

    private List<WebElement> logOut;

    public void enterEmail(String email) {
        emailArea.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordArea.sendKeys(password);
    }

    public void confirmLogin() {
        logOut=Driver.get().findElements(By.xpath("//div[contains(@class,'me-content')]"));
        Assert.assertTrue(logOut.size()>0);
        Driver.closeDriver();
    }

    public void confirmNotLogin() {
        Assert.assertTrue(Driver.get().getCurrentUrl().contains("login-submit"));
        Driver.closeDriver();
    }

}
