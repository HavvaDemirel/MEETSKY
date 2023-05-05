package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Commend_StepDefinition {


    FilesPage filesPage = new FilesPage();



    @And("the user clicks details button")
    public void theUserClicksDetailsButton() {
        filesPage.detailsButton.click();


    }

    @Then("the file details menu opened right side")
    public void theFileDetailsMenuOpenedRightSide() {
        Assert.assertTrue(filesPage.sideBarTitle.isDisplayed());

    }

    @When("the user clicks commend button")
    public void theUserClicksCommendButton() {
        filesPage.commendButton.click();

    }

    @And("user adds any commend")
    public void userAddsAnyCommend() {
        filesPage.commendInputBox.clear();
        filesPage.commendInputBox.sendKeys("Well Done");

    }

    @And("the user clicks on the post comment button")
    public void theUserClicksOnThePostCommentButton() {
        filesPage.submitButton.click();
    }

    @Then("the comment should be added to the file")
    public void theCommentShouldBeAddedToTheFile() {
        String commend = "Well Done";

        boolean commendMessageAdded = Driver.getDriver().findElement(By.xpath("//div[.='"+commend+"']")).isDisplayed();

        Assert.assertTrue(commendMessageAdded);



    }

    @And("the user clicks three dots menu on the commend")
    public void theUserClicksThreeDotsMenuOnTheCommend() {
        filesPage.threeDots.click();

    }

    @And("the user clicks delete commend button")
    public void theUserClicksDeleteCommendButton() {

      /*  BrowserUtils.clickWithJS(filesPage.sideBarDeleteButton);*/
        BrowserUtils.sleep(3);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(filesPage.sideBarDeleteButton).click().perform();
    }

    @Then("user see comment deleted message")
    public void userSeeCommentDeletedMessage() {
        Assert.assertTrue(filesPage.sideBarDeletedMessage.isDisplayed());

    }

}
