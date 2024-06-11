package com.co.magnetoApp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/edit_profile.feature",
        glue = "com.co.magnetoApp.stepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class EditRunner {
}
