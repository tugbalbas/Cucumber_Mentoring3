package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        tags = {"@RegressionTest"}, // tag imizi alıp Features ların baiına ekliyoruz yalnızca
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" },
        dryRun = false

)

public class _4_RegressionTest extends AbstractTestNGCucumberTests {
}

/*
Regression Testte Application/Test/Websitesine yeni özellikler ekliyoruz
ya da daha önceki hataları düzelttik direkt REGRESSION TEST ile düzeltiyoruz.
düzelttik tekrar bu testi yapmamız gerekiyor
her yenilikten, her hatadan sonra yapılan test(çok sık yapılır)

SmokeTestin yazılışından hiç bir farkı yok.
 */