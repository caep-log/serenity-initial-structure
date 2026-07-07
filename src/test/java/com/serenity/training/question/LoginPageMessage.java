package com.serenity.training.question;

import com.serenity.training.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginPageMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor){
        return Text.of(LoginPage.TEXT_LOGIN_PAGE).answeredBy(actor);
    }

    public static LoginPageMessage text(){
        return new LoginPageMessage();
    }
}
