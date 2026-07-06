package com.serenity.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    // Declaramos el "Username input"
    // Target.the(), dentro pondremos el nombre del input
    // .locatedBy(), dentro pondremos el xpath para seleccionar el input
    public static final Target USERNAME = Target.the("Username Input")
            .locatedBy("//input[@id='user-name']");

    // Como funciona xpath?
    //
    // //      -> busca desde cualquier parte del documento
    // input   -> tipo de elemento
    // [ ]     -> condición de búsqueda
    // @id     -> atributo
    // '...'   -> valor esperado
    //
    // Ejemplo:
    // //input[@id='user-name']
    public static final Target PASSWORD = Target.the("Password Input")
            .locatedBy("//input[@id='password']");

    public static final Target BUTTON_LOGIN = Target.the("Button Login")
            .locatedBy("//input[@id='login-button']");
}
