package Tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


//listener for executing some code when test fails
//must be declared in testGeneral.xml where the listener is located
public class day5 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Success!");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failure! " + result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	}
	
	@Override
	public void onFinish(ITestContext context) {
		
	}
}
