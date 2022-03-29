package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public static void userOnDashboardPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env3"));
        LoginPage.login();
    }
}
