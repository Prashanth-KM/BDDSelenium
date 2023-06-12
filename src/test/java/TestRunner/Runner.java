package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features="src/test/java/feature",
        glue={"stepDefinitions","TestComponents"},
        monochrome = true,
        tags = "@Smoke",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner extends AbstractTestNGCucumberTests {

}
