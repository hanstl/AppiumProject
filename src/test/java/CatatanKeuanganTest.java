package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CatatanKeuanganTest {
    private AndroidDriver driver;
    Perintah perintah = new Perintah();

    public void setUp() throws MalformedURLException{
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Pixel 2 API 30");
        dc.setCapability("udid", "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        perintah.delay(5);
    }
    @Test(priority = 1)
    public void pemasukan(){
        MobileElement tamMenu = (MobileElement) driver.findElementById("com.chad.financialrecord:id/fabMenu");
        tamMenu.click();
        perintah.delay(5);

        MobileElement pemasukanBtn = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btnIncome");
        pemasukanBtn.click();
        perintah.delay(5);

        MobileElement dateFrom = (MobileElement) driver.findElementById("com.chad.financialrecord:id/tvDate");
        String output1 = dateFrom.getText();
        perintah.delay(5);




    }
}
