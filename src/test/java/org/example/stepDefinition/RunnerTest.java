package org.example.stepDefinition;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.stepDefinition", "org.example.Utils"},
        plugin = {"pretty"},
        tags = "@CP1_login"
)
public class RunnerTest {
}
