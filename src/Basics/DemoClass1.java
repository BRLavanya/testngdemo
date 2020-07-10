package Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass1 {
	
	@Test
	public void creditShopping() {
		System.out.println("credit Shopping");
	}

	@Test
	public void debitShopping() {
		System.out.println("debit Shopping");
		Assert.assertTrue(false);
	}

}
