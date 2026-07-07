package com.serenity.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
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

    // Declaramos el "Username input"
    // Target.the(), dentro pondremos el nombre del input
    // .locatedBy(), dentro pondremos el xpath para seleccionar el input
    public static final Target USERNAME = Target.the("Username Input")
            .locatedBy("//input[@id='loginForm:idUser']");

    public static final Target PASSWORD = Target.the("Password Input")
            .locatedBy("//input[@id='loginForm:password']");

    public static final Target BUTTON_LOGIN = Target.the("Button Login")
            .locatedBy("//button[@id='loginForm:comfirmPass']");

    public static final Target BUTTON_ACCESS_WITH_EMAIL = Target.the("Button Access with email")
            .locatedBy("//a[@id='social-login-form:loginWithPasswordOption']");

    public static final Target TEXT_LOGIN_PAGE = Target.the("Text Login Page")
            .locatedBy("//p[@id='login-text']");
}
