package pom;

import configs.SeleniumHub;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrangePOM extends SeleniumHub {

    public OrangePOM() {
        super();
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

    @FindBy(xpath = "*//div[@class='header-orange-rebrand2022-client-container']")
    private WebElement dropDownBtn;


    @FindBy(xpath = "*//a[@title='Particulares']" )
    private WebElement individualsSelection;

    @FindBy(xpath = "*//li[@class='header-orange-rebrand2022-list-useroptions-item header-orange-rebrand2022-list-useroptions-item-featured']")
    private WebElement clientArea;

    @FindBy(id = "pro" )
    private WebElement user;

    @FindBy(id = "inputPassword" )
    private WebElement password;

    @FindBy(id = "authBoxLogin_btn_Cliente_Entrar_8" )
    private WebElement enterBtn;

    @FindBy(xpath = "//a[@title='Orange España']" )
    private WebElement orangeTitle;

    @FindBy(xpath = "//span[@class='panel-image ng-binding']" )
    private WebElement incorrectLoginMessage;

    @FindBy(xpath = "*//a[@title='Tarifas']" )
    private WebElement faresButton;

    @FindBy(xpath = "*//a[@title='Encuentra tu tarifa Solo Móvil']")
    private WebElement mobileButton;

    @FindBy(id = "precioTarifa")
    private WebElement farePrice;


    public void openDropDown(){
        dropDownBtn.click();
    }

    public void clickOnIndividuals(String dropDownSelect){
        if (dropDownSelect.contains("Particulares")){
            individualsSelection.click();
        }
    }

    public void clientAreaClick(){
        wait.until(ExpectedConditions.visibilityOf(clientArea)).click();
    }

    public void enterUserAndPassword(String userParam, String passwordParam){
        wait.until(ExpectedConditions.visibilityOf(user)).sendKeys(userParam);
        password.sendKeys(passwordParam);
    }

    public void clickEnterButton() {
        enterBtn.click();
    }

    public String getOrangeTitle(){
        return wait.until(ExpectedConditions.visibilityOf(orangeTitle)).getText();
    }

    public String checkIncorrectLoginMessage() {
        return wait.until(ExpectedConditions.visibilityOf(incorrectLoginMessage)).getText();
    }

    public void clickFareBtn(){
        wait.until(ExpectedConditions.visibilityOf(faresButton)).click();
    }

    public void clickInMobileBtn(){
        wait.until(ExpectedConditions.visibilityOf(mobileButton)).click();
    }

    public int getTotalPrice(){
        return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(farePrice)).getText());
    }
}
