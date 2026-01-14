package com.juaracoding.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTest01 {

    @Test
    @Parameters({ "username", "password" })
    public void test01(String username, String password) {
        System.out.println("ClassTest01->test01()");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    @Test
    @Parameters("username")
    public void test02(String username) {
        System.out.println("ClassTest01->test02()");
        System.out.println("Username di test02: " + username);
    }
}
