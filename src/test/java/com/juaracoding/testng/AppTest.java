package com.juaracoding.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass()");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass()");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod()");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod()");
    }

    @Test
    public void test01() {
        System.out.println("test01()");
    }

    @Test
    public void test02() {
        System.out.println("test02()");
    }

    @Test
    public void test03() {
        System.out.println("test03()");
    }
}
