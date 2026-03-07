package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

    WebDriver driver;

    public Homepage (WebDriver WD){
        driver = WD;
    }

    private final String Productxpathorg = "//div[@class='product__grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6  grid']//h3[normalize-space()='%s']";

    public Homepage ProductType(String Name){
        String Productxpath = Productxpathorg.replace("%s", Name);
        driver.findElement(By.xpath(Productxpath)).click();
        return this;
    }

}
