package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src\\test\\resources\\Login\\login.feature"},
glue= {"StepDefinition"},
dryRun=false)
public class Test_Runner extends AbstractTestNGCucumberTests {

}
