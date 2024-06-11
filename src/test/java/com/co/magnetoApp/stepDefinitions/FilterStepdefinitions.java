package com.co.magnetoApp.stepDefinitions;

import com.co.magnetoApp.models.UsersData;
import com.co.magnetoApp.tasks.Filter;
import com.co.magnetoApp.tasks.LogIn;
import com.co.magnetoApp.tasks.LoginUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FilterStepdefinitions {
    @When("^enter the categories$")
    public void enterTheCategories(List<UsersData> usersData) {
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUserInApp(usersData.get(0)));
        theActorInTheSpotlight().attemptsTo(Filter.filterCategories());



    }
    @Then("^Check the functionality of the categories$")
    public void checkTheFunctionalityOfTheCategories() {

    }
}
