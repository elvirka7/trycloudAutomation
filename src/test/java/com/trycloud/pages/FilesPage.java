package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {
    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //main part of the page
    @FindBy(xpath = "//label[@for='select_all_files']")
    public static WebElement selectAllFiles;

    @FindBy(xpath = "//span[.='Select']")
    public static List<WebElement> allFoldersCheckBoxes;

    @FindBy(xpath = "//div[@class = 'thumbnail']")
    public WebElement anyFolder;



    //left Bar submodules
    @FindBy(xpath = "//a[.='Favorites']")
    public WebElement favoritesSubModule;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//div[@id = 'app-settings-content']//input[@type = 'checkbox']")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "//a[@class = 'icon-quota svg']/p")
    public WebElement storageUsage;


    //Action Icon and it's submodules
    @FindBy(xpath = "//span[@class = 'icon icon-more']")
    public WebElement actionIcon;

    @FindBy(xpath = "//span[. = 'Add to favorites']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//span[. = 'Remove from favorites']")
    public WebElement removeFromFavorites;

    @FindBy(xpath = "//span[.='Delete folder']")
    public WebElement deleteFolderInActionIcon;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement details;

    //details Sub Modules
    @FindBy(xpath = "//span[@class='app-sidebar-tabs__tab-icon icon-comment']")
    public WebElement commentsButtonInDetails;

    @FindBy (xpath = "(//div[@class='message'])[1]")
    public WebElement commentInputBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement commentSubmitBtn;


    //top page
    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addIconThePluss;

    @FindBy(xpath = "//span[.='Upload file']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolder;

    @FindBy(xpath = "//input[@id = 'view17-input-folder']")
    public WebElement newFolderNameInput;

    @FindBy(xpath = "//form[@class = 'filenameform']/input[@type= 'submit']")
    public WebElement newFolderSubmit;


    /*
    actionIcon
    addToFavoritesBtn
    removeFromFavoritesBtn
    favoritesSubModuleLink

    selectAllFilesChekbox
    List<WebElement> AllFilesCheckboxList
    actionIcon
    addToFavoritesOption


     */
}
