package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class eventPage_Busra {


    public eventPage_Busra() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventButton;

    @FindBy(xpath = "//input[@class='feed-event-inp feed-event-inp-active']")
    public WebElement eventName;

    @FindBy(xpath = "//input[@id='feed-cal-event-fromcal_3Jcl']")
    public WebElement startDate;

    @FindBy(xpath = "//input[@id='feed_cal_event_from_timecal_3Jcl']")
    public WebElement startTime;

    @FindBy(xpath = "(//input[@class='bxc-cus-sel'])[1]")
    public WebElement startTimeHour;

    @FindBy(xpath = "(//input[@class='bxc-cus-sel'])[2]")
    public WebElement startTimeMinute;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTimeButton;

    @FindBy(xpath = "//input[@id='feed-cal-event-tocal_3Jcl']")
    public WebElement endDate;

    @FindBy(xpath = "//input[@id='feed_cal_event_to_timecal_3Jcl']")
    public WebElement endTime;

    @FindBy(xpath = "//input[@id='feed_cal_event_to_timecal_3Jcl']")
    public WebElement endTimeHour;

    @FindBy(xpath = "//input[@id='feed_cal_event_to_timecal_3Jcl']")
    public WebElement endTimeMinute;

    @FindBy(xpath = "//span[@class='feed-ev-tz-open']")
    public WebElement specifytimezone;

    @FindBy(id = "feed-cal-tz-fromcal_3Jcl")
    public WebElement timeZone;

    @FindBy(id = "event-full-daycal_3Jcl")
    public WebElement allDayButton;

    @FindBy(xpath = "//input[@class='feed-event-rem-ch']")
    public WebElement setReminderButton;

    @FindBy(id = "event-remind_countcal_3Jcl")
    public WebElement remindercountButton;

    @FindBy(xpath = "//select[@id='event-remind_typecal_3Jcl']")
    public WebElement remindertypeButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;


    @FindBy (xpath = "(//div[@class='feed-calendar-view-text'])[1]")
    public WebElement sharingEventAsMessage;



}
