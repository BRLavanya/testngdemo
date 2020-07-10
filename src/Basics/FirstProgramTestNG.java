package Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstProgramTestNG {

	@AfterTest
	public void afterTest() {
		System.out.println("after test method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}

	@Test( alwaysRun =  false)
	public void demo() {
		System.out.println("my first testng class");
	}

	@Test(invocationCount = 1,dependsOnMethods = "demo")
	public void demo1() {
		System.out.println("bye");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
}
