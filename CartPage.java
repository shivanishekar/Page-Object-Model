//CartPage.java

package pages;

import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCartPageDisplayed() {
        return driver.getPageSource().contains("Shopping Cart");
    }
}
