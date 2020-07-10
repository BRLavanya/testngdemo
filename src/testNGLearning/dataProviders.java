package testNGLearning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviders {
	@DataProvider
	@Test(priority = -1, dataProvider = "getData")
	public void mobileHomeLoan(String username, String password) {
		System.out.println("data provider method");
		System.out.println("username is " + username);
		System.out.println("password is " + password);
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
		//data[0][2]="tom";

		// set2
		data[1][0] = "secondUserName";
		data[1][1] = "secondUserPassword";

		// set3
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdUserPassword";

		return data;
	}
}
