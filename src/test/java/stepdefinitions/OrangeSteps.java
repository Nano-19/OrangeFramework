package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pom.OrangePOM;
import utils.PropertyLoader;

public class OrangeSteps  {

    OrangePOM orangePOM = new OrangePOM();
    private static PropertyLoader loadproperty = new PropertyLoader();

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
    public void checkIfLogoAppears(String orangeTitle) {Assert.assertEquals(orangeTitle, orangePOM.getOrangeTitle());
    }


    @And("Try Login with a {string} and {string}")
    public void tryLogin(String user, String pass){
        orangePOM.enterUserAndPassword(loadproperty.loadProperties().getProperty(user), loadproperty.loadProperties().getProperty(pass));
        orangePOM.clickEnterButton();
    }
    @Then("Error {string} appears")
    public void checkError(String errorMessage){
        Assert.assertEquals(loadproperty.loadProperties().getProperty(errorMessage), orangePOM.checkIncorrectLoginMessage());
    }

    @When("I click in fares Button")
    public void iClickInButton() {
        orangePOM.clickFareBtn();
    }

    @Then("I select mobile fare")
    public void iSelectMobileFare() {
        orangePOM.clickInMobileBtn();
    }

    @And("The first fare has a {int} € price")
    public void theFirstFareHasAPrice(int price) {
        Assert.assertEquals(price, orangePOM.getTotalPrice());
    }
}
