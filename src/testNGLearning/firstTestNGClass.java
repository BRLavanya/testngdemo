package testNGLearning;

import org.testng.annotations.Test;

public class firstTestNGClass {
	@Test(priority = 0)
	public void c() {
		System.out.println("c method");
	}

	@Test(priority = 1)
	public void b() {
		System.out.println("b method");
	}

	@Test(priority = 0,invocationCount = 2)
	public void a() {
		System.out.println("a method");
	}

}
