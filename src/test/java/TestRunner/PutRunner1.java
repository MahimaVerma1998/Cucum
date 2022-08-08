package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/put1.feature",
glue="StepDefinition",
dryRun = false,
monochrome = true)

public class PutRunner1 {
 
}