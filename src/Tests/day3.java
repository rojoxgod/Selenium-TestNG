package Tests;

import org.testng.annotations.Test;

public class day3 {
	
	@Test
	public static void WebLoginCARLOAN() {
		
		System.out.println("WebLoginCARLOAN execution...");
	}
	
	@Test
	public static void MobileLoginCARLOAN() {
		
		System.out.println("MobileLoginCARLOAN execution...");
	}
	
	@Test(groups = "API", enabled = false) //enabled attribute skips the execution of the method/test
	public static void APILoginCARLOAN() {
		
		System.out.println("APILoginCARLOAN execution...");
	}
	
	
}
