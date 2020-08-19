package co.com.choucair.reto1screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/automatationDemosite.feature",
        tags = "@Stories",
        glue = "co.com.choucair.reto1screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {

}
