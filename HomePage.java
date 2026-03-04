//HomePage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By enterStoreBtn = By.linkText("Enter the Store");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterStore() {
        driver.findElement(enterStoreBtn).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
