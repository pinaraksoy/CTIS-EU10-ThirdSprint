package com.ctisSolutions.step_definitions;

import com.ctisSolutions.pages.LoginPage;
import com.ctisSolutions.pages.eventPage_Busra;
import com.ctisSolutions.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestResult;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class eventTab_Busra {


    eventPage_Busra eventPageBusra=new eventPage_Busra();
    LoginPage loginPage=new LoginPage();


  //  @Given("the user should enter app with valid {string} {string} {string}")
   // public void the_user_should_enter_app_with_valid (String url, String username, String password){
       // Driver.getDriver().get(url);
      //  loginPage.login(username, password);
    //}



    @Given("user click to event button")
    public void user_click_to_event_button() {
        eventPageBusra.eventButton.click();
    }


    @When("user add new event start date as {string}")
    public void user_add_new_event_start_date_as(String startDate) throws InterruptedException {
        Thread.sleep(3000);
        eventPageBusra.startDate.click();
        Thread.sleep(2000);
        eventPageBusra.startDate.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + startDate);
    }
    @When("user add new event start time {int} and {int}")
    public void user_add_new_event_start_time_and(Integer hour, Integer minute) throws InterruptedException {
        Thread.sleep(3000);
        eventPageBusra.startTime.click();
        Thread.sleep(2000);
        eventPageBusra.startTimeHour.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + hour);
        eventPageBusra.startTimeMinute.click();
        eventPageBusra.startTimeMinute.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + minute);
        eventPageBusra.setTimeButton.click();
    }
    @Then("user add new event end date {string}")
    public void user_add_new_event_end_date(String endDate) throws InterruptedException {
        Thread.sleep(3000);
        eventPageBusra.endDate.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + endDate);

    }
    @Then("user add new event end time {int} and {int}")
    public void user_add_new_event_end_time_and(Integer hour, Integer minute) throws InterruptedException {
        Thread.sleep(3000);
        eventPageBusra.endTime.click();
        Thread.sleep(3000);
        eventPageBusra.endTimeHour.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + hour);

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='feed_cal_event_to_timecal_3Jcl']")));

        //eventPageBusra.endTimeMinute.click();

       // WebDriverWait wait2= new WebDriverWait(Driver.getDriver(),5);
       // wait2.until(ExpectedConditions.elementToBeClickable(eventPageBusra.endTimeMinute));

        eventPageBusra.endTimeMinute.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + minute);

        //Thread.sleep(3000);

        //eventPageBusra.setTimeButton.click();
    }
    @Then("user specify the time zone")
    public void user_specify_the_time_zone() throws InterruptedException {
        Thread.sleep(2000);
        eventPageBusra.specifytimezone.click();
        Thread.sleep(3000);
        Select timezoneDropdown=new Select(eventPageBusra.timeZone);
        timezoneDropdown.selectByIndex(2);

    }
    @Then("user click all day radiobutton")
    public void user_click_all_day_radiobutton() throws InterruptedException {
        Thread.sleep(2000);
        eventPageBusra.allDayButton.click();

    }






    //@Given("user click set reminder button")
    //public void user_click_set_reminder_button() throws InterruptedException {
      //  Thread.sleep(3000);
      //eventPageBusra.setReminderButton.click();
   // }
   @Then("user set remind count as {string}")
   public void userSetRemindCountAs(String count) throws InterruptedException {
        Thread.sleep(3000);
        eventPageBusra.remindercountButton.sendKeys(Keys.chord(Keys.CONTROL + "a") + Keys.BACK_SPACE + count);

   }

    @Then("user set remind minutes")
    public void user_set_remind_minutes() throws InterruptedException {
        Thread.sleep(2000);
        Select reminderTypedropdown= new Select(eventPageBusra.remindertypeButton);
        reminderTypedropdown.selectByValue("min");
    }





    @When("user click to event name button")
    public void userClickToEventNameButton() throws InterruptedException {
        Thread.sleep(3000);
        eventPageBusra.eventName.click();
    }

    @When("user write event")
    public void user_write_event() throws InterruptedException {
        Thread.sleep(3000);
        eventPageBusra.eventName.sendKeys("eventmessage");
    }
    @Then("click send event button")
    public void click_send_event_button() throws InterruptedException {
        Thread.sleep(4000);
        eventPageBusra.sendButton.click();
    }








    @Then("user cancel event")
    public void user_cancel_event() {
        eventPageBusra.cancelButton.click();
    }

}
