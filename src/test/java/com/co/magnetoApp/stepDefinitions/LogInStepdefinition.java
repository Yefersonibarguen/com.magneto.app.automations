package com.co.magnetoApp.stepDefinitions;

import com.co.magnetoApp.models.UsersData;
import com.co.magnetoApp.tasks.LogIn;
import com.co.magnetoApp.utils.AppiumDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.net.MalformedURLException;
import java.util.List;

import static com.co.magnetoApp.userinterfaces.LogInFace.BUTTON_SKIP;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LogInStepdefinition {


@Given("^that I as a user wish to open the app$")
public void thatIAsAUserWishToOpenTheApp() throws MalformedURLException {
    OnStage.setTheStage(Cast.ofStandardActors());
    OnStage.theActorCalled("Tso");
    theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.app()));

}

@When("^i enter my email$")
public void iEnterMyEmail(List<UsersData> usersData) {
    theActorInTheSpotlight().attemptsTo(LogIn.logInApp(usersData.get(0)));

}

@Then("^the user enters the home of the App$")
public void theUserEntersTheHomeOfTheApp() {

}

}
