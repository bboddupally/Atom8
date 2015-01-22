
package test.game;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.Reporter;

import com.gtech.util.SelectingWebDriver;


public class Screenshots {
static String dirName=  DirectoryCreator.createDirectories(new File("test-output").getAbsolutePath()+"/"+new SimpleDateFormat("dd-MM-yyyy").format(new java.util.Date(System.currentTimeMillis()))+"/", new java.util.Date(System.currentTimeMillis()));
;
	
	public  void getScreenshot(String methodName, String message) {
	screenshot(methodName, message);
	}

	
	public  void getScreenshot(String message) {
			screenshot(extractSimpleClassName(java.lang.Thread.currentThread().getStackTrace()[2].getMethodName()), message);
		}

	
	public  void getScreenshot() {
		screenshot(extractSimpleClassName(java.lang.Thread.currentThread().getStackTrace()[2].getMethodName()),"");
		}
	private void screenshot(String methodName, String message) {
		

		WebDriver driver = SelectingWebDriver.getInstance();
		System.out.println("screenShot");
		String fileName = null;
	
		try {
			String date = (new StringBuilder(String.valueOf((new SimpleDateFormat("ddMMyyyyhhmmss")).format(Calendar.getInstance().getTime())))).append(".png").toString();
			fileName = (new StringBuilder(String.valueOf(methodName))).append(date).toString();
			try {
				try {
					if (fileName.length() > 100) {
						File f = new File((new StringBuilder(dirName)).append(fileName).toString());
						if (f.exists()) {
							f.delete();
							f.createNewFile();
						}
						FileUtils.copyFile((File) ((TakesScreenshot) (new Augmenter()).augment(driver)).getScreenshotAs(OutputType.FILE), f);
						
				
					} else {
						FileUtils.copyFile((File) ((TakesScreenshot) (new Augmenter()).augment(driver)).getScreenshotAs(OutputType.FILE),new File((new StringBuilder(dirName+"/")).append(date).toString()));
	
						Html.builder.append("<tr><td> ").append(" View Screenshot in testcase:").append(message).append("<a href='"+dirName+"/").append(date).append("'> ").append(methodName).append("<img src='"+dirName+"/").append(date).append("'style='width:80px;height:30px;border:0'></a></td></tr>");
					}
				} catch (WebDriverException webdriverexception) {
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ScreenshotException se) {
			se.printStackTrace();
		}
	}
	
	public static String extractSimpleClassName(String fullClassName) {
		if ((fullClassName == null) || ("".equals(fullClassName))) {
			return "";
		}
		int lastDot = fullClassName.lastIndexOf(46);
		if (lastDot < 0) {
			return fullClassName;
		}
		return fullClassName.substring(++lastDot);
	}
}
