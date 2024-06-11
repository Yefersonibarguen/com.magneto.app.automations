package com.co.magnetoApp.stepDefinitions;

import com.co.magnetoApp.models.UsersData;
import com.co.magnetoApp.tasks.LogIn;
import com.co.magnetoApp.tasks.LoginUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserStepdefinitions {

    @When("^enter authentication email$")
    public void enterAuthenticationEmail(List<UsersData> usersData) {
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUserInApp(usersData.get(0)));
    }
    @Then("^verify correct login$")
    public void verifyCorrectLogin() {

    }

}