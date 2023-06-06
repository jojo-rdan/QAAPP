package org.exerciseQAAPP.tests.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/java/org/exerciseQAAPP/tests/fetures/web/web.feature",
        glue = {"org.exerciseQAAPP.tests.steps.web"}
)

public class WebTests {
}
