package com.code.demoblaze.pages;

import com.sun.jdi.IntegerType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductTable() {

        return driver.findElement(By.cssSelector("#tbodyid"));
    }

    public WebElement totalPriceWebElement() {

        return driver.findElement(By.cssSelector("#totalp"));

    }

    public WebElement getDeleteBtn() {

        return driver.findElement(By.cssSelector("a[onclick*='delete']"));
    }

    public List<WebElement> getProductTableRows() {

        return driver.findElements(By.xpath("//tbody /tr"));
    }

    public List<WebElement> productsNamesInProductTable() {

        return getProductTable().findElements(xpath("//tbody /tr /td[2]"));
    }

    public List<WebElement> productsPricesInProductTable() {

        return getProductTable().findElements(xpath("//tbody /tr /td[3]"));
    }

    public By allProductsTableRowsLocator() {

        return By.xpath("//tbody /tr");
    }

    public boolean verifyIfProductsPriceEqualsTotalPrice() {

        List<WebElement> webElementList = productsPricesInProductTable();
        int totalPrice = Integer.parseInt(totalPriceWebElement().getText());
        int sumProductPrices = 0;

        for (int i = 0; i < webElementList.size(); i++) {
            sumProductPrices = sumProductPrices + Integer.parseInt(webElementList.get(i).getText());
        }

        if (sumProductPrices == totalPrice) {
            return true;

        }

        else return false;
    }

    public void clearCartAndReturnToMainPage() throws InterruptedException {

        while (true) {

            WebElement button = null;

            try {

                button = getDeleteBtn();

            } catch (NoSuchElementException ex) {

                break;
            }

            if (button.isDisplayed() == false) {

                break;

            }

            button.click();
            Thread.sleep(3000);

        }

        driver.get("https://www.demoblaze.com/");
        Thread.sleep(3000);

    }

    public int findAddedProductAndGetPrice(String name) {

        int returnPrice = 0;
        List<WebElement> cartTableRows = getProductTableRows();

        for (int i = 0; i < cartTableRows.size(); i++) {

            if (productsNamesInProductTable().get(i).getText().equals(name)) {

                returnPrice = Integer.parseInt(productsPricesInProductTable().get(i).getText());
            }
        }

        return returnPrice;
    }

    public boolean verifyIsAddedProductInCartTable(String name) {

        List<WebElement> productTableRows = getProductTableRows();

        boolean ToReturn = false;

        for (int i = 0; i < productTableRows.size(); i++) {

            if (productsNamesInProductTable().get(i).getText().equals(name)) {

                ToReturn = true;
            }

        }

        return ToReturn;
    }

    public List<String> listOfProductNamesInCartTable() {

        List<WebElement> productsInCartTable = productsNamesInProductTable();
        List<String> listOfProductNamesInCartTable = new ArrayList<>();

        for (int i = 0; i < productsInCartTable.size(); i++) {

            listOfProductNamesInCartTable.add(productsInCartTable.get(i).getText());

        }


        return listOfProductNamesInCartTable;

    }

    public List<Integer> listOfProductPricesInCartTable() {

        List<WebElement> pricesOfProductsInCartTable = productsPricesInProductTable();
        List<Integer> listOfProductPricesInCartTable = new ArrayList<>();

        for (int i = 0; i < pricesOfProductsInCartTable.size(); i++) {

            listOfProductPricesInCartTable.add(Integer.parseInt(pricesOfProductsInCartTable.get(i).getText()));

        }


        return listOfProductPricesInCartTable;


    }


}









