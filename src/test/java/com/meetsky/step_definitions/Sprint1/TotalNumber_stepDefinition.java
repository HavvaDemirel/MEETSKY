package com.meetsky.step_definitions.Sprint1;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TotalNumber_stepDefinition {

    FilesPage filesPage = new FilesPage();
    Faker faker = new Faker();


    @Then("the user should be able to see the total number of files and folders under the files list table")
    public void the_user_should_be_able_to_see_the_total_number_of_files_and_folders_under_the_files_list_table() {
        BrowserUtils.sleep(3);

        Assert.assertTrue(filesPage.totalFiles.isDisplayed());

        Assert.assertTrue(filesPage.totalFolders.isDisplayed());
        BrowserUtils.sleep(3);



    }

    //___________________________________________________updated total number of file after adding a file or folder


    @When("the user adds a new file or folder and see the updated total number of files and folders under the list table")
    public void the_user_adds_a_new_file_or_folder_and_see_the_updated_total_number_of_files_and_folders_under_the_list_table() {
        BrowserUtils.sleep(3);

        String totalFoldersBefore = filesPage.totalFolders.getText();

        filesPage.plusIcon.click();

        filesPage.newFolderButton.click();

        filesPage.newFolderButtonName.sendKeys(faker.name().firstName());

        filesPage.uploadFolderNameConfirm.click();

        Driver.getDriver().navigate().refresh();

        BrowserUtils.waitForVisibility(filesPage.totalFolders,5);

        System.out.println(totalFoldersBefore);

        System.out.println(filesPage.totalFolders.getText());

        Assert.assertNotEquals(totalFoldersBefore,filesPage.totalFolders.getText());

        BrowserUtils.sleep(5);


    }
        //_____________________________________________________________________________updated total number of file after deleting a file or folder
        @When("the user delete a file or folder  and see the updated total number of files and folders under the list table")
        public void the_user_delete_a_file_or_folder_and_see_the_updated_total_number_of_files_and_folders_under_the_list_table() {

            String totalFoldersBefore = filesPage.totalFolders.getText();

            filesPage.threeDots.click();


            filesPage.deleteButton.click();

            Driver.getDriver().navigate().refresh();

            BrowserUtils.waitForVisibility(filesPage.totalFolders,5);

            System.out.println(totalFoldersBefore);
            System.out.println(filesPage.totalFolders.getText());
            Assert.assertNotEquals(totalFoldersBefore,filesPage.totalFolders.getText());






        }



}
