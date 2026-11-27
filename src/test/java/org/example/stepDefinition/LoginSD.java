package org.example.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.example.Questions.LoginExitoso;
import org.example.Tasks.LoginTask;
import org.openqa.selenium.WebDriver;

public class LoginSD {

    private Actor usuario;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("Usuario");
        WebDriver driver = ThucydidesWebDriverSupport.getDriver();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("el usuario se encuentra en la pagina web de automationexercise")
    public void openAutomationExercisePage() {
        String base_url = System.getProperty("base_url", "https://automationexercise.com/");
        usuario.attemptsTo(Open.url(base_url));
    }

    @When("inicia sesion con email {string} y password {string}")
    public void iniciaSesionConEmailYPassword(String email, String password) {
        usuario.attemptsTo(LoginTask.perform(email, password));
    }

    @Then("se encuentra en el home de automationexercise")
    public void seEncuentraEnElHomeDeAutomationExercise() {
        usuario.attemptsTo(
                Ensure.that(LoginExitoso.isTitleVisible()).isTrue()
        );
    }
}