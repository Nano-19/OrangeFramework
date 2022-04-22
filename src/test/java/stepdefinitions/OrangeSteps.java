package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.OrangePOM;

public class OrangeSteps  {

    OrangePOM orangePOM = new OrangePOM();

    @When("I click in {string} Dropdown")
    public void dropDownSelector(String dropDownSelector){
        orangePOM.openDropDown();
        orangePOM.clickOnIndividuals(dropDownSelector);
    }

    @Then("Click in the clients area")
    public void clickInTheClientsArea() {
        orangePOM.clientAreaClick();
    }

    @Then("I check if I am in the principal page and the {string} text appears")
    public void checkIfLogoAppears(String orangeTitle) {
        Assert.assertEquals(orangeTitle, orangePOM.getOrangeTitle());
    }


    @And("Try Login with a no register user {string} {string}")
    public void tryLogin(String user, String pass){
        orangePOM.enterUserAndPassword(user,pass);
        orangePOM.clickEnterButton();
    }
    @Then("Error {string} appears")
    public void i_have_google_search_url(String webUrl){
        Assert.assertEquals(webUrl, orangePOM.checkIncorrectLoginMessage());
    }

}
