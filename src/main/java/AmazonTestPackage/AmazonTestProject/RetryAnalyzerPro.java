package AmazonTestPackage.AmazonTestProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerPro implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int retry_count = 2;
		int current_count = 0;
		
		if(current_count<retry_count)
		{
			current_count++;
			return true;
		}
		return false;
	}
	

}
