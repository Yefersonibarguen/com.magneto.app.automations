package com.co.magnetoApp.tasks;

import com.co.magnetoApp.utils.ScrollAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToElement implements Task {
    private final ScrollAction scrollAction;

    public ScrollToElement(ScrollAction scrollAction) {
        this.scrollAction = scrollAction;
    }

    public static ScrollToElement haciaAbajo(ScrollAction scrollAction) {
        return instrumented(ScrollToElement.class, scrollAction);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        scrollAction.scrollDown();
    }
}
