package com.ctisSolutions.step_definitions;

import com.ctisSolutions.pages.Poll_Page;
import com.ctisSolutions.utilities.BrowserUtils;
import com.ctisSolutions.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class Poll_Steps {
    Poll_Page pollPage = new Poll_Page();
    @Given("User clicks POLL tab")
    public void user_clicks_poll_tab() {
        pollPage.pollTab.click();
    }
    @When("User writes a title in message box")
    public void user_writes_a_title_in_message_box() {
        Actions action = new Actions(Driver.getDriver());
        BrowserUtils.waitFor(5);
        action.click(pollPage.titleMessageBox).sendKeys("This is title").perform();


    }
    @And("User clicks x sign of {string} choice to delete it")
    public void user_clicks_x_sign_of_choice_to_delete_it(String string) {
       pollPage.deleteAllEmployeesSign.click();
    }
    @And("User clicks on {string} link")
    public void user_clicks_on_link(String string) {
        pollPage.contactToInput.click();
    }
    @And("User clicks Employees and departments")
    public void user_clicks_employees_and_departments() {
        pollPage.EmployeesAndDepartments.click();
    }
    @And("User select multiple contacts")
    public void user_select_multiple_contacts() {
        pollPage.hrEmail.click();
        pollPage.helpdeskEmail.click();
        pollPage.marketingEmail.click();
    }

    @Then("verify multiple contacts are on the to box")
    public void verify_multiple_contacts_are_on_the_to_box() {
        for (WebElement each : pollPage.contactlist) {
           Assert.assertTrue(each.isDisplayed());
        }
    }

    @And("User click x sign for closing contacts list")
    public void user_click_x_sign_for_closing_contacts_list() {
         pollPage.closeContactListSign.click();
    }

    @When("User clicks Question and write a question as {string}")
    public void user_clicks_question_and_write_a_question_as(String question) {
        pollPage.question1Input.click();
        pollPage.question1Input.sendKeys(question);
    }
    @And("User clicks AnswerFirst and write an answer")
    public void user_clicks_answer_first_and_write_an_answer() {
        pollPage.answer1Input.sendKeys("Answer 1");

    }
    @And("User clicks AnswerSecond and write an answer")
    public void user_clicks_answer_second_and_write_an_answer() {
        pollPage.answer2Input.sendKeys("Answer 2");
    }
    @And("User clicks Add question and add a question with two answers")
    public void user_clicks_add_question_and_add_a_question_with_two_answers() {
       pollPage.addQuestionLink.click();
       pollPage.question2Input.sendKeys("Question 2 template");
       pollPage.answer1OfSecondQuestionInput.sendKeys("Answer 1 for second Question");
       pollPage.answer2OfSecondQuestionInput.sendKeys("Answer 2 for second Question");
    }
    @And("user can delete the added question and its answers")
    public void user_can_delete_the_added_question_and_its_answers() {
        pollPage.question2Input.click();
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
       wait.until(ExpectedConditions.elementToBeClickable(pollPage.deleteQuestion2));

        pollPage.deleteQuestion2.click();
       Alert alert = Driver.getDriver().switchTo().alert();
       alert.accept();


    }
    @And("User clicks Allow multiple choice  checkbox")
    public void user_clicks_allow_multiple_choice_checkbox() {
        pollPage.allowMultipleChoiceCheckbox.click();
    }
    @And("User clicks SEND button")
    public void user_clicks_send_button() {
       pollPage.sendButton.click();
    }
     @And("User clicks on checkboxes")
    public void user_clicks_on_checkboxes() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(pollPage.checkboxOfFirstAnswer));
        pollPage.checkboxOfFirstAnswer.click();
        pollPage.checkboxOfSecondAnswer.click();

    }

    @And("User clicks on vote button")
    public void user_clicks_on_vote_button() {
        pollPage.voteButton.click();
    }

    @Then("verify multiple checkboxes are selected")
    public void verify_multiple_checkboxes_are_selected() {
        BrowserUtils.sleep(5);
       Assert.assertTrue(pollPage.verifyFirstAnswerSelected.isDisplayed());
       Assert.assertTrue(pollPage.verifySecondAnswerSelected.isDisplayed());
    }
    @When("User clicks More button")
    public void user_clicks_more_button() {
        pollPage.moreButton.click();
    }
    @When("User clicks Delete  button")
    public void user_clicks_delete_button() {
         pollPage.deleteButton.click();
    }
    @When("User clicks OK  button")
    public void user_clicks_ok_button() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @Then("Verify {string} message is displayed")
    public void verify_message_is_displayed(String string) {
        Assert.assertTrue(pollPage.postDeletedMessage.isDisplayed());
    }
    @Then("the warning message should be displayed about title")
    public void the_warning_message_should_be_displayed_about_title() {
        Assert.assertTrue(pollPage.titleMessageBox.isDisplayed());
    }

    @Then("the warning message of {string} should be displayed about no answers")
    public void the_warning_message_of_should_be_displayed_about_no_answers(String question) {
        Assert.assertTrue(pollPage.answerWarningMessage(question).isDisplayed());
    }
    @Then("the warning message should be displayed about question text")
    public void the_warning_message_should_be_displayed_about_question_text() {
       Assert.assertTrue(pollPage.questionWarningMessage.isDisplayed());
    }

    @Then("the warning message should be displayed about at least one person")
    public void the_warning_message_should_be_displayed_about_at_least_one_person() {
       pollPage.atLeastOnePersonMessage.isDisplayed();
    }



}
