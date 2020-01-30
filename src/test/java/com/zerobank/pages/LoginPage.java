package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){ PageFactory.initElements(Driver.get(),this);
    }
@FindBy(xpath="//input[@id='user_login']")
    public WebElement username;

    @FindBy(xpath="//input[@id='user_password']")
    public WebElement password;

    @FindBy(xpath="//input[@value='Sign in']")
    public WebElement submit;

    @FindBy(xpath="//button[@id='signin_button']")
    public WebElement signinButton;

    @FindBy(xpath="//div[@class='alert alert-error']")
    public WebElement errorMessage;



    public  void login(String usernameStr, String passwordStr){
     signinButton.click();
     username.sendKeys(usernameStr);
     password.sendKeys(passwordStr);
     submit.click();
    }

}
