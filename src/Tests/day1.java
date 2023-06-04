package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups = "Smoke", timeOut = 10) //applies a timeout attribute for this method execution
	public static void personalLoan1() {
		
		System.out.println("PersonalLoan1 execution...");
		
	}
	
	//DataProvider is used for run 3 times the dataProv method/class with 3 different data provided
	@Test(dataProvider = "getData")
	public static void dataProv(String username, String password) {
		
		System.out.println(username + " - " + password);
		
	}
	@DataProvider
	public static Object[][] getData() {
		
		// this DataProvider is gonna run 3 times the dataProv method/class with 3 different data provided
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstUSERNAME";
		data[0][1] = "firstPASS";
		
		data[1][0] = "secondUSERNAME";
		data[1][1] = "secondPASS";
		
		data[2][0] = "thirdUSERNAME";
		data[2][1] = "thirdPASS";
		
		return data;
	}
	
	
	@Parameters({"URL","USERNAME"}) //Using global variables declared in testGeneral.xml
	@Test
	public static void showURL(String URL, String USERNAME) {
		
		System.out.println(URL);
		System.out.println(USERNAME);
	}
	
}
