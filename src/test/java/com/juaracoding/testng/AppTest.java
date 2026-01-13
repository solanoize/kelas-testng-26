package com.juaracoding.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.juaracoding.testng.model.Product;

public class AppTest {
    private Product product;

    @Test(enabled = false)
    public void testAssertEqualsNoOrder01() {
        /**
         * Memeriksa apakah kedua array berisi element-element
         * yang sama (tanpa memeriksa urutannya)
         */

        Object[] expectedNumbers = { 1, 2, 3, 4, 5 };
        Object[] actualNumbers = { 2, 4, 1, 3, 5 };

        Assert.assertEqualsNoOrder(actualNumbers, expectedNumbers);
    }

    @Test(enabled = false)
    public void testAssertEqualsNoOrder02() {
        /**
         * Memeriksa apakah kedua array berisi element-element
         * yang sama (tanpa memeriksa urutannya)
         */

        Object[] expectedNumbers = { 1, 2, 3, 4, 5 };
        Object[] actualNumbers = { 1, 4, 1, 3, 5 };

        Assert.assertEqualsNoOrder(actualNumbers, expectedNumbers);
    }

    @Test(enabled = false)
    public void checkNullable() {
        product = new Product();
        Assert.assertNotNull(product);
    }

    @Test
    public void checkSameObject() {
        product = new Product();
        Product inlineProduct = new Product();
        Assert.assertNotSame(inlineProduct, product);
    }
}
