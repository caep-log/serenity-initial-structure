package com.serenity.training.tasks;

import com.serenity.training.userinterfaces.LogOutPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LogOut {
    public static Task LogOut(){
        return Task.where(
                Click.on(LogOutPage.BUTTON_MENU),
                Click.on(LogOutPage.LOGOUT_BUTTON)
        );
    }
}
