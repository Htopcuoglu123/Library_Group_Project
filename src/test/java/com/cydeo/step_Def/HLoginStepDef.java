package com.cydeo.step_Def;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;

public class HLoginStepDef {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

}
