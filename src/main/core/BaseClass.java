DesiredCapabilities cap = new DesiredCapabilities();
/*cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
cap.setCapability(MobileCapabilityType.DEVICE_NAME,"");
cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomation");
cap.setCapability(MobileCapabilityType.APP,"<Path of app>");*/

        cap.setCapability("deviceName","Oneplus");
        cap.setCapability("udid","5162e92");
        cap.setCapability("platformName","Android");
        cap.setCapability("platformVersion","14");
        cap.setCapability("appWaitForLaunch ","true");
// cap.setCapability(MobileCapabilityType.,"5162e92");
        /*cap.setCapability("appPackage","com.lambdatest.proverbial");
        cap.setCapability("appActivity","com.lambdatest.proverbial.MainActivity");*/
        cap.setCapability("appPackage","in.redbus.android");
        cap.setCapability("appActivity","in.redbus.android.root.SplashScreen");
        cap.setCapability("ignoreHiddenApiPolicyError",true);