package testNGLearning;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterClass {
	
	@Parameters({ "url", "LoanUrl" })
	@Test
	public void mobileBMWLoan(String urlname, String loanUrlName) {
		System.out.println("parameter class ");
		System.out.println("global url is " + urlname);
		System.out.println("loan url is " + loanUrlName);
	}
}
