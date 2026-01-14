package com.juaracoding.testng.api;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AuthenticationLoginTest {

  @Test
  @Parameters({ "username", "password" })
  public void test01(String username, String password) {
    System.out.println("AuthenticationLoginTest->test01()");
    System.out.println("AuthenticationLoginTest username: " + username);
    System.out.println("AuthenticationLoginTest password: " + password);
  }
}
