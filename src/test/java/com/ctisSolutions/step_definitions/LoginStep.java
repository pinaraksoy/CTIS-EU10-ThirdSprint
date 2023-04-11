package com.ctisSolutions.step_definitions;

import com.ctisSolutions.pages.LoginPage;
import com.ctisSolutions.pages.LogoutPage;
import com.ctisSolutions.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStep {
    LoginPage loginPage;
    LogoutPage logoutPage;
    WebDriver driver;

    @Before(value = "@login", order=2)
    public void setup() {
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        driver= Driver.getDriver();
    }


    @Given("the user should navigate URL {string}")
    public void the_user_should_navigate_url(String URL) {
        driver.get(URL);

    }

    @Then("the user should enter valid username for Helpdesk Account {string}")
    public void the_user_should_enter_valid_username_for_helpdesk_account(String username) {
        loginPage.enterUsername(username);


    }

    @Then("the user should enter valid password {string}")
    public void the_user_should_enter_valid_password(String password) {
        loginPage.enterPassword(password);

    }

    @Then("the user should click Log in button")
    public void the_user_should_click_log_in_button() {
        loginPage.clickLogin();

    }

    @Then("the system should Log in succesfully")
    public void the_system_should_log_in_succesfully() {

    }

    @Then("the user should enter valid usernames for different Account {string}")
    public void the_user_should_enter_valid_usernames_for_different_account(String usernames) {
        loginPage.enterUsername(usernames);
    }

    @Then("the user should enter valid passwords {string}")
    public void the_user_should_enter_valid_passwords(String passwords) {
        loginPage.enterPassword(passwords);
    }

    @Then("the user should Log out succesfully")
    public void the_user_should_log_out_succesfully() {
        logoutPage.clickLogOut();
    }

    @Then("the user should enter invalid username {string}")
    public void the_user_should_enter_invalid_username_marketing1_cybertekschool_com(String username) {
        loginPage.enterUsername(username);
    }

    @Then("the system should display {string} attention")
    public void the_system_should_display_attention(String attentionText) {
        System.out.println("invalid Text : "+ loginPage.verifyInvalidLogin());
        Assert.assertEquals(attentionText,loginPage.verifyInvalidLogin());
    }

    @Given("the user should see user profile")
    public void the_user_should_see_user_profile() {
        logoutPage.clickLogOut();
    }

}
