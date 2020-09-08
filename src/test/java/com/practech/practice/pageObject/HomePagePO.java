package com.practech.practice.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountlink;
    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;
    public HomePagePO(WebDriver driver){PageFactory.initElements(driver, this);}
    public void clickCreateAccountLink(){CreateAccountlink.click();}
    public void clickSignInLink(){SignInLink.click();}
}
