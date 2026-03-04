//ViewProductPage.java

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewProductPage {

    WebDriver driver;

    By productLink = By.linkText("FI-SW-01");
    By addToCartBtn = By.linkText("Add to Cart");

    public ViewProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectProduct() {
        driver.findElement(productLink).click();
    }

    public void clickAddToCart() {
        driver.findElement(addToCartBtn).click();
    }
}
