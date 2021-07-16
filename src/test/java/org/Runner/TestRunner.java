package org.Runner;

import org.Stepdefinition.JvmReports;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\EndtoEnd.feature",
              glue="org.Stepdefinition",
               monochrome=true,
            tags= {"@NewEnd2End"},
              plugin= {"html:src\\test\\resources\\Reports\\Html",
				"json:src\\test\\resources\\Reports\\json\\login.json"}
)

public class TestRunner {
	@AfterClass
	public static void jvmreport() {
		JvmReports.generatejvmreport("src\\test\\resources\\Reports\\json\\login.json");
}
}