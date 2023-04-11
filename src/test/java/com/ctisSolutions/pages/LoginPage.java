package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(className = "log-popup-header")
    public WebElement authorizationHeader;

    @FindBy(name = "USER_LOGIN")
    public WebElement username;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeBox;

    @FindBy(className = "login-btn")
    public WebElement loginBox;

    @FindBy(className = "login-link-forgot-pass")
    public WebElement forgetYourPassword;

    @FindBy(className = "errortext")
    public WebElement incorrectLoginText;

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    /**
     * parameters @username
     * this method filled username
     */
    public void enterUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    /**
     * parameters @password.
     * this method filled password
     */
    public void enterPassword( String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    /**
     * this method click loginBox
     */
    public void clickLogin() {
        this.loginBox.click();
    }

    /**
     * parameters @username @password.
     * this method filled username
     */
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    /**
     * this method display invalid profile attention
     */
    public String verifyInvalidLogin() {
        return incorrectLoginText.getText();
    }

}

