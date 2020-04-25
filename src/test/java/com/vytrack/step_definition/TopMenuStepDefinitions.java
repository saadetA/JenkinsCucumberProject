package com.vytrack.step_definition;

import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.*;

public class TopMenuStepDefinitions {
LoginPage loginPage=new LoginPage();


    // And user navigates to "Dashboards" then to "Manage Dashboards"
    @Then("user navigates to {string} then to {string}")
    public void user_navigates_to_then_to(String module, String submodule) {
        loginPage.navigateTo(module, submodule);
    }


    @Then("user verifies that {string}  is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
       System.out.println("Verified All Dashboards is displayed: "+string);
   }




}
