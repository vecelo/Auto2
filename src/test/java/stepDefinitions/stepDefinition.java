package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;


public class stepDefinition {
    @Given("^User is on Landing page$")
    public void user_is_on_Landing_page() throws Throwable{
        //code
        System.out.println("Landing page");
    }

    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String a, String b) throws Throwable{
        //code
        System.out.println("Username is: "+a + "\n" +  "Password is: "+b);
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable{
        //code
        System.out.println("Home Page");
    }

    @And("^Portal text is displayed \"([^\"]*)\"$")
    public void portal_text_is_displayed(String c) throws Throwable{
        //code
        System.out.println("Home Page >>> Portal text. Result: "+c);
    }
}
