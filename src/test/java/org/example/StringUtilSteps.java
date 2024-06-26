package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilSteps {
    private String input;
    private String result;

    @Given("the input string is {string}")
    public void the_input_string_is(String input) {
        this.input = input;
    }

    @When("I reverse the string")
    public void i_reverse_the_string() {
        result = StringUtil.reverseString(input);
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        assertEquals(expected, result);
    }
}
