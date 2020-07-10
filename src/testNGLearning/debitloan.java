package testNGLearning;

import org.testng.annotations.Test;

public class debitloan {
	@Test(groups = { "regression" })
	public void debitHomeLoan() {
		System.out.println("debit Home Loan");
	}

	@Test(groups = { "regression", "smoke" })
	public void debitPersonalLoan() {
		System.out.println("debit Personal Loan");
	}
	

}
