package com.code.demoblaze.tests;

import com.code.demoblaze.models.Product;
import com.code.demoblaze.pages.CartPage;
import com.code.demoblaze.pages.MainPage;
import com.code.demoblaze.pages.ProductPage;
import com.code.demoblaze.provider.ProductsProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartTests extends BaseTest {

    // Drugi zadatak (dodavanje svih proizvoda u slučaju da se korpa prethodno očisti, pa potom uporediti Total price)
    @Test
    public void verifyTotalPriceAddingAllProductItemsAfterClearCart() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(3000);

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        Thread.sleep(2000);
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);

        mainPage.addItemToCartByName("Samsung galaxy s6");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Nokia lumia 1520");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Nexus 6");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Samsung galaxy s7");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Iphone 6 32gb");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Sony xperia z5");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("HTC One M9");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Sony vaio i5");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Sony vaio i7");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Apple monitor 24");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("MacBook air");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Dell i7 8gb");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("2017 Dell 15.6 Inch");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("ASUS Full HD");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("MacBook Pro");
        Thread.sleep(2000);
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        productPage.openCartPage();
        Thread.sleep(2000);

        Assert.assertEquals(true, cartPage.verifyIfProductsPriceEqualsTotalPrice());

    }

    // Drugi zadatak (dodavanje svih proizvoda i u slučaju kada nešto već postoji u korpi, pa potom uporediti Total price)
    @Test
    public void verifyTotalPriceAddingAllProductItems() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        CartPage cartPage = new CartPage(driver);

        ProductPage productPage = new ProductPage(driver);

        mainPage.addItemToCartByName(new Product("Samsung galaxy s6"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Nokia lumia 1520"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Nexus 6"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Samsung galaxy s7"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Iphone 6 32gb"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Sony xperia z5"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("HTC One M9"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Sony vaio i5"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Sony vaio i7"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Apple monitor 24"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("MacBook air"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("Dell i7 8gb"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("2017 Dell 15.6 Inch"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("ASUS Full HD"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName(new Product("MacBook Pro"));
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        productPage.openCartPage();
        Thread.sleep(2000);

        Assert.assertEquals(true, cartPage.verifyIfProductsPriceEqualsTotalPrice());

    }

    // Drugi zadatak (dodavanje svih proizvoda, jedan po jedan, i nakon svakog dodavanja novog proizvoda, uporediti Total price)
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyTotalPriceAddingAllItemsOneByOne(String productName) throws InterruptedException {

        //U ovom testu nije bitno koliko ima prethodno Itema u korpi

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(3000);

        ProductPage productPage = new ProductPage(driver);

        mainPage.addItemToCartByName(productName);
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();

        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();

        CartPage cartPage = new CartPage(driver);
        Thread.sleep(3000);


        Assert.assertEquals(true, cartPage.verifyIfProductsPriceEqualsTotalPrice());
    }

    // Drugi zadatak (dodavanje samo jednog proizvoda i upoređivanje Total price)
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyTotalPriceAfterAddingSingleItem(String productName) throws InterruptedException {

        //U ovom testu je bitno da se samo jedan Item nalazi u korpi

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        Thread.sleep(2000);
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);
        mainPage.addItemToCartByName(productName);
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));

        productPage.clickBtnAddToCart();

        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();

        productPage.openCartPage();
        Thread.sleep(2000);

        Assert.assertEquals(true, cartPage.verifyIfProductsPriceEqualsTotalPrice());
    }

    // Test nije vezan za zadatke
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyIsPriceOfAddedItemSameAsPriceInCartTable(String productName) throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        Thread.sleep(3000);
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);
        int priceOfAddedItem = mainPage.getPriceOfChosenProduct(productName);
        Thread.sleep(2000);
        mainPage.addItemToCartByName(productName);
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));

        productPage.clickBtnAddToCart();

        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();

        productPage.openCartPage();
        w.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cartPage.allProductsTableRowsLocator()));

        Assert.assertEquals(cartPage.findAddedProductAndGetPrice(productName), priceOfAddedItem);


    }

    // Test nije vezan za zadatke
    @Test
    public void verifyArePricesOfAddedItemsSameAsPricesInCartTable() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        Thread.sleep(3000);
        cartPage.clearCartAndReturnToMainPage();

        List<Integer> pricesOfAddedItems = new ArrayList<>();

        ProductPage productPage = new ProductPage(driver);

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct("Nexus 6"));
        Thread.sleep(2000);
        mainPage.addItemToCartByName("Nexus 6");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct("Samsung galaxy s6"));
        Thread.sleep(2000);
        mainPage.addItemToCartByName("Samsung galaxy s6");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct("MacBook Pro"));
        Thread.sleep(2000);
        mainPage.addItemToCartByName("MacBook Pro");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        pricesOfAddedItems.add(mainPage.getPriceOfChosenProduct("MacBook Pro"));
        Thread.sleep(2000);
        mainPage.addItemToCartByName("MacBook Pro");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        productPage.openCartPage();
        Thread.sleep(4000);

        List<Integer> expectedProductsInCart = cartPage.listOfProductPricesInCartTable();

        Collections.sort(expectedProductsInCart);
        Collections.sort(pricesOfAddedItems);

        Assert.assertTrue(expectedProductsInCart.equals(pricesOfAddedItems));


    }

    // Treći zadatak (provera da li se proizvod nalazi u tabeli, a kada je korpa prazna)
    @Test(dataProvider = "ProductsNameProvider", dataProviderClass = ProductsProvider.class)
    public void verifyIsAddedProductInCartTableAfterClearCart(String productName) throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(3500);

        CartPage cartPage = new CartPage(driver);

        mainPage.openCartPage();
        Thread.sleep(2000);
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);
        mainPage.addItemToCartByName(productName);
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();

        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();
        Thread.sleep(2000);

        Assert.assertTrue(cartPage.verifyIsAddedProductInCartTable(productName));
    }

    // Treći zadatak (provera da li se dodati proizvod nalazi u tabeli, čak i kada u korpi postoji neki proizvod)
    @Test
    public void verifyIsAddedProductInCartTable() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(2000);

        ProductPage productPage = new ProductPage(driver);
        mainPage.addItemToCartByName("Nexus 6");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();

        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openCartPage();
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(cartPage.verifyIsAddedProductInCartTable("Nexus 6"));
    }

    // Treći zadatak (provera da li se dodati proizvodi nalaze u tabeli, čak i kada u korpi postoji neki proizvod)
    @Test
    public void verifyAreAddedProductsInCartTable() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(2000);

        ProductPage productPage = new ProductPage(driver);

        List<String> listaImenaProizvoda = new ArrayList<>();

        mainPage.addItemToCartByName("Apple monitor 24");
        listaImenaProizvoda.add("Apple monitor 24");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("MacBook air");
        listaImenaProizvoda.add("MacBook air");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Dell i7 8gb");
        listaImenaProizvoda.add("Dell i7 8gb");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        productPage.openCartPage();
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);

        List<String> expectedProductsInCart = cartPage.listOfProductNamesInCartTable();

        Assert.assertTrue(expectedProductsInCart.containsAll(listaImenaProizvoda));


    }

    // Treći zadatak (provera da li se dodati proizvodi nalaze u tabeli, čak i kada u korpi postoji neki proizvod)
    @Test
    public void verifyAreAddedProductsInCartTableAfterClearCart() throws InterruptedException {

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.clickOnLogInOpener();
        w.until(ExpectedConditions.visibilityOf(mainPage.getInpUserName()));
        mainPage.login("test", "test");
        Thread.sleep(2000);

        CartPage cartPage = new CartPage(driver);
        mainPage.openCartPage();
        Thread.sleep(2000);
        cartPage.clearCartAndReturnToMainPage();

        ProductPage productPage = new ProductPage(driver);

        List<String> listaImenaProizvoda = new ArrayList<>();

        mainPage.addItemToCartByName("Apple monitor 24");
        listaImenaProizvoda.add("Apple monitor 24");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("MacBook air");
        listaImenaProizvoda.add("MacBook air");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        mainPage.addItemToCartByName("Dell i7 8gb");
        listaImenaProizvoda.add("Dell i7 8gb");
        w.until(ExpectedConditions.presenceOfElementLocated(productPage.locatorBtnAddToCart()));
        productPage.clickBtnAddToCart();
        w.until(ExpectedConditions.alertIsPresent());
        productPage.acceptAlertAfterAddingItem();
        productPage.openHomePage();
        w.until(ExpectedConditions.presenceOfElementLocated(mainPage.loginBtnBlock()));

        productPage.openCartPage();
        Thread.sleep(2000);

        List<String> expectedProductsInCart = cartPage.listOfProductNamesInCartTable();

        Collections.sort(expectedProductsInCart);
        Collections.sort(listaImenaProizvoda);

        Assert.assertTrue(expectedProductsInCart.equals(listaImenaProizvoda));


    }


}
