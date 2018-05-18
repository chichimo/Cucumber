package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"features"},
	glue= {"stepdefinition"}, 
	tags= {"@Sprint1","@Firefox"},
	dryRun=true,
	strict =true,
	monochrome=true)
public class TestRunner {

}
