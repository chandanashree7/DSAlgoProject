package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//glue- the path of the step definition file
//monochrome-display the console output in a proper readable format
//strict - it will check if any step is not defined in step definition file
//dryrun- to check the mapping is proper between feature file and step def file

@RunWith(Cucumber.class)
@CucumberOptions(
				features="classpath:features/IndexPage.feature",
				glue= {"stepDefinition"},
				monochrome = true,dryRun = false) 
				

public class runner extends AbstractTestNGCucumberTests {
	
}
