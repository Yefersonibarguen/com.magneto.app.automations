package com.co.magnetoApp.stepDefinitions;

import com.co.magnetoApp.models.UsersData;
import com.co.magnetoApp.tasks.LogIn;
import com.co.magnetoApp.tasks.Register;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepdefinitions {

    @When("^enter the registry and enter the data$")
    public void enterTheRegistryAndEnterTheData(List<UsersData> usersData) {
        theActorInTheSpotlight().attemptsTo(Register.registerApp(usersData.get(0)));
    }

    @Then("^verify that the registration allows you to advance to the request for the telephone number$")
    public void verifyThatTheRegistrationAllowsYouToAdvanceToTheRequestForTheTelephoneNumber() {

    }
}
