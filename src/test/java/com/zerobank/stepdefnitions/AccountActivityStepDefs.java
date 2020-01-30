package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class AccountActivityStepDefs {
    @When("the user navigate to Account Activity page")

    public void the_user_navigate_to_Account_Activity_page() {

        new AccountActivityPage().AccountActivityModule.click();
    }

    @Given("{string} dropdown menu is show {string} as a default value")
    public void dropdown_menu_is_show_as_a_default_value(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("the dropdown should have fallowing options")
    public void the_dropdown_should_have_fallowing_options(List<String> expectedOptions) {

      AccountActivityPage accountActivityPage= new AccountActivityPage();

    }

    @Then("transaction table should have following columns name")
    public void transaction_table_should_have_following_columns_name(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new cucumber.api.PendingException();
    }






}
