package Annotations;

import org.testng.annotations.Test;

public class TestNGDemoTestCases3 {
	
	//Prioritisation of test cases
	@Test
	public void banking()
	{
		
		System.out.println("banking");
		
	}
	//if "banking " test case fail also "Add customer" will execute due to attribute alwaysRun=true
	@Test(dependsOnMethods= {"banking"}, alwaysRun=true)
	public void AddCustomer()
	{
		System.out.println("AddCustomer");
			
	}
	
	@Test(enabled=false)
	public void createAccount()
	{
		System.out.println("createAccount");
		
		
	}
	
	@Test(enabled=true)
	public void createNEWAccount()
	{
		System.out.println("createAccountNew");
			
	}
	//time should take 1 sec , otherwise fail
	@Test(timeOut=1000)
	public void timeToexecute()
	{
		System.out.println("timeToexecute is 1 sec");
			
	}
	
	
}
