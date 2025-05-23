package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/api/cucumber/features/LoginDemo.feature",
        glue = {"api/cucumber/steps"},
        monochrome = true,
        plugin = {
                "pretty",
                "junit:target/junitReports/report.xml",
                "json:target/jsonReports/report.json",
                "html:target/htmlReports"
        }
)



public class TestRunnerForLoginUsingpom {

}





