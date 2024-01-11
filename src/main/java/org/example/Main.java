package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Pixel 2 API 30");
        dc.setCapability("udid", "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.google.android.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("6");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("9");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("9");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("6");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        el6.click();
        MobileElement layar = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
        System.out.println(layar.getText());


    }
}