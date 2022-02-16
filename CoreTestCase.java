package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.time.Duration;

import static java.time.Duration.*;


public class CoreTestCase extends TestCase {
    protected AppiumDriver driver;
    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";
    protected Logger logger = LoggerFactory.getLogger(CoreTestCase.class);

    @Override

    protected void setUp() throws Exception {
        super.setUp();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "kz.gamma.testsip");
        capabilities.setCapability("appActivity", "kz.gamma.VTalk.activities.ui.login.LoginActivity");
        capabilities.setCapability("app", "C:\\Users\\g_kuatkhan\\Desktop\\KM avtotest\\apks\\32-CryptoMessage-gammaTest-debug-1.0.32.apk");
        driver = new AndroidDriver(new URL(AppiumURL), capabilities);
      //  this.rotateScreenPortrait();
    }
    @Override
    protected void tearDown() throws Exception {
        logger.info("driver quit");
        driver.quit();
        super.tearDown();
    }

   // protected void rotateScreenPortrait() {
      //  driver.rotate(ScreenOrientation.PORTRAIT);
   // }

    //protected void rotateScreenLandscape() {
       // driver.rotate(ScreenOrientation.LANDSCAPE);
    }

   /* protected void backgroundApp(long seconds) {
        driver.runAppInBackground(ofSeconds(seconds));
    }*/


//}



