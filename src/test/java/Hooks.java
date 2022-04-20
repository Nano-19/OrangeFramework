import io.cucumber.java.Before;
import Configs.SeleniumHub;

import java.net.MalformedURLException;


public class Hooks {

//    BaseDriver base = new BaseDriver();
      SeleniumHub seleniumHub = new SeleniumHub();
    //    @Before
//    public void appInstallAndLoad() {
//        base.DriverConfiguration();
//    }
    @Before
    public void mailTest() throws MalformedURLException {
        seleniumHub.DriverConfiguration();
    }
}