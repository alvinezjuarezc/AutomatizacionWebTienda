package org.example.Pages;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target EMAIL_FIELD = Target.the("Campo email para login")
            .locatedBy("//input[@data-qa='login-email']");

    public static final Target PASSWORD_FIELD = Target.the("Campo contrasena para login")
            .locatedBy("//input[@data-qa='login-password']");

    public static final Target LOGIN_BUTTON = Target.the("Boton Login")
            .locatedBy("//button[@data-qa='login-button']");
}