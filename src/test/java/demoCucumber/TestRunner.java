package demoCucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src//test//java//features//testDemo.feature" }, glue = { "com.stepdef" })

public class TestRunner {

}
