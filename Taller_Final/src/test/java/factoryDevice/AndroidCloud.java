package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidCloud implements IDevice{
    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", "angelurbi_JYw2Ui");
        caps.setCapability("browserstack.key", "3z8PmxMjyVxn4GfBbzpg");
        caps.setCapability("app", "bs://a1126474f6d851a39b968a19a2a07f47f2093e1c");

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        caps.setCapability("project", "JBGroup Movile");
        caps.setCapability("build", "Training Nov");
        caps.setCapability("name", "Creation Task");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);
        return driver;

    }
}
