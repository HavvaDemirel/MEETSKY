package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TotalNumber_stepDefinition {

    FilesPage filesPage = new FilesPage();
    Faker faker = new Faker();


    @Then("the user should be able to see the total number of files and folders under the files list table")
    public void the_user_should_be_able_to_see_the_total_number_of_files_and_folders_under_the_files_list_table() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(filesPage.totalFiles.isDisplayed());
        Assert.assertTrue(filesPage.totalFolders.isDisplayed());



    }

    //___________________________________________________updated total number of file after adding a file or folder


    @When("the user adds a new file or folder and see the updated total number of files and folders under the list table")
    public void the_user_adds_a_new_file_or_folder_and_see_the_updated_total_number_of_files_and_folders_under_the_list_table() {
        BrowserUtils.sleep(3);

        String totalFoldersBefore = filesPage.totalFolders.getText();
        BrowserUtils.sleep(3);
        filesPage.plusIcon.click();
        filesPage.newFolderButton.click();
        BrowserUtils.sleep(2);
        filesPage.newFolderButtonName.sendKeys(faker.name().firstName());
        BrowserUtils.sleep(2);
        filesPage.uploadFolderNameConfirm.click();
        BrowserUtils.sleep(2);
        BrowserUtils.waitForVisibility(filesPage.totalFolders,5);

        BrowserUtils.sleep(10);
        System.out.println(totalFoldersBefore);
        System.out.println(filesPage.totalFolders.getText());

        Assert.assertNotEquals(totalFoldersBefore,filesPage.totalFolders.getText());
        BrowserUtils.sleep(5);


    }
        //_____________________________________________________________________________updated total number of file after deleting a file or folder
        @When("the user delete a file or folder  and see the updated total number of files and folders under the list table")
        public void the_user_delete_a_file_or_folder_and_see_the_updated_total_number_of_files_and_folders_under_the_list_table() {
            BrowserUtils.sleep(3);

            String totalFoldersBefore = filesPage.totalFolders.getText();
            BrowserUtils.sleep(3);
            filesPage.threeDots.click();
            BrowserUtils.sleep(3);
            BrowserUtils.sleep(3);
            filesPage.deleteButton.click();


            BrowserUtils.sleep(3);
            BrowserUtils.waitForVisibility(filesPage.totalFolders,5);

            BrowserUtils.sleep(10);
            System.out.println(totalFoldersBefore);
            System.out.println(filesPage.totalFolders.getText());

            Assert.assertNotEquals(totalFoldersBefore,filesPage.totalFolders.getText());
            BrowserUtils.sleep(5);





        }











}
