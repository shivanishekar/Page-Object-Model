//Test Class with Assertions (TestNG)
//PetStoreTest.java

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.*;

public class PetStoreTest extends BaseTest {

    @Test
    public void verifyAddProductToCart() {

        HomePage home = new HomePage(driver);
        home.clickEnterStore();

        ProductListPage productList = new ProductListPage(driver);
        productList.clickFishCategory();
        Assert.assertTrue(productList.isProductListDisplayed(),
                "Product list not displayed");

        ViewProductPage viewProduct = new ViewProductPage(driver);
        viewProduct.selectProduct();
        viewProduct.clickAddToCart();

        CartPage cart = new CartPage(driver);
        Assert.assertTrue(cart.isCartPageDisplayed(),
                "Product not added to cart");
    }
}
