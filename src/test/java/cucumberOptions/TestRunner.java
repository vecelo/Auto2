package cucumberOptions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/scr/test/java/features",
        glue = "stepDefinitions"
)
public class TestRunner {
}
