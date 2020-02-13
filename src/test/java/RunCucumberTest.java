import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"usage"},
        monochrome = true,
        glue = { "stepdefs", "hooks" },
        features = "src/test/java/features",
        strict = true,
        tags = "@OpenDBO"
)
public class RunCucumberTest {
    @BeforeClass
    public static void setup() {
        System.out.println("LOG: init chrome web driver.");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/webdrivers/chromedriver");
    }
}