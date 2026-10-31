package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.hu.De;
import utilities.DriverFactory;

public class Hooks {

    @Before
    public void openBrowser(){
        DriverFactory.initDriver();
    }

    @After
    public void closeBrowser(){
        DriverFactory.closeDriver();
    }
}
