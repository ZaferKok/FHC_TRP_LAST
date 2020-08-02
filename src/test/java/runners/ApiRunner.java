package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber-reports-api",
                "json:target/json-reports/cucumber-api.json",
                "junit:target/xml-report/cucumber-api.xml"
        },
        features ="src/test/resources/features.Api",
        glue = "stepdefinitionsApi",
        strict = true,
        tags = "@put",
        dryRun = false
)

public class ApiRunner {
}
