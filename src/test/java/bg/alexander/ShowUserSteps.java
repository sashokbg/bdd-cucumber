package bg.alexander;

import bg.alexander.model.User;
import bg.alexander.service.UserService;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ShowUserSteps {
    private UserService service;
    private TestRestTemplate restTemplate;
    private User user;
    private ResponseEntity<User> resposne;

    public ShowUserSteps(UserService service, TestRestTemplate restTemplate) {
        this.service = service;
        this.restTemplate = restTemplate;
    }

    @Given("^a user with id (\\d+)$")
    public void a_user_with_id(Long id) throws Throwable {
        this.user = service.findUser(id);
    }

    @When("^we go to the /user/(\\d+) URL$")
    public void we_go_to_the_user_URL(int id) throws Throwable {
        resposne = restTemplate.getForEntity("/user/"+id,User.class);
    }

    @Then("^we get the user's information$")
    public void we_get_the_user_s_information() throws Throwable {
        User userFromService = resposne.getBody();
        assertThat(user.getId()).isEqualTo(userFromService.getId());
        assertThat(user.getFirstName()).isEqualTo(userFromService.getFirstName());
        assertThat(user.getLastName()).isEqualTo(userFromService.getLastName());
    }
}
