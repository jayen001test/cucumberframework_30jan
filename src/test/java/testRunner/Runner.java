package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/java/features"},

                 glue= {"stepDefinitions"},
                 plugin= {"pretty","html:target/cucumberreport.html"},
                 monochrome=true,
                 dryRun = false
		)
public class Runner extends AbstractTestNGCucumberTests {

	
	
	
}
