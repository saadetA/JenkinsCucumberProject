package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",//path to features
        glue = "com/vytrack/step_definition",//path to step definitions
        dryRun = false,//it given by default it checks your test step s have code implementation or not
       // monochrome = true,//if you write true you can not run your code
        tags = "@store_manager",
        plugin = {"html:target/default-cucumber-reports", "json:target/cucumber.json", "rerun:target/rerun.txt"}
)
public class CucumberRunner {
}
