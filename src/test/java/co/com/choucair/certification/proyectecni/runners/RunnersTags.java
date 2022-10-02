package co.com.choucair.certification.proyectecni.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/academyChoucair.feature",
        tags=" @Scenario1",
        glue="co.com.choucair.certification.proyectecni.stepdefinitions",
        snippets=SnippetType.CAMELCASE)

public class RunnersTags {
}
