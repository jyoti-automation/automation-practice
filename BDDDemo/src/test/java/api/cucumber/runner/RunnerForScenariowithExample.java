package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/features/loginwithexample.feature"},glue = {"api.cucumber.steps.loginstepsDefinitionsForScenarioWithExamples"},dryRun = false)
public class RunnerForScenariowithExample {
}
