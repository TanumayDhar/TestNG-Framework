package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemoTestCases {


	//will run once before  @Test methods
	@BeforeTest
	public void beforeTestAnnotation()
	{
		System.out.println("This is beforeTestAnnotation- Will run once before @TEst method ");

	}

	@AfterTest
	public void afterTestAnnotations()
	{
		System.out.println("This is afterTestAnnotations- Will run once after all  @TEst method ");

	}

	@BeforeMethod
	public void beforeMethodTest()
	{

		System.out.println("This is beforeMethodTestAnnotations- will run each and every time before each and every @Test method ");


	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("This is afterMethodTestAnnotations-will run each and every time after each and every @Test method ");
	}

	//@test to run test cases
	//@Test run alphabatically
	@Test
	public void Demo()
	{

		System.out.println("This is a First test Test Case");


	}

	@Test
	public void Demo2()
	{

		System.out.println("This is second Test Case");


	}

}
