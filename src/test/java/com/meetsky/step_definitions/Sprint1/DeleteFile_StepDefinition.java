package com.meetsky.step_definitions.Sprint1;

import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DeleteFile_StepDefinition {
    FilesPage filesPage = new FilesPage();
    String totalFoldersBefore = filesPage.totalFolders.getText();
    @When("the user selects an item by clicking on the three dots menu")
    public void the_user_selects_an_item_by_clicking_on_the_three_dots_menu() {
        System.out.println(filesPage.threeDots.getText());

        List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }


       // BrowserUtils.sleep(3);
        filesPage.threeDots.click();
       //BrowserUtils.sleep(3);


    }

    @When("selects Delete folder button")
    public void selects_delete_folder_button() {

       // BrowserUtils.sleep(3);
       filesPage.deleteButton.click();
       // BrowserUtils.sleep(3);
    }

    @Then("the selected item should be deleted from files page")
    public void the_selected_item_should_be_deleted_from_files_page() {

        BrowserUtils.sleep(10);
        boolean deleted = false;


        List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }
        if (!fileNames.contains(ConfigurationReader.getProperty("selectedfile.name"))) {
            deleted= true;
        }


        Assert.assertTrue(deleted);


        BrowserUtils.sleep(5);
        System.out.println(totalFoldersBefore);
        System.out.println(filesPage.totalFolders.getText());
        Assert.assertNotEquals(totalFoldersBefore,filesPage.totalFolders.getText());
        BrowserUtils.sleep(5);




    }


}
