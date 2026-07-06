package com.serenity.training.tasks;

import com.serenity.training.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login {

    // Creamos la clase de iniciar sesión con credenciales como parametro
    public static Task withCredentials(String username, String password) {
        // Interaction
        // en "import net.serenitybdd.screenplay.actions." hay muchas acciones
        // por ahora usaremos Enter y Click

        // Enter.theValue() - se usa para ingresar un valor
        // into() - es donde se agregará este valor

        // Click.on() - es donde se hará click

        // siempre se debe especificar el elemento que creamos en los Targets
        return Task.where(
            "{0} logs into the application",
            Enter.theValue(username).into(LoginPage.USERNAME),
            Enter.theValue(password).into(LoginPage.PASSWORD),
            Click.on(LoginPage.BUTTON_LOGIN)
        );
    }
}
