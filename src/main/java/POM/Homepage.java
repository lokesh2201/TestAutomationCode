package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    WebDriver driver;
    WebDriverWait Wait;

    public Homepage (WebDriver WD){
        driver = WD;
        Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private final String Productxpathorg = "//div[@class='product__grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6  grid']//h3[normalize-space()='%s']";

    public Homepage ProductType(String Name){
        String Productxpath = Productxpathorg.replace("%s", Name);
        //driver.findElement(By.xpath(Productxpath)).click();
        By ProductLocator = By.xpath(Productxpath);
        Wait.until(ExpectedConditions.elementToBeClickable(ProductLocator)).click();
        return this;
    }

}
