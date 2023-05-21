package StepDefinition;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/hraza/Downloads/GitClones/TestCucumber21May2023/src/test/resources/Features", glue={"StepDefinition"}, tags = "@myTag", plugin = {"rerun:target/failedrerun.txt"})
public class myRunner {
}
