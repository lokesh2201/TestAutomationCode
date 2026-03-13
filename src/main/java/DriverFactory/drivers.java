package DriverFactory;

import Webdrivermanager.Webdriverutil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class drivers {

    private static WebDriver driver;
    ChromeOptions CHROME;
    FirefoxOptions Firefox;

    public void CreateDriver(String Browser) throws MalformedURLException {
        System.out.println("Currently executing in " + Browser);

        switch (Browser) {
            case "Chrome":
                CHROME = new ChromeOptions();
                driver = new ChromeDriver(CHROME);
                break;

            case "Firefox":
                Firefox = new FirefoxOptions();
                driver = new FirefoxDriver(Firefox);
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.evershop.io/account/login");
        Webdriverutil.getWebDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }

}

