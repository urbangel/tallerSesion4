package factoryDevice;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevice{
    private AppiumDriver driver;
    @Override
    public AppiumDriver create() throws MalformedURLException {
        //ingresar capabilities del json generado en appium inspector
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:deviceName", "SM-G975F");
        capabilities.setCapability("appium:platformVersion", "11");
        capabilities.setCapability("appium:appPackage", "com.vrproductiveapps.whendo");
        capabilities.setCapability("appium:appActivity", "com.vrproductiveapps.whendo.ui.HomeActivity");

        capabilities.setCapability("platformName", "Android");
        //poner la ruta del appium server, lo puedes sacar del inspector
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        // implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Ejecucion iniciada");
        return driver;
    }



}
