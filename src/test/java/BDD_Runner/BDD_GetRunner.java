package BDD_Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature1/GetBDD.feature",
glue="StepDefinition",
dryRun = false,
monochrome = true)

public class BDD_GetRunner {
  @Test
  public void f() {
  }
}

