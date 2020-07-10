package testNGLearning;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethod {
	@Test
	public void add() {
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = "add")
	public void sub() {
		Assert.assertTrue(true);
	}
}
