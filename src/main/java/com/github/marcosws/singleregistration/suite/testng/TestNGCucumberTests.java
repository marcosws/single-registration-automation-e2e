package com.github.marcosws.singleregistration.suite.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class TestNGCucumberTests implements IRetryAnalyzer {

	private TestNGCucumberRunner testNGCucumberRunner;
	private int count = 0;
	private static int maxTry = 3;

	@Override
	public boolean retry(ITestResult iTestResult) {
		if (!iTestResult.isSuccess()) {
			;
			if (count < maxTry) {
				count++;
				iTestResult.setStatus(ITestResult.FAILURE);
				return true;
			} else {
				iTestResult.setStatus(ITestResult.FAILURE);
			}
		} else {
			iTestResult.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

	@BeforeClass(alwaysRun = true)
	public void setUpClass(ITestContext context) throws Exception {
		System.out.println("Before Scenario ****");
	    context.getCurrentXmlTest().getSuite().setDataProviderThreadCount(4); // set max number of Threads
	    context.getCurrentXmlTest().getSuite().setPreserveOrder(true);
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
    	return testNGCucumberRunner.provideScenarios();
    }
	
    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios", retryAnalyzer = TestNGCucumberTests.class)
    public void scenario(PickleWrapper pickleEvent, FeatureWrapper cucumberFeature) {
    	
    	testNGCucumberRunner.runScenario(pickleEvent.getPickle());
    }

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		System.out.println("After Scenario ****");
		testNGCucumberRunner.finish();
	}
}
