package pom;

import configs.SeleniumHub;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GooglePOM extends SeleniumHub {

    public GooglePOM() {
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
        if (webUrl.contains("google")) {
            driver.get(webUrl);
        } else if (webUrl.contains("orange")) {
            driver.get(webUrl);
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
