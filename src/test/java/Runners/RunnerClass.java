package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"Steps"},
        tags = "@regresivo",
        plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber-reports/Cucumber.json"},
        dryRun = false,
        monochrome = true,
        snippets = SnippetType.CAMELCASE)
public class RunnerClass {

}
