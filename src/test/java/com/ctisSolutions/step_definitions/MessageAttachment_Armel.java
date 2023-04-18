package com.ctisSolutions.step_definitions;


import com.ctisSolutions.pages.MessageAttachmentPage_Armel;
import com.ctisSolutions.utilities.BrowserUtils;
import com.ctisSolutions.utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MessageAttachment_Armel {


    WebDriver driver;
    MessageAttachmentPage_Armel armelPage;

    @Before(value = "@wip", order = 2)
    public void setUp() {
        driver = Driver.getDriver();
        armelPage = new MessageAttachmentPage_Armel();


    }

    @Given("user should enter app with valid {string} {string} {string}")
    public void user_should_enter_app_with_valid(String string, String string2, String string3) {

    }
    @And("user should clicks the Activity Stream button")
    public void user_should_clicks_the_activity_stream_button() throws InterruptedException {
        Thread.sleep(3000);
       armelPage.activityStreamButton.click();
    }
    @And("user should clicks the message field")
    public void user_should_clicks_the_message_field() throws InterruptedException {
        Thread.sleep(3000);

        armelPage.messageButton.click();
    }
    @When("user clicks on the add mention icon")
    public void user_clicks_on_the_add_mention_icon() {
        armelPage.addMention_mentionIcon.click();

    }
    @And("user add people to mention")
    public void user_add_people_to_mention() {
        armelPage.userAbleToAddMention();
    }
    @And("user should see selected people on the recipient field")
    public void user_should_see_selected_people_on_the_recipient_field() {
        String mentionedPeople= armelPage.addMention_recepientField.getText();
        System.out.println(mentionedPeople);
    }
    @And("user clicks on the send button")
    public void user_clicks_on_the_send_button() {
       armelPage.sendButton.click();
    }
    @Then("user sees mentioned people in the message that has been sent")
    public void user_sees_mentioned_people_in_the_message_that_has_been_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks the link icon")
    public void user_clicks_the_link_icon() {

        armelPage.addLink_linkIcon.click();
    }

    @And("user fills the text and link in the field")
    public void user_fills_the_text_and_link_in_the_field() {

        armelPage.userAbleToAttachlinkAndText();
    }

    @And("user clicks on the send button after link added")
    public void user_clicks_on_the_send_button_after_link_added() {

        armelPage.sendButton.click();
    }


    @Then("user sees attached link in the message that has been sent")
    public void user_sees_attached_link_in_the_message_that_has_been_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks insert video button")
    public void user_clicks_insert_video_button() {
       armelPage.insertVideo_insertVideoIcon.click();
    }

    @And("user inserts {string} video to the video source field")
    public void user_inserts_video_to_the_video_source_field(String string) {
        armelPage.insertVideo_videoSource.click();
        armelPage.insertVideo_videoSource.sendKeys("string");
    }

    @And("verify [FVD404] The video was not found; message is not appear")
    public void verify_fvd404_the_video_was_not_found_message_is_not_appear() {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[@title='Insert video']//i"));
    }

    @And("user clicks the video save button")
    public void user_clicks_the_video_save_button() {
        armelPage.insertVideo_saveButton.click();
    }


    @And("user clicks on send button")
    public void user_clicks_on_send_button() {
        armelPage.sendButton.click();
    }

    @Then("user sees inserted video in the message that has been sent")
    public void user_sees_inserted_video_in_the_message_that_has_been_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks the link button")
    public void user_clicks_the_link_button() {
        armelPage.addLink_linkIcon.click();
    }

    @And("user attach link and text")
    public void user_attach_link_and_text() {
        armelPage.userAbleToAttachlinkAndText();
    }


    @And("user deletes the link before sending")
    public void user_deletes_the_link_before_sending() {
       armelPage.messageField.clear();
    }

    @And("user clicks send button after link is deleted")
    public void user_clicks_send_button_after_link_is_deleted() {
        armelPage.sendButton.click();
    }



    @Then("user deleted link is not attached to the message that has been sent")
    public void user_deleted_link_is_not_attached_to_the_message_that_has_been_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user insert video")
    public void user_insert_video() throws InterruptedException {
      armelPage.userAbleToInsertVideo();
    }

    @And("user delete added video")
    public void user_delete_added_video() {
        WebDriver driver;
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);
        armelPage.insertVideo_insertedVideo.isDisplayed();
        actions.contextClick(armelPage.insertVideo_insertedVideo).perform();
        armelPage.deleteVideo_popUpMenuItem.click();
    }

    @And("user clicks on send button after video is deleted")
    public void user_clicks_on_send_button_after_video_is_deleted() {
        armelPage.sendButton.click();
    }


    @Then("user deleted video is not attached to the message that has been sent")
    public void user_deleted_video_is_not_attached_to_the_message_that_has_been_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks tag button")
    public void user_clicks_tag_button() {
        armelPage.addTag_tagIcon.click();
    }

    @And("user adds tag")
    public void user_adds_tag() {
        armelPage.addTag_tagField.click();
        armelPage.addTag_tagField.sendKeys("Java");

    }

    @And("user clicks on the add button")
    public void user_clicks_on_the_add_button() {
       armelPage.addTag_addButton.click();
    }


    @And("user clicks on send button after tags added")
    public void user_clicks_on_send_button_after_tags_added() {
        armelPage.sendButton.click();
    }

    @Then("user sees added tag in the message that has been sent")
    public void user_sees_added_tag_in_the_message_that_has_been_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user add tags")
    public void user_add_tags() {
        armelPage.userAbleToAddTag();
    }

    @And("user delete added tag")
    public void user_delete_added_tag() {
        armelPage.addTag_tagField.clear();
    }

    @And("user clicks on send button after added tag deleted")
    public void user_clicks_on_send_button_after_added_tag_deleted() {
      armelPage.sendButton.click();
    }

    @Then("user deleted tags is not attached to the message that has been sent")
    public void user_deleted_tags_is_not_attached_to_the_message_that_has_been_sent() {
        armelPage.sentMessageTC2.isDisplayed();

    }














}
