package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/myStore.feature"}, // myStore u test etmek istiyorum
        glue = {"stepDefinition"},
        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" }, // rapor için pluginleri netten kopyala-yapıştır yapıyoruz
        dryRun = false

)

public class _2_RunnerBelirliTestler extends AbstractTestNGCucumberTests {

}

// Artık .feature lardan değil bu testleri RUN yapıyoruz.