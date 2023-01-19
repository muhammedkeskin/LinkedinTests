package com.linkedin.pages;

import com.linkedin.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement emailArea;

    @FindBy(id = "session_password")
    public WebElement passwordArea;

    @FindBy(css = ".sign-in-form__submit-button")
    public WebElement acceptAndJoinButton;
}
