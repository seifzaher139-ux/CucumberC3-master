package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@smoke",
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        }
)
public class SmokeRunner extends AbstractTestNGCucumberTests {
//        @Override
//        @DataProvider(parallel = true)
//        public Object[][] scenarios() {
//                return super.scenarios();
//        }
}
