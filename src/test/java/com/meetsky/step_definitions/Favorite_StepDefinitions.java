package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class Favorite_StepDefinitions {
    FilesPage filesPage = new FilesPage();
    @And("the user clicks add favorite button")
    public void theUserClicksAddFavoriteButton() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(filesPage.addToFavoritesButton).click().perform();
      //  BrowserUtils.clickWithJS(filesPage.addToFavoritesButton);
        // filesPage.addToFavoritesButton.click();


    }

    @And("the user select favorites file")
    public void theUserSelectFavoritesFile() {

        filesPage.favoritesFile.click();

    }


    @Then("the selected item should be appears in the favorites file")
    public void theSelectedItemShouldBeAppearsInTheFavoritesFile() {



    }
}
