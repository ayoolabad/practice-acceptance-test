package com.practech.practice.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"com.practech.practice.stepDefinition"},
        format = {"pretty", "html:target/site/cucumber-pretty"},
        tags = {"@AccountManagement"}
)

public class TestRunner {
}
