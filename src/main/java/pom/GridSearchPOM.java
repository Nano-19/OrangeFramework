package pom;

import Configs.SeleniumHub;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GridSearchPOM extends SeleniumHub {

    public GridSearchPOM() {
        super();
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

    @FindBy(id = "consent_prompt_submit")
    public WebElement orangeCookies;

    @FindBy(xpath = "//a[@href='https://www.orange.es/']")
    public WebElement orangeUrl;

    @FindBy(id = "L2AGLb")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@name='q']")
    public WebElement inputBox;




    public void searchWebPage(String webUrl) {
        if (webUrl.contains("GooGleWebPage")) {
            driver.get("https://www.google.com");
        } else if (webUrl.contains("OrangeWebPage")) {
            driver.get("https://www.orange.es/");
            orangeCookies.click();
        }
    }

    public void searchOrangePage(String url) {
        wait.until(ExpectedConditions.visibilityOf(acceptCookies)).click();
        inputBox.sendKeys(url);
        Actions builder = new Actions(driver);
        builder.sendKeys(Keys.ENTER).perform();
    }

    public void selectOrangePrincipalPage() {
        orangeUrl.click();
        orangeCookies.click();
    }
}
