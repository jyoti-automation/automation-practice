package api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/FeatureWithTags/Tags.feature",
        glue = {"steps"},
       //"@smoke",@regression"//not working only work with and or
       // tags="@smoke or @regression"
      // tags="@smoke and @regression"
       // tags="(@smoke or @regression)and @important"
      //  tags="@regression and not @smoke"
       // tags="(@smoke or @regression)and not @important"
        tags="@mustRun"

)

public class TestRunner_RunWithSingleTag {
}
