package com.meetsky.step_definitions;

import com.github.javafaker.Faker;
import com.meetsky.pages.FilesPage;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NewFolder_StepDefiniton {


        LoginPage loginPage = new LoginPage();
        FilesPage filesPage = new FilesPage();
   Faker faker = new Faker();
   // String fileName = "1";


        @Given("the user is on the dashboard page")
        public void the_user_is_on_the_dashboard_page() {

            Driver.getDriver().get("https://qa.meetsky.net/index.php/login?clear=1");

            loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.username"));

            loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetsky.password"));

            loginPage.loginButton.click();

            Driver.getDriver().getTitle().equals(ConfigurationReader.getProperty("expected.title"));
        }
        @When("the user click on the files button")
        public void the_user_click_on_the_files_button() {

           filesPage.filesButton.click();
        }

       @When("the user clicks the + icon")
        public void the_user_clicks_the_icon() {
           String firstRow = filesPage.firstRow.getText();
            filesPage.plusIcon.click();
        }
        @When("user see new file section on the dropdown")
        public void user_see_new_file_section_on_the_dropdown() {
            BrowserUtils.sleep(2);
         Assert.assertTrue(filesPage.newFolderButton.isDisplayed());
        }
        @When("user clicks new file")
        public void user_clicks_new_file() {
            filesPage.newFolderButton.click();
        }
        @When("the user enters a name  for the new folder")
        public void the_user_enters_a_name_for_the_new_folder() {
           BrowserUtils.sleep(2);
           filesPage.newFolderButtonName.sendKeys(ConfigurationReader.getProperty("new.file.name"));
            BrowserUtils.sleep(5);


        }
        @When("the user clicks the arrow icon to create the folder")
        public void the_user_clicks_the_arrow_icon_to_create_the_folder() {
           filesPage.uploadFolderNameConfirm.click();


        }
        @Then("the new folder should be created successfully")
        public void the_new_folder_should_be_created_successfully() {

            BrowserUtils.sleep(10);


            List<WebElement> tableNames = filesPage.tableElements;

            List<String> fileNames = new ArrayList<>();

           for (WebElement name :  tableNames ){
               fileNames.add(name.getText());

           }


           Assert.assertTrue(fileNames.contains(ConfigurationReader.getProperty("new.file.name")));


        }



//__________________________________________________________________________________________________________errorMessage
        @When("the user has already created a folder with name TestFolder")
        public void the_user_has_already_created_a_folder_with_name_test_folder() {



            filesPage.plusIcon.click();
            filesPage.newFolderButton.click();
            BrowserUtils.sleep(5);
           filesPage.newFolderButtonName.sendKeys(ConfigurationReader.getProperty("test.folder.name"));
            filesPage.uploadFolderNameConfirm.click();
            BrowserUtils.sleep(5);
        }
        @When("the user attempts to create a folder with name TestFolder")
        public void the_user_attempts_to_create_a_folder_with_name_test_folder() {
            filesPage.plusIcon.click();
            filesPage.newFolderButton.click();
            BrowserUtils.sleep(3);

            filesPage.newFolderButtonName.sendKeys(ConfigurationReader.getProperty("test.folder.name"));
            String errorMessage = filesPage.newFolderAlreadyExistMessage.getText();
            System.out.println(errorMessage);
            BrowserUtils.sleep(2);

        }
        @Then("the user should see an error message TestFolder already exists")
        public void the_user_should_see_an_error_message_test_folder_already_exists() {


           Assert.assertTrue(filesPage.newFolderAlreadyExistMessage.isDisplayed());
        }
//___________________________________________________________________________________________________________MultipleFile
        @Then("the user repeats the above steps with a different unique name for the new folder")
        public void the_user_repeats_the_above_steps_with_a_different_unique_name_for_the_new_folder() {
            BrowserUtils.sleep(2);
            filesPage.plusIcon.click();
            filesPage.newFolderButton.click();
            BrowserUtils.sleep(3);
            filesPage.newFolderButtonName.sendKeys(faker.name().firstName());
            filesPage.uploadFolderNameConfirm.click();
            BrowserUtils.sleep(5);


        }
        @Then("the second new folder should be created successfully")
        public void the_second_new_folder_should_be_created_successfully() {
            filesPage.plusIcon.click();
            BrowserUtils.sleep(3);
            filesPage.newFolderButton.click();
            BrowserUtils.sleep(3);
            filesPage.newFolderButtonName.sendKeys(faker.name().firstName());
            BrowserUtils.sleep(3);
            filesPage.uploadFolderNameConfirm.click();

        }

//_______________________________________________________________________________________________________new folder window

        @Then("user can see the page which opens on the right")
        public void user_can_see_the_page_which_opens_on_the_right() {
         Assert.assertTrue(filesPage.newFolderNewWindow.isDisplayed());

        }


}
