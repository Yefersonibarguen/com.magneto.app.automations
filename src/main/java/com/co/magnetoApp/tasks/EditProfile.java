package com.co.magnetoApp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.magnetoApp.userinterfaces.EditUserInterfaces.*;
import static com.co.magnetoApp.userinterfaces.LogInFace.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EditProfile implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PROFILE),
                WaitUntil.the(WHO_ARE_YOU, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(WHO_ARE_YOU),
                Click.on(BACK),
                Click.on(EXPERIENCE),
                Click.on(BACK),
                Click.on(SALARY),
                Click.on(BACK),
                Click.on(BIRTHDATE),
                Click.on(BACK)



        );
    }
    public static EditProfile dataProfile(){
        return instrumented(EditProfile.class);
    }

}
