package configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;

public class BaseDriverLocal {

    @Value("${spring.datasource.username}")
    String username;

    public static WebDriver driver;
    public static String chromeDriverPath = "C:\\Selenium\\drivers\\chromedriver.exe";
    public BaseDriverLocal() {}

    public void DriverConfiguration() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public void TearDown() {
        if(driver != null) {
            driver.close();
        }
    }
}

