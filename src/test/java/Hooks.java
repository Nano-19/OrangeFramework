import io.cucumber.java.After;
import io.cucumber.java.Before;
import configs.SeleniumHub;

import java.net.MalformedURLException;


public class Hooks {

//    Uncomment this for use driver local

//    BaseDriver base = new BaseDriver();
//    @Before
//    public void configureDriver() {
//        base.DriverConfiguration();
//    }
//    @After
//    public void removeDriver() throws MalformedURLException {
//        base.TearDown();
//    }
//

    SeleniumHub seleniumHub = new SeleniumHub();
    @Before
    public void configureDriver() throws MalformedURLException {
        seleniumHub.DriverConfiguration();
    }

    @After
    public void removeDriver() throws MalformedURLException {
        seleniumHub.TearDown();
    }
}