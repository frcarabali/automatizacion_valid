package starter.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

// Runner que permite la ejecución de cada escenario descrito en el feature, indicando en tags el escenario que se requiera
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/pruebaValid/escenariosPruebaValid.feature",
        glue="starter",
        tags = "@wikipedia"
)
public class CucumberTestSuite {
}