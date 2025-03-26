package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase extends AbstractTestNGCucumberTests {

    public static AppiumDriver driver;

    public static void AndroidSetup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:platformVersion", "11.0");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:deviceName", "Android Emulator");
        caps.setCapability("appium:app", "C:\\Users\\caina\\OneDrive\\Desktop\\Appium\\Appium-Advanced\\apps\\ToDo_1.24_APKPure.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    public static void IOSSetup () throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium:platformName", "iOS");
        caps.setCapability("appium:platformVersion", "14.2");
        caps.setCapability("appium:deviceName", "Iphone 12");
        caps.setCapability("appium:app", "C:\\Users\\caina\\OneDrive\\Desktop\\Appium\\Appium-Advanced\\apps\\ToDo_1.24_APKPure.apk");

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    public static void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
