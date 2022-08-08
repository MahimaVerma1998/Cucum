package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/delete.feature",
glue="StepDefinition",
dryRun = false,
monochrome = true)

public class DeleteRunner {
 
}