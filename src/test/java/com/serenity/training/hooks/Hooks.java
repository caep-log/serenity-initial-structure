package com.serenity.training.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class Hooks {
    // usando @Manage serenity inyectará el web driver al proyecto
    // definido el el serenity.conf
    @Managed
    WebDriver driver; // Serenity inyecta el web driver

    // se crea la clase para iniciar el escenario con @Before
    @Before
    public void setTheStage() {
        // es escenario se crea con "OnStage"
        OnStage.setTheStage(new OnlineCast());

        // usamos el escenario para pasar el web driver al usuario
        OnStage.theActorCalled("User").can(
                BrowseTheWeb.with(driver)
        );
    }
}
