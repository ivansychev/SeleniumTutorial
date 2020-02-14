package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import resources.Driver;

public class Hook {

    @Before
    public static void setup() {
        ChromeOptions driverOptions = new ChromeOptions();
        driverOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        Driver.webDriver = new ChromeDriver(driverOptions);

        Driver.webDriver.manage().window().maximize();
    }

    @After
    public static void closeBrowser() {
        Driver.webDriver.quit();
    }
}
