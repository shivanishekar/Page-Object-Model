//ProductListPage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductListPage {

    WebDriver driver;

    By fishCategory = By.linkText("Fish");

    public ProductListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFishCategory() {
        driver.findElement(fishCategory).click();
    }

    public boolean isProductListDisplayed() {
        return driver.getPageSource().contains("Angelfish");
    }
}
