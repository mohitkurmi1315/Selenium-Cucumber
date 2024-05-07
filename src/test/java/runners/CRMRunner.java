package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src//test//resources//taggedFeatures//",
	glue = {"stepDefs"},
    dryRun = false,
//    		tags = "@RegressionTest and @SmokeTest",
//    		tags = "@RegressionTest or @SmokeTest",
//          below is Feature level tag, can run a whole feature file by providing any tag for a particular feature file
    		tags = "@PhaseOne",
	plugin = {"pretty"},
			
	
	monochrome = true)
public class CRMRunner extends AbstractTestNGCucumberTests{
  
}
