package Runner;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (
        features = "src/test/java/Resources",
        glue = {"StepDefinitions"},
        plugin = {"json:test/report/cucumber_report.json"}
)
public class RunnerSerenity {
}
