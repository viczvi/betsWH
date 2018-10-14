package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest extends TestNG {
//The  benefit of having this abstract layer is to hide from user some technical actions, like browser driver
//initialization and teardown.
//
//If you want to specify which browser to use, run the test with 'browser' parameter, like this:
//-Dbrowser="Nexus7"
//Available parameters at the moment .- Nexus7 and iPhoneX

    private String browser = System.getProperty("browser");
    private ChromeOptions chromeOptions = new ChromeOptions();
    static WebDriver webDriver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserDrivers/chromedriver.exe");

        if ("Nexus7".equals(browser)) {
            chromeOptions.setExperimentalOption("deviceName", "Nexus 7");
            webDriver = new ChromeDriver(chromeOptions);
        } else if ("iPhoneX".equals(browser)) {
            chromeOptions.setExperimentalOption("deviceName", "iPhone X");
            webDriver = new ChromeDriver(chromeOptions);
        } else {
            webDriver = new ChromeDriver();
        }
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        webDriver.close();
    }
}
