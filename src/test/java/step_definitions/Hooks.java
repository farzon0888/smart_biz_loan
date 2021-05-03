package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    // This annotation runs before each scenario, we can use this to take an action before each scenario if we need to
    @Before
    public void setup(Scenario scenario){

        System.out.println("Scenario name: "+ scenario.getName());

    }


    // This annotation runs after each scenario, if scenario fails it takes screenshot and include in report
    @After
    public void tearDoown(Scenario scenario){
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        // Closing driver after scenario is complete with custom method
        //Driver.quitDriver();
    }
}
