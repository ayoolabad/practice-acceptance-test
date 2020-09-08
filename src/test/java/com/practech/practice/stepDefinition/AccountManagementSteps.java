package com.practech.practice.stepDefinition;

import com.practech.practice.pageObject.CreateAccountPagePO;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementSteps {
    WebDriver driver;
    @Given("^user is on create an account page$")
    public void userIsOnCreateAnAccountPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://demo-magento2.vuestorefront.io");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create an Account")).click();
    }

    @When("^user inputs their \"([^\"]*)\"$")
    public void userInputsTheir(String FirstName) throws Throwable {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstname(FirstName);
    }

    @And("^user enter the \"([^\"]*)\"$")
    public void userEnterThe(String LastName) throws Throwable {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterLastname(LastName);
    }

    @And("^user adds the \"([^\"]*)\" Address$")
    public void userAddsTheAddress(String Email) throws Throwable {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterEmail(Email);
    }

    @And("^user enters a \"([^\"]*)\" on create account page$")
    public void userEntersAOnCreateAccountPage(String Password) throws Throwable {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterPassword(Password);
    }

    @And("^user reenters to confirm that \"([^\"]*)\"$")
    public void userReentersToConfirmThat(String ConfirmPassword) throws Throwable {
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterConfirmPassword(ConfirmPassword);
    }

    @And("^user now clicks on the CreateAnAccount$")
    public void userNowClicksOnTheCreateAnAccount() {
    }

    @Then("^user MyAccount page is displayed\\.$")
    public void userMyAccountPageIsDisplayed() {
    }
}
