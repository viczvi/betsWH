package core;

import org.openqa.selenium.*;

public class Actions extends AbstractTest {
//This class contains basic actions on UI elements; therefore, it is a part of Core of this mini framework and can be
//used in different PageObjects

    public static void navigateToUrl(String url){
        webDriver.get(url);
    }

    public static void clickOnElement(String elementXpath) {
        WebElement webElement = webDriver.findElement(By.xpath(elementXpath));
        webElement.click();

    }

    public static void enterText(String elementXpath, String text){
        WebElement webElement = webDriver.findElement(By.xpath(elementXpath));
        webElement.sendKeys(text);
    }

    public static String getTextFromElement(String elementXpath){
        WebElement webElement = webDriver.findElement(By.xpath(elementXpath));
        return webElement.getText();
    }
}
