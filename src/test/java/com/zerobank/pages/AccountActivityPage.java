package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountActivityPage {
    public AccountActivityPage(){ PageFactory.initElements(Driver.get(),this); }

   @FindBy(xpath = "//a[text()='Account Activity']")
   public WebElement AccountActivityModule;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement AccountDropDown;


}
