package com.code.demoblaze.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnAddToCart() {
        return driver.findElement(By.cssSelector("a[class*='btn']"));
    }

    public WebElement cartPageBtn() {

        return driver.findElement(By.cssSelector("#cartur"));
    }

    public By locatorBtnAddToCart() {

        return By.cssSelector("a[class*='btn']");
    }

    public void clickBtnAddToCart() {

        getBtnAddToCart().click();
    }

    public void acceptAlertAfterAddingItem() {

        driver.switchTo().alert().accept();
    }

    public void openCartPage() {

        cartPageBtn().click();
    }

    public void openHomePage() {

        driver.findElement(By.cssSelector("a[href='index.html']")).click();
    }

}
