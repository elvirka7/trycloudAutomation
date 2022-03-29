package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.MainMenuPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.nio.file.Files;

public class US04_accessToFilesStepdefs {

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        DashboardPage.userOnDashboardPage();
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String filesModule) {
        MainMenuPage.filesModuleLink.click();
    }

    @Then("verify the page title is {string}")
    public void verifyThePageTitleIsFilesTrycloudQA(String pageTitle){
        BrowserUtils.verifyTitle(pageTitle);
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        FilesPage.selectAllFiles.click();
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        for (WebElement eachCheckbox : FilesPage.allFoldersCheckBoxes) {
            Assert.assertTrue(eachCheckbox.isSelected());
        }
    }
}
