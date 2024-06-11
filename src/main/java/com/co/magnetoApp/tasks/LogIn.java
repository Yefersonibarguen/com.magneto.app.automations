package com.co.magnetoApp.tasks;

import com.co.magnetoApp.models.UsersData;
import com.co.magnetoApp.utils.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static com.co.magnetoApp.userinterfaces.LogInFace.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogIn implements Task {

    private  UsersData usersData;

    public LogIn(UsersData usersData) {
        this.usersData = usersData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                WaitUntil.the(BUTTON_SKIP, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_SKIP),
                Click.on(INPUT_EMAIL),
                SendKeys.of(usersData.getEmail()).into(INPUT_EMAIL),
                Click.on(BUTTON_LOGIN),
                WaitUntil.the(JOB, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(JOB),
                WaitUntil.the(CLOSE_AD, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CLOSE_AD),
                Click.on(VACANT),
                Click.on(RETURN),
                Click.on(PROCESSES),
                Click.on(INACTIVE),
                Click.on(MESSAGE),
                Click.on(PROFILE),
                Click.on(FURTHER)
                //Click.on(SIGN_OFF)
        );
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("prueba");

    }
    public static LogIn logInApp(UsersData usersData) { return Tasks.instrumented(LogIn.class, usersData);
    }
}
