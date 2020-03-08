package com.antonio.fw;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:login/LoginTest.feature",glue="com.antonio.fw",plugin= {"html:target/test-report","junit:target/junit-xml-report.xml","pretty:target/json-report.json"})
public class TestRunner {
	
	
	
	

}
