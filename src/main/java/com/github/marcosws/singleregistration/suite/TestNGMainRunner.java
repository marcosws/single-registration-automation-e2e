package com.github.marcosws.singleregistration.suite;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;


public class TestNGMainRunner {
	
    public static void main( String[] args ){
    	
    	TestNG testNG = new TestNG();
    	TestListenerAdapter testListenerAdapter = new TestListenerAdapter();
    	testNG.setTestClasses(new Class[] { TestNGSuiteRunner.class });
    	testNG.addListener(testListenerAdapter);
    	testNG.run();
    }
    
}
