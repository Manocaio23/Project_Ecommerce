package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Cadastrar_conta.feature",
        glue = {"Steps"},
        tags = "@CY001",
        plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber-reports/Cucumber.json"},
        dryRun = false,
        monochrome = true,
        snippets = SnippetType.CAMELCASE)
public class RunnerClass {

}
