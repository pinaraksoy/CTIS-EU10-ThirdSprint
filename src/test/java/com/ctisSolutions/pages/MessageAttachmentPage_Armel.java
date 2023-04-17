package com.ctisSolutions.pages;

import org.openqa.selenium.WebElement;
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

    @FindBy (xpath = "")
    public WebElement addMention_recepientField;


    //TS02
    @FindBy (xpath = "")
    public WebElement addLink_linkIcon;

    @FindBy (xpath = "")
    public WebElement addLink_textField;

    @FindBy (xpath = "")
    public WebElement addLink_linkField;

    @FindBy (xpath = "")
    public WebElement addLink_saveButton;

    @FindBy (xpath = "")
    public WebElement addLink_messageLink;

    //TS03

    @FindBy (xpath = "")
    public WebElement insertVideo_insertVideoIcon;

    @FindBy (xpath = "")
    public WebElement insertVideo_videoSource;

    @FindBy (xpath = "")
    public WebElement insertVideo_saveButton;

    @FindBy (xpath = "")
    public WebElement insertVideo_allertMessage;

    //TS04

    @FindBy (xpath = "")
    public WebElement deleteLink_addedLink;

    //TS05

    @FindBy (xpath = "")
    public WebElement deleteVideo_addedVideo;

    //TS05

    @FindBy (xpath = "")
    public WebElement addTag_tagIcon;

    @FindBy (xpath = "")
    public WebElement addTag_tagField;

    @FindBy (xpath = "")
    public WebElement addTag_addButton;

    //TS06
    @FindBy (xpath = "")
    public WebElement addTag_addedTag;










    //end step

    @FindBy (xpath = "")
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







}
