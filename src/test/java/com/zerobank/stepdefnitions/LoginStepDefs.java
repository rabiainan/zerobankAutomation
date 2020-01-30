package com.zerobank.stepdefnitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

      String  url= ConfigurationReader.get("url") ;
        Driver.get().get(url);
    }

    @When("the user logs in  using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        LoginPage loginPage=new LoginPage();
        loginPage.login(username, password);
    }


    @Then("user should be on the account summary page")
    public void user_should_be_on_the_account_summary_page() {
     String actualTitle= Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",actualTitle);
    }

    @Then("as an error message {string} should be display")
    public void as_an_error_message_should_be_display(String expectedErrorMessage) {

    String actualErrorMessage= new LoginPage().errorMessage.getText();
    Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }





}
