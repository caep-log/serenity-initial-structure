package com.serenity.training.stepdefinitions;

import com.serenity.training.pages.LoginPage;
import com.serenity.training.question.LoginPageMessage;
import com.serenity.training.tasks.LogOut;
import com.serenity.training.tasks.Login;
import com.serenity.training.tasks.OpenLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LogOutStepDefinition {
    @Given("the user open application the login page")
    public void theUserOpenApplicationTheLoginPage(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                OpenLoginPage.open()
        );
    }

    @When("user log in with valid credentials")
    public void userLogInWithValidCredentials(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                Login.withCredentials("Tatiscastaneda0409@gmail.com", "T123456")
        );
    }

    @And("user log out the application")
    public void userLogOutTheApplication(){
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogOut.LogOut()
        );
    }

    @Then("the user should see login page message")
    public void theUserShouldSeeLoginPageMessage(){
        String message = OnStage.theActorInTheSpotlight()
                .asksFor(LoginPageMessage.text());

        Ensure.that(message)
                .contains("Inicia sesión aquí");
    }
}
