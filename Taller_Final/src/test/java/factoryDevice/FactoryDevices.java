package factoryDevice;

import static factoryDevice.FactoryDevices.DeviceType.CLOUD;

public class FactoryDevices {


    public enum DeviceType {
        ANDROID,
        IOS,
        WINDOWS_PHONE,
        CLOUD
    }

    public static IDevice make(DeviceType deviceType){
        IDevice device;
        switch (deviceType){

            case ANDROID :
                device = new Android();
                break;
            case IOS:
                device = new Ios();
                break;
            case WINDOWS_PHONE:
                device = new WindowPhone();
                break;
            case CLOUD:
                device = new AndroidCloud();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }
}
