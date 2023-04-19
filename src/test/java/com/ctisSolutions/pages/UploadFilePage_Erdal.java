package com.ctisSolutions.pages;

import com.ctisSolutions.utilities.BrowserUtils;
import com.ctisSolutions.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @FindBy(xpath="//input[@name='bxu_files[]']")
    public WebElement uploadFileAndImagesBox;

    @FindBy(xpath = "//span[contains(text(),'.gif')]")
    public WebElement uploadedGif;

    @FindBy(xpath = "//span[contains(text(),'.png')]")
    public WebElement uploadedPng;

    @FindBy(xpath = "//span[contains(text(),'.docx')]")
    public WebElement uploadedDocx;

    @FindBy(xpath = "//span[contains(text(),'.pdf')]")
    public WebElement uploadedPdf;

    @FindBy(xpath = "//span[contains(text(),'.txt')]")
    public WebElement uploadedTxt;

    @FindBy(xpath = "//span[contains(text(),'.jpg')]")
    public WebElement uploadedJpeg;

    @FindBy(xpath = "//tbody[@class='diskuf-placeholder-tbody']/tr[1]/td[@class='files-info']/span")
    public WebElement insertable1;

    @FindBy(xpath = "//tbody[@class='diskuf-placeholder-tbody']/tr[2]/td[@class='files-info']/span[@class='insert-btn']")
    public WebElement insertable2;

    @FindBy(xpath = "//tbody[@class='diskuf-placeholder-tbody']/tr[3]/td[@class='files-info']/span")
    public WebElement insertable3;

    @FindBy(xpath = "/html[1]/body[1]/img[1]")
    public WebElement insertedPng;

    @FindBy(xpath = "//img[contains(@src,'filename=gifsample')][@style]")
    public WebElement insertedGif;

    @FindBy(xpath = "//span[contains(text(),'docxsample.docx')]")
    public WebElement insertedDocx;

    @FindBy(xpath = "//tbody/tr[1]/td[@class='files-del-btn']/span[@class='del-but']")
    public WebElement delBtn1;

    @FindBy(xpath = "//tbody/tr[2]/td[@class='files-del-btn']/span[@class='del-but']")
    public WebElement delBtn2;

    @FindBy(xpath = "//tbody/tr[3]/td[@class='files-del-btn']/span[@class='del-but']")
    public WebElement delBtn3;

    @FindBy(xpath = "//img[@class='files-preview']")
    public WebElement imgFieldOfAddedFile;

    @FindBy(xpath = "(//span[@class='files-text']//span)[5]")
    public WebElement renameBtn;

    @FindBy (xpath = "//input[@class='files-name-edit-inp']")
    public WebElement renamedFileInput;

    @FindBy (xpath = "//span[@title='Click to insert file']")
    public WebElement renamedFileUsetoTextAssert;




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

    public void uploadThreeFiles() {

        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\gifsample.gif");
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\pngsample.png");
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\docxsample.docx");
    }

    public void verifyUploadedFiles(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(uploadedDocx));

        Assert.assertTrue(uploadedGif.isDisplayed());
        Assert.assertTrue(uploadedPng.isDisplayed());
        Assert.assertTrue(uploadedDocx.isDisplayed());

    }

    public void uploadPdfTxtDocx(){
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\pdfsample.pdf");
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\txtsample.txt");
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\docxsample.docx");
    }

    public void verifyUploadedFilesInPdfTxtDocxFormats(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(uploadedDocx));

        Assert.assertTrue(uploadedPdf.isDisplayed());
        Assert.assertTrue(uploadedTxt.isDisplayed());
        Assert.assertTrue(uploadedDocx.isDisplayed());

    }

    public void uploadJpegGifPng(){
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\pngsample.png");
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\gifsample.gif");
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\jpegsample.jpg");
    }

    public void verifyUploadedFilesInJpegGifPngFormats(){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(uploadedJpeg));

        Assert.assertTrue(uploadedJpeg.isDisplayed());
        Assert.assertTrue(uploadedGif.isDisplayed());
        Assert.assertTrue(uploadedPng.isDisplayed());

    }

    public void insertAllUpdated(){

        BrowserUtils.sleep(1);
        insertable1.click();
        BrowserUtils.sleep(1);
        insertable2.click();
        BrowserUtils.sleep(1);
        insertable3.click();
    }

    public void verifyInsertAllUpdated(){

        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        Assert.assertTrue(insertedPng.isDisplayed());
        Assert.assertTrue(insertedGif.isDisplayed());
        Assert.assertTrue(insertedDocx.isDisplayed());
        Driver.getDriver().switchTo().parentFrame();

    }

    public void deleteFiles(){

        delBtn3.click();
        delBtn2.click();
        delBtn1.click();
        BrowserUtils.sleep(1);

    }

    public void verifyDeletedFiles(){
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//tbody/tr[1]/td[@class='files-del-btn']/span[@class='del-but']"));
    }

    public void uploadOneFile() {
        BrowserUtils.sleep(2);
        uploadFileAndImagesBox.sendKeys("C:\\Users\\a\\Dropbox\\My PC (Guardians)\\Desktop\\Upload files for E10Project\\gifsample.gif");
    }

    public void renameFile(String string){

        renamedFileInput.click();
        renamedFileInput.sendKeys(Keys.chord(Keys.CONTROL, "a")+Keys.CLEAR);
        renamedFileInput.sendKeys(string);
        renamedFileInput.sendKeys(Keys.ENTER);
        BrowserUtils.sleep(1);
    }

    public void verifyRenamedFile(){
        String actualName = renamedFileUsetoTextAssert.getText();
        String expectedName = "renamedFile.gif";
        Assert.assertEquals(actualName,expectedName);
    }


}
