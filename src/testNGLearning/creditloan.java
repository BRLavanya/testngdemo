package testNGLearning;

import org.testng.annotations.Test;

public class creditloan {

	@Test(groups = {"smoke"})
	public void creditHomeLoan()
	{
		System.out.println("credit Home Loan");
	}
	@Test(groups = {"regression"})
	public void creditPersonalLoan()
	{
		System.out.println("credit Personal Loan");
	}
}
