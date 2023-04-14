package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll_Page {

    public Poll_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "span[id='feed-add-post-form-tab-vote']")
    public WebElement pollButton;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement contactToInput;

    @FindBy(css = "span[class='feed-add-post-del-but']")
    public WebElement deleteAllEmployeesSign;


    @FindBy(id = "destDepartmentTab_destination9249292")
    public WebElement EmployeesAndDepartments;

    @FindBy(xpath = "//div[.='hr11@cybertekschool.com']")
    public WebElement h11UserContact;






}
