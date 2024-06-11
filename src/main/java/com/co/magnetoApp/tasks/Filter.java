package com.co.magnetoApp.tasks;

import com.co.magnetoApp.utils.ScrollAction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.magnetoApp.userinterfaces.FilterFcae.*;
import static com.co.magnetoApp.userinterfaces.LogInFace.CLOSE_AD;
import static com.co.magnetoApp.userinterfaces.LogInFace.JOB;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Filter implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(JOB, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(JOB),
                WaitUntil.the(CLOSE_AD, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CLOSE_AD),
                Click.on(BUTTON_FILTER),
                Click.on(JOB_CATEGORY),
                Click.on(JOB_CATEGORY),
                Click.on(USER_ACTIONS),
                Click.on(USER_ACTIONS),
                Click.on(LOCATION),
                Click.on(LOCATION),
                Click.on(SALARY),
                Click.on(SALARY),
                Click.on(EXPERIENCE),
                Click.on(EXPERIENCE),
                Click.on(APPLICATION_DATE),
                Click.on(APPLICATION_DATE),
                Click.on(CONTRACT_TYPE),
                Click.on(CONTRACT_TYPE)
                );

    }

    public static Filter filterCategories(){
        return instrumented(Filter.class);
    }

}
