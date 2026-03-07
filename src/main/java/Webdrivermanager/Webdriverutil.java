package Webdrivermanager;


import org.openqa.selenium.WebDriver;

public class Webdriverutil {

    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    public static void setWebDriver(WebDriver driver){
        threadLocalDriver.set(driver);
    }

    public static void getWebDriver(){
        threadLocalDriver.get();
    }

}
