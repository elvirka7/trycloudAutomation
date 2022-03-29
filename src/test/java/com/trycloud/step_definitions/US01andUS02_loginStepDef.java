package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class US01andUS02_loginStepDef {

    @Given("user on the login page {string}")
    public void userOnTheLoginPage(String loginPage) {
        Driver.getDriver().get(loginPage);
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscodePassword(String username, String password) {
        LoginPage.userNameInputBox.sendKeys(username);
        LoginPage.passwordInputBox.sendKeys(password);

    }

    @And("user click the login button")
    public void userClickTheLoginButton() {
        LoginPage.loginBtn.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verifyTheUserShouldBeAtTheDashboardPage() {
        String expectedTitle = "Dashboard - Trycloud QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Driver.closeDriver();
    }

    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String username, String password) {
        LoginPage.userNameInputBox.sendKeys(username);
        LoginPage.passwordInputBox.sendKeys(password);
    }

    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String message) {
       String msg = LoginPage.wrongUsernameOrPasswordMsg.getText();
       Assert.assertTrue(msg.equals(message));

    }

}
