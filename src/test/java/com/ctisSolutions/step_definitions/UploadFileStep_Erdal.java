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

    @When("User should be able to upload three file at same time")
    public void user_should_be_able_to_upload_three_file_at_same_time() {
        erdalPage.uploadThreeFiles();
    }

    @Then("Verify users uploaded files")
    public void verify_users_uploaded_files() {
        erdalPage.verifyUploadedFiles();
    }

    @When("user should be able to upload files in pdf txt docx formats")
    public void userShouldBeAbleToUploadFilesInPdfTxtDocxFormats() {
        erdalPage.uploadPdfTxtDocx();
    }

    @Then("Verify users uploaded files in pdf txt docx formats")
    public void verifyUsersUploadedFilesInPdfTxtDocxFormats() {
        erdalPage.verifyUploadedFilesInPdfTxtDocxFormats();
    }


    @When("user should be able to upload files in jpeg gif png formats")
    public void userShouldBeAbleToUploadFilesInJpegGifPngFormats() {
        erdalPage.uploadJpegGifPng();
    }

    @Then("Verify users uploaded files in jpeg gif png formats")
    public void verifyUsersUploadedFilesInJpegGifPngFormats() {
        erdalPage.verifyUploadedFilesInJpegGifPngFormats();
    }

    @When("user should be able to upload some files")
    public void user_should_be_able_to_upload_some_files() {
        erdalPage.uploadThreeFiles();
        erdalPage.verifyUploadedFiles();
    }

    @When("User should be able to Insert uploaded file into the text field")
    public void user_should_be_able_to_ınsert_uploaded_file_into_the_text_field() {
        erdalPage.insertAllUpdated();
    }

    @Then("Verify files are in the text field")
    public void verify_files_are_in_the_text_field() {
        erdalPage.verifyInsertAllUpdated();
    }
}
