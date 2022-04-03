import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = {
        "src/test/resources/features/Koustuvehomepage.feature" }, glue = ".", plugin = { "pretty", "html:target/html-reports" })
public class TestrunnerTest
{


}