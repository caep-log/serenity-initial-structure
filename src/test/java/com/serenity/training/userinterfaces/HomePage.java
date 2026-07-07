package com.serenity.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target SPAN_WELCOME_HOMEPAGE = Target.the("Span Welcome Homepage")
            .locatedBy("//span[@id='wallv3-user-name-greeting']");
}
