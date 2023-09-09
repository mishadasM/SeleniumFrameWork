package com.obsqura.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.obsqura.constants.Constants;
import com.obsqura.utilities.ExtentReportNG;

public class Listeners implements ITestListener {
	ExtentSparkReporter reporter = new ExtentSparkReporter(Constants.Extent_ReportPath);
	
	ExtentReports extent =ExtentReportNG.GetReporterObject();
		ExtentTest test ;
		
		@Override
		public void onTestStart(ITestResult result) {
			test = extent.createTest(result.getMethod().getMethodName());
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			test.log(Status.PASS, "Test Passed");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			test.fail(result.getThrowable());

		}

		@Override
		public void onFinish(ITestContext context) {
			extent.flush();
		}
}