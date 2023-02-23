package package1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sample1 {

	
	
//	@BeforeMethod
	public void BM(){
		System.out.println("Before Method");
	}
	
	@Test(dataProvider="GetData")
	public void LoginApplication1(String username1, String Password1, String ProductName1){
		
		System.out.println("************");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.manage().window().maximize();
		
		driver1.get("https://rahulshettyacademy.com/client/");
		
		driver1.findElement(By.id("userEmail")).sendKeys(username1);
		driver1.findElement(By.cssSelector("#userPassword")).sendKeys(Password1);
		driver1.findElement(By.id("login")).click();
		System.out.println(ProductName1);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] GetData() throws IOException{
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Downloads\\ExcelData.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		XSSFSheet Sheet=workbook.getSheet("LoginData");
		int rowsCount=Sheet.getPhysicalNumberOfRows();
		XSSFRow Row=Sheet.getRow(0);
		int columnCount=Row.getLastCellNum();
		
		Object[][] Data=new Object[rowsCount-1][columnCount];

		
		for(int i=0; i<rowsCount-1;i++){
			
			XSSFRow row1=Sheet.getRow(i+1);
			for(int j=0;j<columnCount;j++){
								
				Data[i][j]=row1.getCell(j);
				System.out.println(Data[i][j]);
				
				
			}
			
			
			
		}
				return Data;
	}
	



}
