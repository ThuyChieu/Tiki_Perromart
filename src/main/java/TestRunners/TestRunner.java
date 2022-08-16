package TestRunners;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources"}, glue = {"StepDefinitions"}, monochrome = true)
public class TestRunner {
}


