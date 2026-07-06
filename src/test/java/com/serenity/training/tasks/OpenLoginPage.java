package com.serenity.training.tasks;

import com.serenity.training.pages.LoginPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenLoginPage {

    public static Task open() {
        return Task.where(
                "{0} opens the login page",
                // Abre el navegador en la página representada por LoginPage
                // que definimos en la carpeta pages
                Open.browserOn().the(LoginPage.class)
        );
    }
}
