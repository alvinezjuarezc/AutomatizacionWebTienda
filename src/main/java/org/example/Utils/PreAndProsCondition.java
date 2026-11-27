package org.example.Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PreAndProsCondition {

    private static final Logger LOGGER = LoggerFactory.getLogger(PreAndProsCondition.class);
    public static String screenShot = Parameters.RutaEvidencia;

    @Before
    public void beforeScenario(Scenario scenario) {
        LOGGER.info("___________________");
        LOGGER.info("Running: " + scenario.getName());
        OnStage.setTheStage(new OnlineCast());
        LOGGER.info("create folder for screenshot");
        screenShot += ScreenShot.getCurrentDateTime() + "_" + scenario.getName();
        Parameters.RutaEvidenciaActual = screenShot;
        ScreenShot.createFolder(screenShot);
    }

    @After
    public void afterScenario(Scenario scenario) {
        LOGGER.info("finishing: " + scenario.getName());
        screenShot = Parameters.RutaEvidencia;
    }
}