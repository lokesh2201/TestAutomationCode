package Login;

import DriverFactory.drivers;
import POM.Homepage;
import POM.LoginPOM;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Loginpage {

    @Parameters("Browser")
    @BeforeMethod
    public void setUp(String Browser) throws MalformedURLException {
        new drivers().CreateDriver(Browser);
    }


    @Test
    public void SuccessLogin() throws InterruptedException {
        LoginPOM LN = new LoginPOM(drivers.getDriver());
        LN.EMAILFIELD("lokesh3424@gmail.com").PasswordFIELD("Test@123").SignButton();
    }

//    @Test
//    public void InvalidLogin() throws InterruptedException {
//        LoginPOM LN = new LoginPOM(drivers.getDriver());
//        LN.EMAILFIELD("lokesh344@gmail.com").PasswordFIELD("Tet@123").SignButton();
//    }

    @Test
    public void Addtocart() throws InterruptedException {
        Thread.sleep(5000);
        LoginPOM LN = new LoginPOM(drivers.getDriver());
        LN.EMAILFIELD("lokesh3424@gmail.com").PasswordFIELD("Test@123").SignButton();

        Homepage H = new Homepage(drivers.getDriver());
        H.ProductType("Ceramic Candy Bowl - Yellow");

    }

}
