package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPageElements;
import pages.UserManagementPage;
import utilities.Driver;

public class NewUserStepDef {
    CommonPageElements commonPageElements = new CommonPageElements();
    UserManagementPage userManagementPage = new UserManagementPage();

    @Given("user clicks on the administration")
    public void user_clicks_on_the_administration() {
        Driver.waitAndClick(commonPageElements.administrationDropdown);
    }
    @Given("user clicks on the user management")
    public void user_clicks_on_the_user_management() {
        Driver.waitAndClick(commonPageElements.userManagementButton);
    }
    @Given("user clicks on create a new user button")
    public void user_clicks_on_create_a_new_user_button() {
        Driver.waitAndClick(userManagementPage.createNewUserButton);
    }
    @Given("user provides login as {string}")
    public void user_provides_login_as(String string) {
        Driver.waitAndSendText(userManagementPage.loginId,string);
    }
    @Given("user enters firstname as {string}")
    public void user_enters_firstname_as(String string) {
        Driver.waitAndSendText(userManagementPage.firstName,string);
    }
    @Given("user enters lastname as {string}")
    public void user_enters_lastname_as(String string) {
        Driver.waitAndSendText(userManagementPage.lastName,string);
    }
    @Given("user provides email address {string}")
    public void user_provides_email_address(String string) {
        Driver.waitAndSendText(userManagementPage.email,string);
    }
    @Given("user selects language as {string}")
    public void user_selects_language_as(String string) {
       Driver.selectByVisibleText(userManagementPage.language,string);
    }

    @Given("user selects profile on dropdown {string}")
    public void user_selects_profile_on_dropdown(String string) {
        Driver.selectByVisibleText(userManagementPage.profiles,string);
    }
    @Given("user clicks on save button")
    public void user_clicks_on_save_button() {
        Driver.waitAndClick(userManagementPage.saveButton);
    }
    @Then("verify the new user creation is successful")
    public void verify_the_new_user_creation_is_successful() {
        Driver.wait(1);
        Assert.assertTrue(userManagementPage.successMessage.isDisplayed());
    }
}
