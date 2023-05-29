package DDT_Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.examples.xssf.usermodel.CreateCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Multiple_Data {

	public static void main(String[] args)throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./Excel/Testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.flipkart.com");
	    List<WebElement> all_links;
		List<WebElement> count=all_links.size();
	   
	     for(int i=0; i<count; i++)
	     {
	    	 Row r = sh.createRow(i);
	    	 Cell c = r.createCell(0);
	    	 String value = all_links.getAttribute("href");
	    	 c.setCellValue(value);
	    	 
	     }
	     FileOutputStream fos = new FileOutputStream("./Excel/Testdata.xlsx");
	     book.write(fos);
	     
	  	}

}


	
