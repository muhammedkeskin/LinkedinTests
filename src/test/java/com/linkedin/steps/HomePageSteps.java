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

    public void clickOnElement(String element) throws InterruptedException {
        Driver.get().findElement(By.xpath("//span[@title='"+element+"']")).click();
        Thread.sleep(10000);
        String currentUrl = Driver.get().getCurrentUrl();
        if (element.equals("Home")) {
            Assert.assertTrue(currentUrl.contains("feed"));
        }else {
            Assert.assertTrue(currentUrl.contains(element.toLowerCase().replace(" ","")));
        }
    }

    public void checkUrl(String element, String urlPart) {
        Driver.get().findElement(By.xpath("//span[@title='"+element+"']")).click();

        String url=Driver.get().getCurrentUrl();
        Assert.assertTrue(url.contains(urlPart));

    }

}
