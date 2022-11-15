package com.code.demoblaze.provider;

import org.testng.annotations.DataProvider;

public class ProductsProvider {

    @DataProvider(name = "ProductsNameProvider")
    public static Object[][] getDataProductName(){
        return new Object[][] {
                { "Samsung galaxy s6" },
                { "Nokia lumia 1520" },
                { "Nexus 6" },
                { "Samsung galaxy s7" },
                { "Iphone 6 32gb" },
                { "Sony xperia z5" },
                { "HTC One M9" },
                { "Sony vaio i5" },
                { "Sony vaio i7" },
                { "Apple monitor 24" },
                { "MacBook air" },
                { "Dell i7 8gb" },
                { "2017 Dell 15.6 Inch" },
                { "ASUS Full HD" },
                { "MacBook Pro" },

        };
}}
