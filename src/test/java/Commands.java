import org.testng.annotations.Test;

public class Commands extends BaseClass{

    @Test
    public void run()
    {
        launchApp();
        driver.closeApp();;
        driver.launchApp();
        driver.activateApp("com.google.android.apps.messaging");



    }
}
