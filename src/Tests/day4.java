package Tests;

import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups = "API")
	public static void WebLoginHOMELOAN() {
		
		System.out.println("WebLoginHOMELOAN execution...");
	}
	
	@Test
	public static void MobileLoginHOMELOAN() {
		
		System.out.println("MobileLoginHOMELOAN execution...");
	}
	
	@Test
	public static void MobileLogoutHOMELOAN() {
		
		System.out.println("MobileLoginHOMELOAN execution...");
	}
	
	@Test(groups = "API", dependsOnMethods = "WebLoginHOMELOAN") // firstly execute the WebLoginHOMELOAN
	public static void APILoginHOMELOAN() {
		
		System.out.println("APILoginHOMELOAN execution...");
	}
	
	
}
