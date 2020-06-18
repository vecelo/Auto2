package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinition {
    @Given("^User is on Landing page$")
    public void user_is_on_Landing_page() throws Throwable{
        //code
        System.out.println("Landing page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable{
        //code
        System.out.println("Username is aaa@gmail.com \n Password is 123456");
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable{
        //code
        System.out.println("Home Page");
    }

    @And("^Portal text is displayed$")
    public void portal_text_is_displayed() throws Throwable{
        //code
        System.out.println("Home Page >>> Portal text");
    }
}
