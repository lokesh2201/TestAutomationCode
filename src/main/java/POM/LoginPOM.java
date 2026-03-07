package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {

    WebDriver driver;

    By Email = By.xpath("//input[@id='field-email']");
    By Password = By.xpath("//input[@id='field-password']");
    By SignBTN = By.xpath("//button[normalize-space()='Sign In']");

    public LoginPOM (WebDriver WD){
        driver = WD;
    }

    public LoginPOM EMAILFIELD(String ID){
        driver.findElement(Email).sendKeys(ID);
        return this;
    }

    public LoginPOM PasswordFIELD(String PW){
        driver.findElement(Password).sendKeys(PW);
        return this;
    }

    public LoginPOM SignButton(){
        driver.findElement(SignBTN).click();
        return this;
    }
}
