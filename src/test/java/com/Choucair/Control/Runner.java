package com.Choucair.Control;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/java/Features"},
		glue = {"Enlace"}
		)
public class Runner {

}
