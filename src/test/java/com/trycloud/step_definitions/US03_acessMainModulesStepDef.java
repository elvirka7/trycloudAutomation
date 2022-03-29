package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.MainMenuPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US03_acessMainModulesStepDef {

    MainMenuPage mainMenuPage = new MainMenuPage();

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env3"));
    }

    @When("the users log in with valid credentials")
    public void theUsersLogInWithValidCredentials() {
        LoginPage.login();
    }

    @Then("Verify the user see the following modules:")
    public void verifyTheUserSeeTheFollowingModules(List<String> expectedModulesList) {

        List<WebElement> mainModuleLinks = new ArrayList<>(Arrays.asList(
                mainMenuPage.dashboardModulelink,
                mainMenuPage.filesModuleLink,
                mainMenuPage.photosModuleLink,
                mainMenuPage.activityModuleLink,
                mainMenuPage.talkModuleLink,
                mainMenuPage.contactsModuleLink,
                mainMenuPage.circlesModuleLink,
                mainMenuPage.calendarModuleLink,
                mainMenuPage.deckModuleLink));

        for (WebElement eachModule : mainModuleLinks) {
            Assert.assertTrue(eachModule.isDisplayed());
        }

        List<String> actualMainModulesText = BrowserUtils.getElementsText(mainModuleLinks);

        Assert.assertEquals(expectedModulesList, actualMainModulesText);

    }
}
