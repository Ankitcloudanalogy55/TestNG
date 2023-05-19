package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer extends Base implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 3;

	public boolean retry(ITestResult result) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
	}
}
