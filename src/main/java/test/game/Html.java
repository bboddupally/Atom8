package test.game;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Html {
	
	public static StringBuilder builder = new StringBuilder();
	@BeforeSuite
	public static void beforSuite(){
		
		
	        builder.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">");
	        builder.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
	        builder.append("<head>");
	        builder.append("<title>ScreenShots Report </title>");
	        builder.append("<style>table, th, td {    border: 1px solid black;    border-collapse: collapse;}th, td {    padding: 5px;}</style>");
	        builder.append("</head><body style='background-color:lightgrey'><table>");

    
	}
	
	@AfterSuite
	public void afterSuite() {
		
	//File file = new File(new File("test-output").getAbsolutePath()+"/ScreenShotReports.html");

		BufferedWriter bw, bw2;
		try {
			bw = new BufferedWriter(new FileWriter(new File("test-output").getAbsolutePath()+"/ScreenShotReports.html"));
			
			bw2 = new BufferedWriter(new FileWriter(new File(new Screenshots().dirName).getAbsolutePath()+"/ScreenShotReports.html"));

		
		//builder.append("</tr>");
		  builder.append("</table></body></html>");
	        String html = builder.toString();
	        System.out.println(html);
	        bw.write(html);
	        bw2.write(html);
	        bw.close();
	        bw2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
