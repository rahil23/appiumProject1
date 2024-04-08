import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BaseClass {
    AppiumDriver<MobileElement> driver = null;
    public void launchApp() {


        DesiredCapabilities cap = new DesiredCapabilities();
/*cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
cap.setCapability(MobileCapabilityType.DEVICE_NAME,"");
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomation");
cap.setCapability(MobileCapabilityType.APP,"<Path of app>");*/

        cap.setCapability("deviceName", "Oneplus");
        cap.setCapability("udid", "192.168.1.15:5555");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "14");
        cap.setCapability("appWaitForLaunch ", "true");
        // cap.setCapability(MobileCapabilityType.,"5162e92");
        /*cap.setCapability("appPackage","com.lambdatest.proverbial");
        cap.setCapability("appActivity","com.lambdatest.proverbial.MainActivity");*/
        cap.setCapability("appPackage", "in.redbus.android");
        cap.setCapability("appActivity", "in.redbus.android.root.SplashScreen");
        cap.setCapability("ignoreHiddenApiPolicyError", true);







        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cap);
        }
        catch(MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}