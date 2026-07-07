package com.serenity.training.question;

import com.serenity.training.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class WelcomeMessage implements Question<String> {
    @Override
    public String answeredBy(Actor actor){
        return Text.of(HomePage.SPAN_WELCOME_HOMEPAGE).answeredBy(actor);
    }

    public static WelcomeMessage text(){
        return new WelcomeMessage();
    }
}