package com.meetsky.step_definitions.Sprint1;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NewTextFile_StepDefinition {

    FilesPage filesPage = new FilesPage();
   // String TextFileName = "1";

    @When("user clicks new text file")
    public void user_clicks_new_text_file() {

        filesPage.newTextFileButton.click();
        filesPage.fileNameInputBox.sendKeys(ConfigurationReader.getProperty("new.textfile.name"));
        filesPage.newTextFileConfirmButton.click();
    }

    @Then("the file is created successfully and user is in the text file")
    public void the_file_is_created_successfully_and_user_is_in_the_text_file() {
        BrowserUtils.sleep(5);
        String title = Driver.getDriver().getTitle();
        System.out.println(title);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigurationReader.getProperty("new.textfile.name")+".md - QA - Meetsky"));
        filesPage.fileXButton.click();
       // filesPage.fileXButton.click();
    }

    @Then("user can see the file in the file page")
    public void user_can_see_the_file_in_the_file_page() {

       BrowserUtils.sleep(10);


      List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }
        BrowserUtils.sleep(10);
        System.out.println(fileNames);

        Assert.assertTrue(fileNames.contains(ConfigurationReader.getProperty("new.textfile.name")));


    }


    @When("user clicks new text file with same name")
    public void userClicksNewTextFileWithSameName() {
        filesPage.newTextFileButton.click();
        filesPage.fileNameInputBox.sendKeys(ConfigurationReader.getProperty("new.textfile.name"));


    }

    @And("user can see file name is existing message")
    public void userCanSeeFileNameIsExistingMessage() {
       Assert.assertTrue(filesPage.fileNameAlreadyExistMessage.isDisplayed());

    }


}
