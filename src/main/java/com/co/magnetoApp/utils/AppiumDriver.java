package com.co.magnetoApp.utils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDriver {

    public static AndroidDriver app() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        //ANDROID
        caps.setCapability("deviceName","emulator-5554");
        //caps.setCapability("automationName","");
        caps.setCapability("platformName","Android");
        caps.setCapability("platformVersion","11");
        caps.setCapability("NoReset",true);
        caps.setCapability("appPackage","com.magneto365.app");
        caps.setCapability("appActivity","com.magneto365.app.MainActivity");
        caps.setCapability("unicodeKeyboard", true);
        caps.setCapability("resetKeyboard", true);
        //caps.setCapability("app","");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(
                new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.hideKeyboard();


        return driver;

    }
}
