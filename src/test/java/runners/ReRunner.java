package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "@target//FailedScenarios.txt",
	glue = {"stepDefs"},

	plugin = {"pretty"},
			
	monochrome = true)
public class ReRunner extends AbstractTestNGCucumberTests{
  
}
