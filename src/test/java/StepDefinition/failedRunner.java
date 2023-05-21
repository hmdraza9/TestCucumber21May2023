package StepDefinition;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedrerun.txt", glue={"StepDefinition"}, tags = "@myTag", plugin = {"rerun:target/failedrerun.txt"})
public class failedRunner {
}
