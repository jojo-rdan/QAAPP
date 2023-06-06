package org.exerciseQAAPP.tests.steps.web;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.exerciseQAAPP.utils.BaseTest;

public class StepsWeb extends BaseTest {
    @Given("I am in the Log In page of the QA APP")
    public void i_am_in_the_log_in_page_of_the_qa_app(){testSetup();}
    @When("I Log In into my account")
    public void i_log_in_into_my_account(){login();}
    @Then("I should have entered my session")
    public void i_should_have_entered_my_session(){profile();}
    @When("I try to log out")
    public void i_try_to_log_out(){logOutProcess();}
    @Then("I should be able to logout successfully")
    public void i_should_be_able_to_logout_successfully(){logOutValidation();}
}
