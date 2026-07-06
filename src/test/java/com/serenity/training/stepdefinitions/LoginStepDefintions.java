package com.serenity.training.stepdefinitions;

import com.serenity.training.tasks.LogOut;
import com.serenity.training.tasks.Login;
import com.serenity.training.tasks.OpenLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginStepDefintions {
    private Actor User;

    @Given("the user open the login page")
    public void theUserOpenTheLoginPage(){
        // 1. Citamos el escenario "OnStage" que usará el "User" como actor
        // 2. y traemos el actor al escenario con "theActorInTheSpotlight"
        // 3. el actor intentará, "attemptsTo"
        // 4. abrir el navegador que creamos en el "tasks"
        OnStage.theActorInTheSpotlight().attemptsTo(
            OpenLoginPage.open()
        );
    }

    @When("they log in with valid credentials")
    public void theyLogInWithValidCredentials(){
        OnStage.theActorInTheSpotlight().attemptsTo(
            Login.withCredentials("standard_user", "secret_sauce")
        );
    }

    @Then("they should see the inventory page")
    public void theyShouldSeeTheInventoryPage(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogOut.LogOut()
        );
    }
}
