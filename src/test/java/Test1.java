
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class Test1 {

    @Test
    public void launchMOb() {
        DesiredCapabilities cap = new DesiredCapabilities();
/*cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
cap.setCapability(MobileCapabilityType.DEVICE_NAME,"");
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomation");
cap.setCapability(MobileCapabilityType.APP,"<Path of app>");*/

        cap.setCapability("deviceName","Oneplus");
        cap.setCapability("udid","192.168.1.15:5555");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","14");
        cap.setCapability("appWaitForLaunch ","true");
       // cap.setCapability(MobileCapabilityType.,"5162e92");
        /*cap.setCapability("appPackage","com.lambdatest.proverbial");
        cap.setCapability("appActivity","com.lambdatest.proverbial.MainActivity");*/
        cap.setCapability("appPackage","in.redbus.android");
        cap.setCapability("appActivity","in.redbus.android.root.SplashScreen");
        cap.setCapability("ignoreHiddenApiPolicyError",true);



        AppiumDriver<MobileElement> driver = null;

        try
        {
            driver  = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"),cap);
            /*driver.findElement(By.id("com.lambdatest.proverbial:id/geoLocation")).click();
            boolean isFindVisible = driver.findElement(By.id("com.lambdatest.proverbial:id/find")).isDisplayed();


            Assert.assertEquals(isFindVisible,true);*/

           //WebElement ele =  driver.findElement(By.id("2"));

            driver.findElement(By.xpath("\t\n" +
                    "(//android.widget.RadioButton[@resource-id=\"in.redbus.android:id/country_radio\"])[2]")).click();

            //driver.findElement(By.id("in.redbus.android:id/continueButton")).click();

            driver.findElementById("in.redbus.android:id/continueButton").click();
            driver.findElementById("in.redbus.android.onBoardingModule:id/login").click();
            driver.findElementByXPath("\t\n" +
                    "(//android.widget.EditText[@resource-id=\"in.redbus.android.authmodule:id/editPhoneNo\"])[2]").click();

            driver.findElementByXPath("\t\n" +
                    "(//android.widget.EditText[@resource-id=\"in.redbus.android.authmodule:id/editPhoneNo\"])[2]").sendKeys("8095294971");

            Thread.sleep(3000);
            driver.findElementByXPath("(//android.widget.TextView[@resource-id=\"in.redbus.android.authmodule:id/loginButtonSms\"])[2]").click();
               Thread.sleep(3000);
               driver.findElementById("\t\n" +
                       "in.redbus.android.authmodule:id/buttonSkip").click();
               driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();

               driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]\n")).click();
               driver.findElement(By.xpath("\t\n" +
                       "\t\n" +
                       "//android.widget.TextView[@text=\"Search Boarding Point\"]")).sendKeys("Bangalore");
               driver.findElement(By.xpath("//android.widget.TextView[@text=\"Marathahalli, Bangalore\"]")).click();
               driver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")).click();

               driver.findElement(By.xpath("//android.widget.TextView[@text=\"Search Dropping Point\"]")).click();
            driver.findElement(By.xpath("//android.widget.TextView[@text=\"Search Dropping Point\"]")).sendKeys("hyderabad");
driver.findElement(By.xpath("//android.widget.TextView[@text=\"Miyapur, Hyderabad\"]")).click();
        }
        catch(MalformedURLException | InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}