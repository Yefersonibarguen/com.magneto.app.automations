package com.co.magnetoApp.stepDefinitions;

import com.co.magnetoApp.models.UsersData;
import com.co.magnetoApp.tasks.EditProfile;
import com.co.magnetoApp.tasks.Filter;
import com.co.magnetoApp.tasks.LoginUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditStepdefinition {
    @When("^enter the profile and see all the data$")
    public void enterTheProfileAndSeeAllTheData(List<UsersData> usersData) {
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUserInApp(usersData.get(0)));
        theActorInTheSpotlight().attemptsTo(EditProfile.dataProfile());

    }

    @Then("^verify that the profile can be edited$")
    public void verifyThatTheProfileCanBeEdited() {

    }
}
