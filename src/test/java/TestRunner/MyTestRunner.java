package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class )
@CucumberOptions(
        features={"src/test/resources/features"},
        glue = {"stepDefs"},
        dryRun =false,
        plugin = {"pretty"}


)
public class MyTestRunner {
}
