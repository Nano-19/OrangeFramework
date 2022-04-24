
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        publish = true,
        plugin = {"pretty", "json:target/cucumber-reports/CucumberReport.json",
                "junit:target/cucumber-reports/CucumberReport.xml",
                "html:target/cucumber-reports/cucumber-reports.html"})
public class RunCucumberTest {
}