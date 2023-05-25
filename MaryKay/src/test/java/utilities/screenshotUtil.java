package utilities;

import java.io.File;
import java.io.IOException;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.Base;

public class screenshotUtil extends Base{

	public void getScreenshot() throws IOException {
		    Date currentdate = new Date();
		    String screenshotfilename = currentdate.toLocaleString().replace("/", "-").replace(":", "-");
	        System.out.println(screenshotfilename);
	        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir")+"/screenshot/"+screenshotfilename+".png"));
	        
	}
}  														
