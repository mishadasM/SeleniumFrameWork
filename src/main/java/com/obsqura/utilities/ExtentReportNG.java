package com.obsqura.utilities;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.obsqura.constants.Constants;



public class ExtentReportNG {



	public static ExtentReports extent;



	public static  ExtentReports GetReporterObject() {

		// String path = System.getProperty("user.dir") + "//Reports//index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(Constants.Extent_ReportPath);

		reporter.config().setReportName("Obsquara automation report");

		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Mandy Taak");

		extent.setSystemInfo("Enviornment", "QA");

		return extent;

		

	}

}



