package stepdefinitions;

import io.cucumber.java.en.When;

public class FirstStepDefinitions {
    @When("we are printing welcome text")
    public void print_welcome_text() {
        System.out.println("Hey-Hey! All works fine!");
    }
}
