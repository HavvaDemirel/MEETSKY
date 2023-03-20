package com.meetsky.step_definitions.done;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class NewTextFile_StepDefinition {

    FilesPage filesPage = new FilesPage();
    String TextFileName = "1";

    @When("user clicks new text file")
    public void user_clicks_new_text_file() {

        filesPage.newTextFileButton.click();
        filesPage.fileNameInputBox.sendKeys(TextFileName);
        filesPage.newTextFileConfirmButton.click();
    }

    @Then("the file is created successfully and user is in the text file")
    public void the_file_is_created_successfully_and_user_is_in_the_text_file() {
        BrowserUtils.sleep(5);
        String title = Driver.getDriver().getTitle();
        System.out.println(title);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("1.md - QA - Meetsky"));
        filesPage.fileXButton.click();
    }

    @Then("user can see the file in the file page")
    public void user_can_see_the_file_in_the_file_page() {
        filesPage.fileXButton.click();

        String firstRowAFTER = filesPage.firstRow.getText();
        System.out.println(firstRowAFTER);
        BrowserUtils.sleep(3);
        Assert.assertTrue(firstRowAFTER.contains(TextFileName) );


    }


    @When("user clicks new text file with same name")
    public void userClicksNewTextFileWithSameName() {
        filesPage.newTextFileButton.click();
        filesPage.fileNameInputBox.sendKeys(TextFileName);


    }

    @And("user can see file name is existing message")
    public void userCanSeeFileNameIsExistingMessage() {
       Assert.assertTrue(filesPage.fileNameAlreadyExistMessage.isDisplayed());

    }


}
