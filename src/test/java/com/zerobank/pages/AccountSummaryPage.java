package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage {
    public AccountSummaryPage(){ PageFactory.initElements(Driver.get(),this); }


    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> AccountTypes;

    @FindBy(xpath = "(//div[@class='board-content'])[3]/table/thead/tr/th")

    public List<WebElement> AccountTableColumns;


}
