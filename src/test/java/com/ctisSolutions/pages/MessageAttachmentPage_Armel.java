package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.BrowserUtils;
import com.ctisSolutions.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MessageAttachmentPage_Armel {

    //Background
    @FindBy(xpath = "//*[@id=\\\"bx_left_menu_menu_live_feed\\\"]/a/span[1]")
    public WebElement activityStreamButton;

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']//span[contains(text(),'Message')]")
    public WebElement messageField;

    //TS01
    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMention_mentionIcon;

    @FindBy (xpath = "//div[contains(text(),'hr1@cybertekschool.com')]")
    public WebElement addMention_userToMention;

    @FindBy (xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement addMention_recepientField;


    //TS02
    @FindBy (xpath = "//div[@id='feed-add-post-destination-container']")
    public WebElement addLink_linkIcon;

    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement addLink_textField;

    @FindBy (xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement addLink_linkField;

    @FindBy (xpath = "//input[@id='']")
    public WebElement addLink_saveButton;

    @FindBy (xpath = "")
    public WebElement addLink_messageLink;

    //TS03

    @FindBy (xpath = "//span[@title='Insert video']//i")
    public WebElement insertVideo_insertVideoIcon;

    @FindBy (xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement insertVideo_videoSource;

    @FindBy (xpath = "//div[@class='bx-core-adm-dialog-content-wrap adm-workarea bxhtmled-dialog bxhtmled-video-dialog']//input[@id='']")
    public WebElement insertVideo_saveButton;

    @FindBy (xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement insertVideo_allertMessage;

    @FindBy (xpath = "")
    public WebElement insertVideo_insertedVideo;


    //TS04

    @FindBy (xpath = "")
    public WebElement deleteLink_addedLink;

    //TS05

    @FindBy (xpath = "")
    public WebElement deleteVideo_addedVideo;

    @FindBy (xpath = "//body[1]/div[16]/span[3]/span[2]")
    public WebElement deleteVideo_popUpMenuItem;

    //TS05

    @FindBy (xpath = "//span[@id='bx-b-tag-input-blogPostForm']")
    public WebElement addTag_tagIcon;

    @FindBy (xpath = "//div[@id='post-tags-container-blogPostForm']")
    public WebElement addTag_tagField;

    @FindBy (xpath = "//span[@class='popup-window-button']")
    public WebElement addTag_addButton;

    //TS06
    @FindBy (xpath = "//span[@class='feed-add-post-tags']")
    public WebElement addTag_addedTag;


    //end step

    @FindBy (xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


    @FindBy (xpath = "")
    public WebElement sentMessageTC1;

    @FindBy (xpath = "")
    public WebElement sentMessageTC2;

    @FindBy (xpath = "")
    public WebElement sentMessageTC3;

    @FindBy (xpath = "")
    public WebElement sentMessageTC4;

    @FindBy (xpath = "")
    public WebElement sentMessageTC5;

    //----------------------------------------------------------------------------//


    public void userAbleToAddMention(){
        String recepient = "admin";

        addMention_mentionIcon.click();
        addMention_recepientField.sendKeys(recepient);
        Assert.assertEquals(recepient,addMention_recepientField.getText());

    }

    public void userAbleToAttachlinkAndText(){
        String text = "Java Video";
        String link = "https://youtu.be/9U684GbFST4";

        addLink_linkIcon.click();
        addLink_textField.sendKeys(text);
        addLink_linkField.sendKeys(link);
        addLink_saveButton.click();

    }

    public void userAbleToInsertVideo() throws InterruptedException {
        insertVideo_insertVideoIcon.click();
        insertVideo_videoSource.sendKeys("string");
        Thread.sleep(5000);
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[@title='Insert video']//i"));
        insertVideo_saveButton.click();

    }

    public void userAbleToDeleteLinkBeforeSending(){

        userAbleToAttachlinkAndText();
        messageField.clear();





    }

    public void userAbleToDeleteVideoBeforeSending() throws InterruptedException {

        userAbleToInsertVideo();

        WebDriver driver ;
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);
        insertVideo_insertedVideo.isDisplayed();
        actions.contextClick(insertVideo_insertedVideo).perform();
        deleteVideo_popUpMenuItem.click();
    }

    public void userAbleToAddTag(){
        addTag_tagIcon.click();
        addTag_tagField.click();
        addTag_tagField.sendKeys("");
        addTag_addButton.click();
        Assert.assertNotNull(addTag_tagField);

    }

    public void userAbleToDeleteTagBeforeSending(){
        userAbleToAddTag();
        addTag_tagField.clear();
        Assert.assertNull(addTag_addedTag);
    }



}
