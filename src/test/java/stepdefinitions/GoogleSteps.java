package stepdefinitions;

import io.cucumber.java.en.Given;
import pom.GridSearchPOM;

public class GoogleSteps  {

//    GooglePOM googlePOM = new GooglePOM();
    GridSearchPOM gridSearchPOM = new GridSearchPOM();

//    @Given("I am in the {string}")
//    public void i_have_google_search_url(String webUrl){
//        googlePOM.searchWebPage(webUrl);
//    }

    @Given("I am in the {string}")
    public void i_have_hub_Pom(String webUrl){
        gridSearchPOM.searchWebPage(webUrl);
    }
}