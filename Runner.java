package com.runner;//task complete

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Feature file",glue="com.step",plugin = {"json:adactin_report/adac.json","html:adactin_report/adachtml.html"} )//feature file path + step definition mapping

//plugin will generate report u can use either one json or html
public class Runner extends Base_Class {//RUNNER CLS
	
	
	
	public static WebDriver web;
	
	@BeforeClass
	public static void setup() {
		
		browser("chromeDriver");
		max();
		
}
	@AfterClass
	public static void teardown() {

		quit();
		
		
		
	
	}

}
