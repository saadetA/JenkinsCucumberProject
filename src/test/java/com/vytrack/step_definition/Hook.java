package com.vytrack.step_definition;

import com.vytrack.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
private static Logger logger=Logger.getLogger(Hook.class);
    @Before
    public void setup(){
        System.out.println("============================");
      Driver.get().manage().window().maximize();  logger.info("Test setup!");

    }
@After
public void teardown(Scenario scenario){
    if(scenario.isFailed()){
       logger.error("testfailed");
       // System.out.println("Test failed");
        byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png","name of screenshot");

    }else {

       logger.info("Cleanup!");
       logger.info("Test completed!");
    }

    logger.info("==================================");
    Driver.close();
    }

}
