package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.aspectj.lang.reflect.DeclareSoft;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class TestBase {
    public AndroidDriver mobileDriver ;
    public String appiumServer="127.0.0.1";
    public int appiumPort = 4723;
    URL appiumUrl = null;
    public static Properties prop;

    public TestBase() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com"
                    + "qa/config/Or.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public AndroidDriver initializeDriver()
    {
        try
        {
            appiumUrl = new URL("http://"+appiumServer+":"+appiumPort+"/wd/hub");
            this.mobileDriver = new AndroidDriver(appiumUrl,setAppCapabilitiesAndroid());

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return mobileDriver;
    }


    public DesiredCapabilities setAppCapabilitiesAndroid()
    {
        DesiredCapabilities cap = new DesiredCapabilities();
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
      return cap;
    }

    public String takeScreenShot(String testCaseName, AndroidDriver mobileDriver) throws IOException {
        TakesScreenshot sc = (TakesScreenshot) mobileDriver;
        File source = sc.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"/Reports/"+testCaseName+".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;
    }
}
