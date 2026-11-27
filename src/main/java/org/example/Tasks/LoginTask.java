package org.example.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {

    String email;
    String password;

    public LoginTask(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static LoginTask perform(String email, String password) {
        return Tasks.instrumented(LoginTask.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // 1. Espera que aparezca el botón Signup/Login
                WaitUntil.the(HomePage.LOGIN_LINK, isVisible()).forNoMoreThan(15).seconds(),
                Scroll.to(HomePage.LOGIN_LINK),
                Click.on(HomePage.LOGIN_LINK),

                // 2. Espera que aparezca el campo email
                WaitUntil.the(LoginPage.EMAIL_FIELD, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(email).into(LoginPage.EMAIL_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),

                // 3. Espera el botón de Login y le da clic
                Scroll.to(LoginPage.LOGIN_BUTTON),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}