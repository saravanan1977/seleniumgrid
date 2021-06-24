package com.qascript;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FirstTest extends BaseTest {

    @Test
    public void LoginTest() throws MalformedURLException{

        getDriver().navigate().to("https://www.google.com/");
        Assert.assertTrue(getDriver().getTitle().equals("Google"));

    }
}
