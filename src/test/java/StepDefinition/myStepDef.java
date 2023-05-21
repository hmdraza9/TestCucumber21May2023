package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class myStepDef {


    @Given("This is first step")
    public void this_is_first_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in first step");

        Assert.assertEquals(new String("hello"), new String("world"));

    }
    @When("This is second step")
    public void this_is_second_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in second step");
    }

    @Given("This is third step")
    public void this_is_third_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in third step");

        Assert.assertEquals(new String("good"), new String("morning"));

    }
    @When("This is fourth step")
    public void this_is_fourth_step() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in fourth step");
    }

}
