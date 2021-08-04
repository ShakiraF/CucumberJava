package StepDefintions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:/Shakira/Java/CucumberJava/src/test/resources/Feature",glue=("StepDefintions"),
monochrome =true,
plugin = {"pretty","html:target/HTMLReports/index.html","json:target/JsonReport/report.json","junit:target/JunitReports/report.xml"},
tags="@GoogleSearch"
)
public class TestRunner {
	
	

}
