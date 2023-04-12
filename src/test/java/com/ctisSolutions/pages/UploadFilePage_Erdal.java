package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFilePage_Erdal {


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement send_btn;

    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public  WebElement sendMessageTextArea;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesBtn;

    @FindBy(xpath="(//div[@class='diskuf-uploader']//input[@name='bxu_files[]'])")
    public WebElement uploadFileAndImagesBox;

    @FindBy(xpath = "//*[.='catOnTheBoard.gif'][@title='Click to insert file']")
    public WebElement uploadedGif;

    @FindBy(xpath = "//*[.='kalkan.png'][@title='Click to insert file']")
    public WebElement uploadedPng;

    @FindBy(xpath = "//*[.='docxsample.docx'][@title='Click to insert file']")
    public WebElement uploadedDocx;


    public UploadFilePage_Erdal() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void goToMessageTextField(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(sendMessageTextArea));
        sendMessageTextArea.click();
        wait.until(ExpectedConditions.visibilityOf(send_btn));
    }

    public void clickUploadFilesBtn(){
        uploadFilesBtn.click();
    }

    public void verifyUploadOptionsVisible(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(uploadFileAndImagesBox));
        Assert.assertTrue(uploadFileAndImagesBox.isDisplayed());
    }

    public void uploadThreeFiles() throws InterruptedException {

        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\catOnTheBoard.gif");
        Thread.sleep(2000);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\kalkan.png");
        Thread.sleep(2000);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\docxsample.docx");
        Thread.sleep(2000);
    }

    public void verifyUploadedFiles(){

        Assert.assertTrue(uploadedGif.isDisplayed());
        Assert.assertTrue(uploadedDocx.isDisplayed());
        Assert.assertTrue(uploadedPng.isDisplayed());

    }




}
