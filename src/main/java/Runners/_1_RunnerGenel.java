package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java"}, // test yapacağın FeatureFile'ın nerede stepler

        glue = {"stepDefinition"}, // steplerin konumları nerde

        dryRun = false
)

public class _1_RunnerGenel extends AbstractTestNGCucumberTests {

}


/*
Cucumberda testlerimizi bunun üzerinde yapıyoruz -> (extends AbstractTestNGCucumberTests)

Artık .feature lardan değil bu testleri RUN yapıyoruz.

 */