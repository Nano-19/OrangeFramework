package pom;

import Configs.SeleniumHub;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GridSearchPOM extends SeleniumHub {

    public GridSearchPOM() {
        super();
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "consent_prompt_submit")
    public WebElement orangeCookies;

    public void searchWebPage(String webUrl) {
        if (webUrl.contains("GooGleWebPage")) {
            driver.get("https://www.google.com");
        } else if (webUrl.contains("OrangeWebPage")) {
            driver.get("https://www.orange.es/");
            orangeCookies.click();
        }
    }
}
