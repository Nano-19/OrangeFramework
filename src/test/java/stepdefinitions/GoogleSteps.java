package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.GooglePOM;
import utils.PropertyLoader;

public class GoogleSteps  {

//    GooglePOM googlePOM = new GooglePOM();
    GooglePOM googlePOM = new GooglePOM();

//    @Given("I am in the {string}")
//    public void i_have_google_search_url(String webUrl){
//        googlePOM.searchWebPage(webUrl);
//    }
    private static PropertyLoader loadproperty = new PropertyLoader();

    @Given("I am in the {string}")
    public void checkWeb(String webUrl){
        googlePOM.searchWebPage(loadproperty.loadProperties().getProperty(webUrl));
    }

    @When("I search {string} Web page")
        public void searchPage (String url) {
            googlePOM.searchOrangePage(url);
        }

    @And("Enter in the Orange Url")
    public void enterOrangeUrl () {
        googlePOM.selectOrangePrincipalPage();
    }

}