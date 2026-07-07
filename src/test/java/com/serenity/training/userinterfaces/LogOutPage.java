package com.serenity.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LogOutPage {
    public static final Target BUTTON_MENU = Target.the("Menu Button")
            .locatedBy("//a[@id='goHomeId']");

    public static final Target LOGOUT_BUTTON = Target.the("Menu Button")
            .locatedBy("//a[@id='logoutBtnId']");
}
