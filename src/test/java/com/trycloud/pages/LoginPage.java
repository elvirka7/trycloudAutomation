package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import net.bytebuddy.pool.TypePool;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public static WebElement userNameInputBox;

    @FindBy(id = "password")
    public static WebElement passwordInputBox;

    @FindBy(id = "submit-form")
    public static WebElement loginBtn;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(css = ".warning")
    public static WebElement wrongUsernameOrPasswordMsg;

    public static void login(){
        BrowserUtils.waitForVisibility(userNameInputBox,10);
        userNameInputBox.sendKeys(ConfigurationReader.getProperty("username1"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginBtn.click();
    }
}
