package com.serenity.training.stepdefinitions;

import com.serenity.training.question.WelcomeMessage;
import com.serenity.training.tasks.Login;
import com.serenity.training.tasks.OpenLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginStepDefintions {
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
        // 1. Citamos el escenario "OnStage" que usará el "User" como actor
        // 2. y traemos el actor al escenario con "theActorInTheSpotlight"
        // 3. el actor intentará, "attemptsTo"
        // 4. ingresar con email, contraseña a los inputs y hacer click en el botón de login del "tasks"
        // usando la clase "Login" y usando el metodo publico "withCredentials()" pasando los parametros
        OnStage.theActorInTheSpotlight().attemptsTo(
            Login.withCredentials("Tatiscastaneda0409@gmail.com", "T123456")
        );
    }

    @Then("they should see the inventory page")
    public void theyShouldSeeTheInventoryPage(){
        // 1. Definimos una variable tipo String
        // 2. Citamos el escenario "OnStage" que usará el "User" como actor
        // 3. y traemos el actor al escenario con "theActorInTheSpotlight"
        // 4. usamos "asksFor" y traemos el Question "WelcomeMessage.text()"
        String message = OnStage.theActorInTheSpotlight()
                .asksFor(WelcomeMessage.text());

        // 5. usamos el "Ensure" para indicar que nos aseguremos que el valor obtenido
        // coincida con el valor del "contains"
        Ensure.that(message)
                .contains("Tatiana");
    }
}
