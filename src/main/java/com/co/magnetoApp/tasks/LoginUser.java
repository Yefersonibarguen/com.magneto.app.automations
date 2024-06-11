package com.co.magnetoApp.tasks;

import com.co.magnetoApp.models.UsersData;
import com.co.magnetoApp.userinterfaces.LogInFace;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Dimension;

import java.io.IOException;

import static com.co.magnetoApp.userinterfaces.LogInFace.*;
import static com.co.magnetoApp.userinterfaces.LogInFace.JOB;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginUser implements Task {

    private UsersData usersData;

    public LoginUser(UsersData usersData) {
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
                WaitUntil.the(JOB, isVisible()).forNoMoreThan(30).seconds()
        );



    }


    public static LoginUser loginUserInApp(UsersData usersData) { return Tasks.instrumented(LoginUser.class, usersData);
    }
}
