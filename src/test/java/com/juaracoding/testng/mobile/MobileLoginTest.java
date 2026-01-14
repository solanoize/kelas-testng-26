package com.juaracoding.testng.mobile;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobileLoginTest {

  /**
   * Test login mobile dengan parameter username, password, dan a.
   * `a` adalah parameter tambahan untuk keperluan testing. Namun tidak dapat
   * digunakan dalam proses login. Karena scope-nya berbeda.
   * 
   * Program sengaja error untuk melihat bahwa `a` berbeda scope.
   * Untuk mengembalikan agar program test tidak error, Anda bisa menghapus
   * `a` di dalam parameternya.
   * 
   * @param username
   * @param password
   * @param a
   */
  @Test
  @Parameters({ "username", "password", "a" })
  public void test01(String username, String password, String a) {
    System.out.println("MobileLoginTest->test01()");
    System.out.println("MobileLoginTest username: " + username);
    System.out.println("MobileLoginTest password: " + password);
    System.out.println("MobileLoginTest a: " + a);
  }
}
