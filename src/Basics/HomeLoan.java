package Basics;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeLoan {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite ");
	}

	@Test(priority = 0, groups = { "smoke", "regression" })
	public void webHomeLoan() {
		System.out.println("Web home loan");
	}

	@DataProvider
	@Test(priority = -1, dataProvider = "getData")
	public void mobileHomeLoan(String username, String password) {
		System.out.println("Mobile home loan");
		System.out.println("username is " + username);
		System.out.println("password is " + password);
	}

	@Test(priority = -1)
	public void mobileDuplexHomeLoan() {
		System.out.println("Mobile duplex home loan");
	}

	@Test(priority = -1, groups = { "regression" })
	public void mobileVillaHomeLoan() {
		System.out.println("Mobile villa home loan");
	}

	@Test(priority = 2)
	public void apiHomeLoan() {
		System.out.println("API home loan");
	}

	@DataProvider
	public Object[][] getData() {
		// 3 value is equal to 3 rows i.e. 3 combinations
		// 2 value is equal to 2 inputs i.e. we are entering username and password in 3
		// sets
		Object[][] data = new Object[3][2];

		// set1
		data[0][0] = "firstUserName";
		data[0][1] = "firstUserPassword";

		// set2
		data[1][0] = "secondUserName";
		data[1][1] = "secondUserPassword";

		// set3
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdUserPassword";

		return data;
	}
}
