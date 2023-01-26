package com.linkedin.steps;

import com.linkedin.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePageSteps {

    public void verifyIfElementsAreExist(List<String> list) {

        Assert.assertEquals(list, getTextOfTopMenuElements());
    }

    private List<String> getTextOfTopMenuElements() {

        List<WebElement> actualElements = Driver.get().findElements(By.xpath("//li[contains(@class,'global-nav__primary-item')]/a/span"));

        List<String> elements = new ArrayList<>();

        for (WebElement ele : actualElements) {
            elements.add(ele.getAttribute("title"));
        }

        return elements;
    }
}
