package Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoClass {

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test method");
	}
	
	@Parameters({"url"})
	@Test(groups = {"smoke","regression"})
	public void personalLoan(String urlname) {
		System.out.println("personal loan");
		System.out.println("global url is "+urlname);
	}

	@Test(groups = {"regression"})
	public void creditLoan() {
		System.out.println("credit loan");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class method");
	}
}
