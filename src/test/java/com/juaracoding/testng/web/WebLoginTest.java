package com.juaracoding.testng.web;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebLoginTest {

  @Test
  @Parameters({ "username", "password", "a" })
  public void test01(String username, String password, String a) {
    System.out.println("WebLoginTest->test01()");
    System.out.println("WebLoginTest username: " + username);
    System.out.println("WebLoginTest password: " + password);
    System.out.println("WebLoginTest a: " + a);
  }
}
