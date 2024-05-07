package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src//test//resources//features//",
	glue = {"stepDefs"},
//	below is to check if all the steps are implemented or not
//	condition 1: if below is true it will check for unimplemented steps if any 
//	condition 2 : if all the stps are implemented thn it will only run without actuly running ur secneaio
//	condtition 3 : to execute the scenario when all the steps are implemented , keep below as false
	dryRun = false,
//	pretty plugin  is for detailed berbose console output & html: pugin is for html report
	plugin = {"pretty","html:target/reports/HtmlReport.html",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"rerun:target/FailedScenarios.txt"},
//	below is for more readable console output
	monochrome = true)
public class GooglePageRunner extends AbstractTestNGCucumberTests{
  
}
