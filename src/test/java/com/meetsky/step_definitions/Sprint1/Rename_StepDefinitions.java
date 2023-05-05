package com.meetsky.step_definitions.Sprint1;

import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

import java.sql.DatabaseMetaData;

public class Rename_StepDefinitions {
    //havva
    FilesPage filesPage = new FilesPage();

    @When("the user clicks rename button")
    public void the_user_clicks_rename_button() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(filesPage.renameButton,"NewFile").perform();
        //filesPage.renameButton.sendKeys("newFile");

    }
    @Then("the selected item name should be changed")
    public void the_selected_item_name_should_be_changed() {





    }
}
