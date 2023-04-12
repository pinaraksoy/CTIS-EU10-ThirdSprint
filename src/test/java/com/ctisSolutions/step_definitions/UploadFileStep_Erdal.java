package com.ctisSolutions.step_definitions;

import com.ctisSolutions.pages.LoginPage;
import com.ctisSolutions.pages.LogoutPage;
import com.ctisSolutions.pages.UploadFilePage_Erdal;
import com.ctisSolutions.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFileStep_Erdal {

    LoginPage loginPage;
    LogoutPage logoutPage;
    WebDriver driver;
    UploadFilePage_Erdal erdalPage;

    @Before(value = "@wip", order = 2)
    public void setUp() {
        loginPage = new LoginPage();
        logoutPage = new LogoutPage();
        driver = Driver.getDriver();
        erdalPage = new UploadFilePage_Erdal();
    }


    @Given("User clicks to Send Message text under Message menu and see Send button")
    public void user_clicks_to_send_message_text_under_message_menu_and_see_send_button() {
        erdalPage.goToMessageTextField();
    }

    @Given("User clicks to Upload files icon")
    public void user_clicks_to_upload_files_icon() {
        erdalPage.clickUploadFilesBtn();
    }

    @Given("Verify user can see Upload files options")
    public void verifyUserCanSeeUploadFilesOptions() {
        erdalPage.verifyUploadOptionsVisible();
    }

    @When("User should be able to upload three file at same time")
    public void userShouldBeAbleToUploadThreeFileAtSameTime() throws InterruptedException {
        erdalPage.uploadThreeFiles();
    }

    @Then("Verify users uploaded files")
    public void verify_users_uploaded_files() {
        erdalPage.verifyUploadedFiles();
    }



}
