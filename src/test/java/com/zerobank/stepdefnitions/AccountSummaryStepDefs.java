package com.zerobank.stepdefnitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefs {

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {

     String actualTtle= Driver.get().getTitle() ;
        Assert.assertEquals(expectedTitle,actualTtle);
    }

    @When("account type should be as listed below")
    public void account_type_should_be_as_listed_below(List<String> expectedAccountType) {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        
        List<String> actualAccountType= BrowserUtils.getElementsText(accountSummaryPage.AccountTypes);

        Assert.assertEquals(expectedAccountType,actualAccountType);
    }

    @Then("credit accounts table should have the columns as lited below")
    public void credit_accounts_table_should_have_the_columns_as_lited_below(List<String> expectedColumns) {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

        List<String> actualColumns=BrowserUtils.getElementsText(accountSummaryPage.AccountTableColumns);

      Assert.assertEquals(expectedColumns,actualColumns);
    }





}
