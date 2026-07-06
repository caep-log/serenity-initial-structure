package com.serenity.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LogOutPage {
    public static final Target BUTTON_MENU = Target.the("Menu Button")
            .locatedBy("//div[@class='bm-burger-button']");

    public static final Target LOGOUT_BUTTON = Target.the("Menu Button")
            .locatedBy("//a[@id='logout_sidebar_link']");
}
