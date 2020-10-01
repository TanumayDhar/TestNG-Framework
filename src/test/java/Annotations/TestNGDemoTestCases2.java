package Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGDemoTestCases2 {
	
	
	
	@BeforeSuite
	public void beforeSuiteTest()
	
	{
		
		System.out.println("This is beforeSuiteTestAnnotation - Will run before all annonations.First to start ");
	}
	
	
	@AfterSuite
	public void afterSuiteTest()
	
	{
		
		System.out.println("This is afterSuiteTestAnnotation - Will run after all annonations.Last to execute ");
	}
	
}
