package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    @FindBy(id = "user-block" )
    public WebElement userProfile;

    @FindBy(xpath = "//span[.='Log out']" )
    public WebElement logOut;



    public LogoutPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void clickLogOut(){
        userProfile.click();
        logOut.click();
    }

}
