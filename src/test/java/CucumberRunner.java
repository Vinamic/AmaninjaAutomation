import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.checkerframework.checker.units.qual.C;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath: features"},
        glue = {"com.amicable.selenium.tests"})
public class CucumberRunner {






}
