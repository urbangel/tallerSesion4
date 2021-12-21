package session;

import control.ControlAppium;
import factoryDevice.FactoryDevices;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.net.MalformedURLException;
import java.time.Duration;

public class Session {
    private static Session session = null;
    private AppiumDriver driver;

    private Session() throws MalformedURLException {
        driver= FactoryDevices.make(FactoryDevices.DeviceType.ANDROID).create();
    }

    public static Session getSession() throws MalformedURLException {
        if (session == null){
            session = new Session();
        }
        return session;
    }

    public void closeSession(){
        driver.quit();
        session=null;
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    public void swipe (ControlAppium control1, ControlAppium control2) throws MalformedURLException {
        TouchAction touchActions = new TouchAction(driver);

        int firstX = control1.getControl().getLocation().getX();
        int firstY = control1.getControl().getLocation().getY();
        int secondX= control2.getControl().getLocation().getX();
        int secondY= control2.getControl().getLocation().getY();

        touchActions.press(PointOption.point(firstX,firstY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(secondX,secondY))
                .release().perform();
    }

}

