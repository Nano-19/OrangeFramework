import io.cucumber.java.After;
import io.cucumber.java.Before;
import configs.SeleniumHub;

import java.net.MalformedURLException;


public class Hooks {

//    BaseDriver base = new BaseDriver();
      SeleniumHub seleniumHub = new SeleniumHub();
    //    @Before
//    public void appInstallAndLoad() {
//        base.DriverConfiguration();
//    }
    @Before
    public void configureDriver() throws MalformedURLException {
        seleniumHub.DriverConfiguration();
    }

    @After
    public void removeDriver() throws MalformedURLException {
        seleniumHub.TearDown();
    }
}