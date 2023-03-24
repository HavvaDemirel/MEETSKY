package com.meetsky.step_definitions;

import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class MoveOrCopy_StepDefinition {
    FilesPage filesPage = new FilesPage();


    @When("the user selected an item by clicking tree dots")
    public void the_user_selected_an_item_by_clicking_tree_dots() {
        filesPage.threeDots.click();

    }

    @When("the user clicks move or copy button")
    public void the_user_clicks_move_or_copy_button() {
        filesPage.copyOrMove.click();
    }

    @When("the user see the choose target folder window")
    public void the_user_see_the_choose_target_folder_window() {
        Assert.assertTrue(filesPage.chooseTargetFileWindow.isDisplayed());

    }

    @And("user selects a target file and click move to target folder")
    public void userSelectsATargetFileAndClickMoveToTargetFolder() {
        filesPage.chooseTargetFileWindowFirstRow.click();
        filesPage.moveButton.click();
    }

    @Then("the selected item should be removed from its original location")
    public void the_selected_item_should_be_removed_from_its_original_location() {
        BrowserUtils.sleep(10);
        boolean fileIsRemoved = false;


        List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }
        if (!fileNames.contains("Talk")) {
            fileIsRemoved = true;
        }


        Assert.assertTrue(fileIsRemoved);

      /*  BrowserUtils.sleep(3);
        //filesPage.firstRow.click();
        String fileName = filesPage.FirstRow.getText();
        System.out.println(fileName);
        Assert.assertNotEquals(fileName, "Talk");*/

    }

    @Then("the selected item should appear in the destination folder")
    public void the_selected_item_should_appear_in_the_destination_folder() {
        BrowserUtils.sleep(5);
      //  filesPage.firstRow.click();


        filesPage.tableElements.get(1).click();//for copy i should change index 2
        BrowserUtils.sleep(10);


        List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }
        BrowserUtils.sleep(10);
        Assert.assertTrue(fileNames.contains("Talk"));
       /*
        BrowserUtils.sleep(2);
        filesPage.secondRow.click();
        BrowserUtils.sleep(5);                                                                          //here
        String targetFile = filesPage.targetFileFirstRow.getText();
        System.out.println(targetFile);
        BrowserUtils.sleep(3);
        Assert.assertEquals(targetFile, "Talk");*/

    }

    //______________________________________________________copy

    @And("user selects a target file and click copy to target folder")
    public void userSelectsATargetFileAndClickCopyToTargetFolder() {
        filesPage.chooseTargetFileWindowFirstRow.click();
        filesPage.copyButton.click();
    }

  /*  @When("click copy button")
    public void click_copy_button() {
      }*/


    @Then("the selected item should stay its original location")
    public void the_selected_item_should_stay_its_original_location() {
        BrowserUtils.waitForVisibility(filesPage.plusIcon, 5);

        String firstRowAfterCopying = filesPage.firstRowAfterCopying.getText();
        System.out.println(firstRowAfterCopying);
        Assert.assertEquals(firstRowAfterCopying, "Talk");


    }

    //______________________________________________move new folder
    @When("the user click plus button in the target file")
    public void the_user_click_plus_button() {
        filesPage.targetFilePlusIcon.click();


    }

    @When("the user enter any name")
    public void the_user_enter_any_name() {
    //   filesPage.targetFileNameInputBox.click();
    //   filesPage.targetFileNameInputBox.sendKeys("hhhhhh");

        BrowserUtils.waitForVisibility(filesPage.targetFileNameConfirmButton,5);

       Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys("aaa" + Keys.ENTER).perform();
        //actions.sendKeys(Keys.ENTER).perform();*/

    }

    @When("click create button")
    public void click_create_button() {
        BrowserUtils.sleep(5);
        BrowserUtils.clickWithJS(filesPage.targetFileNameConfirmButton);


    }

    @Then("user is in the new folder")
    public void user_is_in_the_new_folder() {
        BrowserUtils.sleep(5);

        Assert.assertTrue(filesPage.targetFileNewFolder.isDisplayed());
    }

    @When("user click move button")
    public void user_click_move_button() {
        filesPage.moveButtonNewFile.click();
        BrowserUtils.sleep(10);
    }

    @Then("the selected item should  move from its original location")
    public void the_selected_item_should_move_from_its_original_location() {

        BrowserUtils.sleep(10);
       boolean fileIsRemoved = false;


        List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }
        if (!fileNames.contains("Talk")) {
           fileIsRemoved = true;
        }


            Assert.assertTrue(fileIsRemoved);


    }


    @Then("a new folder created and appear in the files page")
    public void a_new_folder_created_and_appear_in_the_files_page() {
       Driver.getDriver().navigate().refresh();


        BrowserUtils.sleep(10);
        boolean fileIsRemoved = false;


        List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }
        Assert.assertTrue(fileNames.contains("aaa"));






    }

    @Then("the selected item should appear in the new folder")
    public void the_selected_item_should_appear_in_the_new_folder() {


       // Driver.getDriver().navigate().refresh();
        filesPage.secondRow.click();
        BrowserUtils.sleep(10);


        List<WebElement> tableNames = filesPage.tableElements;

        List<String> fileNames = new ArrayList<>();

        for (WebElement name :  tableNames ){
            fileNames.add(name.getText());

        }
        BrowserUtils.sleep(10);
        Assert.assertTrue(fileNames.contains("Talk"));

    }
     //____________________________________________________________copy new folder

    @When("user click copy button")
    public void user_click_copy_button() {
        BrowserUtils.sleep(5);
        filesPage.newFileCopyButton.click();


    }


}
