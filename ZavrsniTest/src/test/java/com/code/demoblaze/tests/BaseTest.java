package com.code.demoblaze.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gagi\\Desktop\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterClass
    public void afterClass() {
        driver.close();
        driver.quit();
    }


}








