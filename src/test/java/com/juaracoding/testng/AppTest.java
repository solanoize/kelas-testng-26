package com.juaracoding.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void loginStep() {
        System.out.println("loginStep");
    }

    @Test(priority = 1)
    public void erifikasiOTP() {
        System.out.println("erifikasiOTP");
    }

    @Test(dependsOnMethods = "erifikasiOTP", timeOut = 1030)
    public void inventoryProductListTest() throws InterruptedException {
        Thread.sleep(1500); // buat demonstrasi jeda selama 45 ms.
        System.out.println("inventoryProductListTest");
    }

}
