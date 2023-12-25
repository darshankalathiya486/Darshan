package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signupAndLogin;

    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAsUserNameText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logoutLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    WebElement contactUSLink;



    public void clickOnSignupAndLoginButton(){
        clickOnElement(signupAndLogin);
    }

    public String verifyTheLoggedInAsUserNameText(){
        return getTextFromElement(loggedInAsUserNameText);
    }

    public void clickOnDeleteAccountLink(){
        clickOnElement(deleteAccountLink);
    }

    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
    }

    public void clickOnContactUsLink(){
        clickOnElement(contactUSLink);
    }

}
