package project.classes;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    
    public final static String URL_SAUCEDEMO = "https://www.saucedemo.com/";

    public final static String URL_GET_DEP = "https://www.mercadolibre.com.ar/menu/departments";

    //Actual date
    public static String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //Take Screenshots
    public static void takingScreenshot(WebDriver driver, String screenshotName) throws IOException{
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("./screenshots/"+ "Error_"+ screenshotName+"_"+getDate() + ".png"));
    }

    
}
