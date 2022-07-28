package com.cydeo.step_Def;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;

public class Z_LoginStepDef {

    LoginPage page = new LoginPage();

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        page.login("librarian32@library","72kOI6Zl");

        //loginPage.login(ConfigurationReader.getProperty("lib32_user"),ConfigurationReader.getProperty("lib32_pass"));
    }

}
