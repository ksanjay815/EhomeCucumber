package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src//test//java//Features/", 
glue = { "StepDefinitions" }, 
dryRun = false, 
monochrome=true,
plugin = {"pretty", "html:target/HtmlReports" }, 
tags = "@smoketest")


// monochrome=true will remove unnecessary characters from console window

public class TestRunner {

}
