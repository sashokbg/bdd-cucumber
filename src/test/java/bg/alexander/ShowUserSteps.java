package bg.alexander;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShowUserSteps {
    @Given("^a user with id (\\d+)$")
    public void a_user_with_id(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^we go to the /user/(\\d+) URL$")
    public void we_go_to_the_user_URL(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^we get the user's information$")
    public void we_get_the_user_s_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
