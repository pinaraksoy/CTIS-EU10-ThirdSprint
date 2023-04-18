package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Poll_Page {

    public Poll_Page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "span[id='feed-add-post-form-tab-vote']")
    public WebElement pollTab;

    @FindBy(xpath = "//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']//iframe")
    public WebElement titleMessageBox;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement contactToInput;

    @FindBy(css = "span[class='feed-add-post-del-but']")
    public WebElement deleteAllEmployeesSign;


    @FindBy(xpath = "//div[@class='bx-finder-box-tabs']/a[2]")
    public WebElement EmployeesAndDepartments;

   @FindBy(xpath = "//div[@id='bx-lm-category-relation-129']/a[2]/div/div")
   public WebElement helpdeskEmail;

    @FindBy(xpath = "//div[@id='bx-lm-category-relation-129']/a[3]/div/div")
    public WebElement hrEmail;

    @FindBy(xpath = "//div[@id='bx-lm-category-relation-129']//a[@rel='U592']/div/div")
    public WebElement marketingEmail;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public List<WebElement>  contactlist;

    @FindBy(css = "span[class='popup-window-close-icon']")
    public WebElement closeContactListSign;

    @FindBy(id = "question_0")
    public WebElement question1Input;

    @FindBy(id = "answer_0__0_")
    public WebElement answer1Input;

    @FindBy(id = "answer_0__1_")
    public WebElement answer2Input;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionLink;

    @FindBy(id = "question_1")
    public WebElement question2Input;

    @FindBy(id = "answer_1__0_")
    public WebElement answer1OfSecondQuestionInput;

    @FindBy(id = "answer_1__1_")
    public WebElement answer2OfSecondQuestionInput;

    @FindBy(xpath = "//div[@class='vote-fields']/ol/li[2]/div/label[@title='Delete question']")
    public WebElement deleteQuestion2;

    @FindBy(id = "multi_0")
    public WebElement allowMultipleChoiceCheckbox;

    @FindBy(css = "button[id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "(//label[.='Answer 1']/../label)[1]/span")
    public WebElement checkboxOfFirstAnswer;

    @FindBy(xpath = "(//label[.='Answer 2']/../label)[1]/span")
    public WebElement checkboxOfSecondAnswer;


    @FindBy(xpath = "//button[text()='Vote']")
    public WebElement voteButton;

    @FindBy(xpath = "(//span[@class='bx-vote-data-percent']/..)[1]/span")
    public WebElement verifyFirstAnswerSelected;

    @FindBy(xpath = "(//span[@class='bx-vote-data-percent']/..)[1]/span")
    public WebElement verifySecondAnswerSelected;


    @FindBy(xpath = "(//span[.='More'][@class='feed-post-more-text' ])[1]")
    public WebElement moreButton;

    @FindBy(xpath = "//span[@class='menu-popup-item menu-popup-no-icon '][5]")
    public WebElement deleteButton;

    @FindBy(xpath = "//span[text()='The post has been deleted.']")
    public WebElement postDeletedMessage;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement atLeastOnePersonMessage;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement titleWarningMessage;

    @FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement questionWarningMessage;

    public WebElement answerWarningMessage(String question){
        String path = "//span[.='The question \"" +question+ "\" has no answers.']";
        WebElement answerWarningMessage= Driver.getDriver().findElement(By.xpath(path));

        return answerWarningMessage;
    }
}
