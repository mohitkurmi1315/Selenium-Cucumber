package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src//test/resources//features//",
	glue = {"stepDefs"},
	dryRun = false,
	plugin = {"pretty"},		
	monochrome = true)
public class ParallelExecution extends AbstractTestNGCucumberTests{
	
//	Below will execute all the Scenarios in parallel
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
  
}
