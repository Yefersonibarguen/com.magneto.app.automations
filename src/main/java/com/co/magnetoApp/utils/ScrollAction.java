package com.co.magnetoApp.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Dimension;

import java.awt.*;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

public class ScrollAction {
    private final AppiumDriver<?> driver;

    public ScrollAction(AppiumDriver<?> driver) {
        this.driver = driver;
    }

    public void scrollDown() {
        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = (int) (size.getHeight() * 0.8);
        int endY = (int) (size.getHeight() * 0.2);

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(longPressOptions().withPosition(point(startX, startY)))
                .moveTo(point(startX, endY))
                .release()
                .perform();
    }
}
