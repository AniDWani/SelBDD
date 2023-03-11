package com.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resource/Features",glue = {"com/stepdefinitions"},
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdaptor:"})


public class runner {



}
