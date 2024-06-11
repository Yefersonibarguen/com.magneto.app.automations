package com.co.magnetoApp.tasks;

import com.co.magnetoApp.models.UsersData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Random;

import static com.co.magnetoApp.userinterfaces.LogInFace.BUTTON_SKIP;
import static com.co.magnetoApp.userinterfaces.LogInFace.INPUT_EMAIL;
import static com.co.magnetoApp.userinterfaces.RegisterFace.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Register implements Task {
    private int code;
    private Random random = new Random();

    private  UsersData usersData;

    public Register(UsersData usersData) {this.usersData = usersData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        code = this.random.nextInt(9999) + 1;
        actor.attemptsTo(
                WaitUntil.the(BUTTON_SKIP, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_SKIP),
                Click.on(BUTTON_REGISTER),
                Click.on(INPUT_EMAIL),
                SendKeys.of("correo"+code+"@correo.com").into(INPUT_EMAIL),
                WaitUntil.the(GO_BUTTON, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(GO_BUTTON),
                Click.on(NEXT_ALERT),
                WaitUntil.the(INPUT_NAME, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(INPUT_NAME),
                SendKeys.of("yeferson").into(INPUT_NAME),
                Click.on(INPUT_LASTNAME),
                SendKeys.of("Ibarguen").into(INPUT_LASTNAME),
                Click.on(NEXT_ALERT),
                WaitUntil.the(INPUT_CITY, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(INPUT_CITY),
                SendKeys.of("Medellin, Antioquia, Colombia ").into(INPUT_CITY),
                Click.on(CLICK_CITY),
                Click.on(INPUT_DAY_BIRTH),
                Click.on(CLICK_DAY_BIRTH),
                Click.on(NEXT_ALERT),
                WaitUntil.the(MALE_GENDER, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(MALE_GENDER),
                Click.on(NEXT_ALERT),
                Click.on(NOT_STUDIES),
                Click.on(NEXT_ALERT),
                Click.on(CATEGORY_ADMON),
                Click.on(CATEGORY_LOGISTICS),
                Click.on(CATEGORY_CALL),
                Click.on(NEXT_ALERT),
                Click.on(AVAILABILITY_COMPLETE),
                Click.on(NEXT_ALERT),
                Click.on(INPUT_WAGE_ASPIRATION),
                SendKeys.of("1000000").into(INPUT_WAGE_ASPIRATION),
                Click.on(SALARY_PERIODICITY_MONTHLY),
                Click.on(NEXT_ALERT),
                Click.on(INPUT_CITY_CURRENT),
                SendKeys.of("Medellin, Antioquia, Colombia ").into(INPUT_CITY_CURRENT),
                Click.on(CLICK_CITY_CURRENT),
                Click.on(NEXT_ALERT),
                Click.on(IDENTITY),
                Click.on(CITIZENSHIP_CARD),
                Click.on(INPUT_NUMBER_CITIZENSHIP),
                SendKeys.of("123456").into(INPUT_NUMBER_CITIZENSHIP),
                Click.on(NEXT_ALERT),
                Click.on(INPUT_PHONE),
                SendKeys.of("3162653068").into(INPUT_PHONE)





                );
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static Register registerApp(UsersData usersData) { return Tasks.instrumented(Register.class, usersData);
    }
}
