import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class DeviceCommands extends BaseClass {

    @Test
    public void launchDeviceApp()
    {
        launchApp();
        KeyEvent eve = new KeyEvent(AndroidKey.HOME);
        AndroidElement ele  = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Villas\")"));
        int x=ele.getLocation().x;
        int y = ele.getLocation().y;
        TouchAction act = new TouchAction(driver);
        act.tap(PointOption.point(x,y)).perform();


        //MobileElement s = driver.findElementByXPath("xpath");
        MobileElement s = driver.findElement(MobileBy.className("asv"));
        int x1 = s.getLocation().x;
        TouchAction act2 = new TouchAction(driver);
        act2.tap(PointOption.point(x1,y)).perform();


    }
}
