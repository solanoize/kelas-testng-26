package com.juaracoding.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTest02 {

    @Test
    @Parameters({ "username", "password" })
    public void test01(String username, String password) {
        System.out.println("ClassTest02->test01()");
        System.out.println("ClassTest02 username: " + username);
        System.out.println("ClassTest02 password: " + password);
    }

    @Test
    public void test02() {
        System.out.println("ClassTest02->test02()");
    }
}
