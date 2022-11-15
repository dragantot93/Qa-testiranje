package com.code.demoblaze.tests;

import com.code.demoblaze.models.User;
import com.code.demoblaze.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {

    //Prvi zadatak
    @Test
    public void verifyLogIn() {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login(new User("test", "test"));
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        Assert.assertTrue(mainPage.verifyIsWelcomeBtnPresent());


    }

    @Test
    public void verifyLogInWithoutUsername() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login(new User("", "test"));
        Thread.sleep(3000);
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Please fill out Username and Password.");


    }

    @Test
    public void verifyLogInWithoutPassword() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login(new User("test", ""));
        Thread.sleep(3000);
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Please fill out Username and Password.");


    }

    @Test
    public void verifyLogInWithoutCredentials() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login(new User("", ""));
        Thread.sleep(3000);
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Please fill out Username and Password.");


    }

    @Test
    public void verifyLogInWithWrongUsername() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login(new User("LetsTest123", "123456"));
        Thread.sleep(3000);
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "User does not exist.");


    }

    @Test
    public void verifyLogInWithWrongPassword() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);

        mainPage.openPage();
        Assert.assertFalse(mainPage.verifyIsWelcomeBtnPresent());

        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login(new User("test", "testtest123"));
        Thread.sleep(3000);
        String alertTextMsg = mainPage.getAlertTextMsg();
        mainPage.acceptAlert();

        Assert.assertEquals(alertTextMsg, "Wrong password.");


    }


}
