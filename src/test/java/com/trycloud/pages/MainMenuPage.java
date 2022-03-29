package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage {
    public MainMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = " //header/div/ul/li[@data-id='dashboard']")
    public WebElement dashboardModulelink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='files']")
    public static WebElement filesModuleLink;
    @FindBy(xpath = " //header/div/ul/li[@data-id='photos']")
    public WebElement photosModuleLink;
    @FindBy(xpath = " //header/div/ul/li[@data-id='activity']")
    public WebElement activityModuleLink;
    @FindBy(xpath = " //header/div/ul/li[@data-id='spreed']")
    public WebElement talkModuleLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='mail']")
    public WebElement mailModuleLink;
    @FindBy(xpath = " //header/div/ul/li[@data-id='contacts']")
    public WebElement contactsModuleLink;
    @FindBy(xpath = " //header/div/ul/li[@data-id='circles']")
    public WebElement circlesModuleLink;
    @FindBy(xpath = " //header/div/ul/li[@data-id='calendar']")
    public WebElement calendarModuleLink;

    @FindBy(xpath = " //header/div/ul/li[@data-id='deck']")
    public WebElement deckModuleLink;


}
