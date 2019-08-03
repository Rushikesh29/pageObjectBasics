package utilities;



import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.google.common.io.Files;

import base.Page;
import base.Page;

public class Utilities extends Page {
	
	public Utilities() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	public static String screenshotPath = "C:\\test\\liveprojects\\datadrivenframework\\screenshots\\";
	public static String screenshotName;
	
	public static void captureScreenshot() throws IOException {
		Date d = new Date();
		String dd = d.toString().replace(":", "_").replace(" ", "_");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		screenshotName = "error_"+dd+".jpg";
		Files.copy(scrFile,new File(screenshotPath+screenshotName));
		
		
	}
//	@DataProvider(name="dp")
//	public static Object[][] getData(Method m){
//		System.out.println("get data");
//		String sheetName = m.getName();
//		int rows = excel.getRowCount(sheetName);
//		System.out.println(rows);
//		int cols = excel.getColumnCount(sheetName);
//		System.out.println(cols);
//		
//		Object[][] data = new Object[rows-1][cols];
//		
//		for(int rowNum = 2 ; rowNum<= rows ; rowNum++) {
//			
//			for(int colNum = 0 ; colNum < cols ; colNum++) {
//				//System.out.println(colNum);
//				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
//			}
//		}
//		System.out.println("returned data");
//		return data;
//	}
	
	@DataProvider(name="dp")
	public Object[][] getData(Method m) {

		String sheetName = m.getName();
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];
		
		Hashtable<String,String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) { // 2

			table = new Hashtable<String,String>();
			
			for (int colNum = 0; colNum < cols; colNum++) {

				// data[0][0]
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}

		}

		return data;

	}

	
public static boolean isTestRunnable(String testName, ExcelReader excel){
		
		String sheetName="test_suite";
		int rows = excel.getRowCount(sheetName);
		
		
		for(int rNum=2; rNum<=rows; rNum++){
			
			String testCase = excel.getCellData(sheetName, "TCID", rNum);
			
			if(testCase.equalsIgnoreCase(testName)){
				
				String runmode = excel.getCellData(sheetName, "Runmode", rNum);
				
				if(runmode.equalsIgnoreCase("Y"))
					return true;
				else
					return false;
			}
			
			
		}
		return false;
	}
}
