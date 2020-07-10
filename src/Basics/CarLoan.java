package Basics;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {

	@Test(groups = { "smoke", "regression" }, dependsOnMethods = "apiCarLoan")
	public void webCarLoan() {
		System.out.println("Web car loan");
	}

	@Parameters({ "url", "LoanUrl" })
	@Test(dependsOnMethods = { "apiCarLoan", "webCarLoan" })
	public void mobileBMWLoan(String urlname, String loanUrlName) {
		System.out.println("Mobile BMW car loan");
		System.out.println("global url is " + urlname);
		System.out.println("loan url is " + loanUrlName);
	}

	@Test(groups = { "smoke", "regression" }, dependsOnMethods = "apiCarLoan")
	public void mobileAudiLoan() {
		System.out.println("Mobile Audi car loan");
	}

	@Test(dependsOnMethods = "apiCarLoan")
	public void mobileMaruthiLoan() {
		System.out.println("Mobile Maruthi car loan");
	}

	@Test
	public void apiCarLoan() {
		System.out.println("API car loan");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
}
