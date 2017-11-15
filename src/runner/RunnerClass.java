package runner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json:target/"},
		features ={"src/"},
		glue={"stepdefination"}
		)
public class RunnerClass {
}
