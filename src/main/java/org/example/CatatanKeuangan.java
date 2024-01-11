package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CatatanKeuangan {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        Perintah perintah = new Perintah();
        dc.setCapability("deviceName", "Pixel 2 API 30");
        dc.setCapability("udid", "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", "true");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, dc);
        perintah.delay(5);
//        MobileElement el1 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/fabMenu");
//        el1.click();
//        MobileElement el4 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/ibCalc");
//        el4.click();
//        MobileElement el5 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_13");
//        el5.click();
//        MobileElement el6 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_22");
//        el6.click();
//        el6.click();
//        MobileElement el7 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_24");
//        el7.click();
//        el7.sendKeys("Makan Seblak");
//        MobileElement el1 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/fabMenu");
//        el1.click();
//        MobileElement el2 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/tvName");
//        el2.click();
//        MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView");
//        el3.click();
//        MobileElement el4 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/ibCalc");
//        el4.click();
//        MobileElement el5 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_13");
//        el5.click();
//        MobileElement el6 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_24");
//        el6.click();
//        el6.click();
//        el6.click();
//        el6.click();
//        el6.click();
//        MobileElement el7 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/calc_btn_ok");
//        el7.click();
//        MobileElement el8 = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btSave");
//        el8.click();
        // konfirmasi masuk app
        String masukDes = driver.findElementById("com.chad.financialrecord:id/btDate").getText();
        System.out.println(masukDes);

        // klik tab menu
        MobileElement tamMenu = (MobileElement) driver.findElementById("com.chad.financialrecord:id/fabMenu");
        tamMenu.click();
        String txtToolbarTitle = driver.findElementByXPath("//android.widget.TextView[@resource-id='com.chad.financialrecord:id/toolbarTitle']").getText();
        // konfirmasi pindah ke halamanan tambah transaksi
        if (txtToolbarTitle.contains("Buat Transaksi")){
            System.out.println("Berhasil Pindah Transaksi");
        } else{
            System.out.println("GAGAL");
        }
        perintah.delay(3);

        // klik btn income
        MobileElement pemasukanBtn = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btnIncome");
        pemasukanBtn.click();
        perintah.delay(3);

//        MobileElement dateForm = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]");
        MobileElement dateForm = (MobileElement) driver.findElementByXPath("//android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]");
        dateForm.click();
        perintah.delay(3);

        MobileElement btnTgl = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"01 Desember 2023\"]");
        btnTgl.click();
        perintah.delay(3);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]").click();
        perintah.delay(3);

        String txtDate = dateForm.getText();
        System.out.println(txtDate);

        MobileElement kategoriBtn = (MobileElement) driver.findElementById("com.chad.financialrecord:id/spCategory");
        kategoriBtn.click();
        MobileElement gajiBtn = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView");
        gajiBtn.click();

        String txtKategori = driver.findElementById("com.chad.financialrecord:id/tvName").getText();
        System.out.println(txtKategori);

        MobileElement amount = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etAmount");
        amount.click();
        amount.sendKeys("8000000");
        perintah.delay(3);

        MobileElement keteranganForm = (MobileElement) driver.findElementById("com.chad.financialrecord:id/etNote");
        keteranganForm.sendKeys("Gaji Bulanan Utama");
        perintah.delay(5);

        MobileElement saveBtn = (MobileElement) driver.findElementById("com.chad.financialrecord:id/btSave");
        saveBtn.click();

//        MobileElement daftarList = (MobileElement) driver.findElementById("com.chad.financialrecord:id/elTransaction");
//        String txtDaftarList = daftarList.getText();
//        if (txtDaftarList.contains("8000000")){
//            System.out.println("BERHASIL");
//        } else{
//            System.out.println("GAGAL");
//        }
    }
}
