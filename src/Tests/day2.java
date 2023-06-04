package Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public static void personalLoan3() {
		
		System.out.println("personalLoan3 execution...");
		
	}
	
	
	@BeforeTest
	public static void beforeTest() {
		
		System.out.println("Before test execution...");
		
	}
	
	@AfterTest
	public static void afterTest() {
		
		System.out.println("After test execution...");
		
	}
	
	@AfterSuite
	public static void afterSuite() {
		
		System.out.println("After suite execution...");
		
	}
	
	
}
