package day1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import junit.framework.TestCase;
@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"json:report/result.json"})

public class runner extends TestCase {

}
