package pippinLogin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pippinLoginClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Chrome Driver 90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    String baseUrl =  "https://demo.pippintitle.com/";
	   
	       
	    // Launch ChromeBrowser and direct it to the Base URL
	    driver.get(baseUrl);
	        
     	WebDriverWait wait = new WebDriverWait(driver, 100);
     	wait.until(ExpectedConditions.elementToBeClickable(By.id("Email_Address")));

       // Login using given credentials
	    WebElement username=driver.findElement(By.id("Email_Address"));
	    username.click();
	    username.sendKeys("pippintitle_demotest@mailinator.com");
	    WebElement password=driver.findElement(By.id("User_Password"));
	    password.click();   
	    password.sendKeys("DemoTest#567#");
	    WebElement login=driver.findElement(By.id("loginBtnLogin"));
	    login.click();
  
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    //1. Click on Place Order
	    WebDriverWait wait1 = new WebDriverWait(driver, 100);
	    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Place Order']")));
	    WebElement PlaceOrder=driver.findElement(By.xpath("//*[text()='Place Order']"));
	    PlaceOrder.click();
	    
	    //js.executeScript("window.scrollBy(0,200)", "");
	    
		//2. Select option 'Full Search'    
	    WebDriverWait wait2 = new WebDriverWait(driver, 90);
	    wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[1]/div/div/div[1]/div/mat-radio-group/mat-radio-button[7]/label/div[2]")));
	    WebElement FullSearch=driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[1]/div/div/div[1]/div/mat-radio-group/mat-radio-button[7]/label/div[2]"));
	    FullSearch.click();
	    
		js.executeScript("window.scrollBy(0,400)", "");
	    
		   
		   //3. Search Criteria
		  /* 
		   //Select option 'Full Address'
		   WebDriverWait wait3 = new WebDriverWait(driver, 100);
		   wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Full Address']")));
		   WebElement FullAddress=driver.findElement(By.xpath("//*[text()='Full Address']"));  		   
		   FullAddress.click();
		   */
		   // Enter Owner/Seller Name	 
		   WebDriverWait wait4 = new WebDriverWait(driver, 100);
		   wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[2]/div/div/div[1]/mat-form-field[1]/div/div[1]/div/input")));
		   WebElement OwnerSeller=driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[2]/div/div/div[1]/mat-form-field[1]/div/div[1]/div/input"));  		   
		   OwnerSeller.click();
		   OwnerSeller.sendKeys("Your Full Name");
		  
		   JavascriptExecutor js1 = (JavascriptExecutor) driver;
		   js1.executeScript("window.scrollBy(0,300)", "");   

		   //4. Enter Address - Auto Complete
		   WebDriverWait wait9 = new WebDriverWait(driver, 100);
		   wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[2]/div/div/div[2]/mat-form-field/div/div[1]/div[2]/input")));

		   WebElement EnterAddress=driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[2]/div/div/div[2]/mat-form-field/div/div[1]/div[2]/input"));
		   EnterAddress.click();   
		   EnterAddress.sendKeys("3485 Wineville");
		   EnterAddress.click();

		   Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   robot.mouseMove(325,398); // Navigating through mouse hover. Note that the coordinates might differ, kindly check the coordinates of x and y axis and update it accordingly.
		   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   js.executeScript("window.scrollBy(0,200)", "");
		   
		   //5. Click on Client Reference and Enter Name_Date
		   WebDriverWait wait5 = new WebDriverWait(driver, 100);
		   wait5.until(ExpectedConditions.elementToBeClickable(By.id("Property_Order_Number")));
		   WebElement ClientReference=driver.findElement(By.id("Property_Order_Number"));  		   
		   ClientReference.click();
		   ClientReference.sendKeys("Your Full Name_20_05_2021");
		   
		   //6. Click on Upload Documents
		   WebDriverWait wait6 = new WebDriverWait(driver, 100);
		   wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-actions/div/h-stack/div/button[2]")));
		   WebElement UploadDocuments = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-actions/div/h-stack/div/button[2]"));  		   
		   UploadDocuments.click();	
		  
		   //7. Upload 3 pdf files
		   
	        String filepath = "C:\\Screen\\";
	        String inputFilePath = "C:\\PDF\\";
	        Screen s = new Screen();
	        Pattern fileInputTextBox = new Pattern(filepath + "FileName.png");
	        Pattern openButton = new Pattern(filepath + "Open.png");
	       

	        try {
				s.wait(fileInputTextBox, 20);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				s.type(fileInputTextBox, inputFilePath + "1.pdf");
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				s.click(openButton);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	        //Wait till Upload
			WebDriverWait File1wait = new WebDriverWait(driver, 100);
			File1wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[4]/div/div/div/button/span/i")));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			   
			WebDriverWait wait11 = new WebDriverWait(driver, 100);
			wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-actions/div/h-stack/div/button[2]")));
			WebElement UploadDocuments2 = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-actions/div/h-stack/div/button[2]"));  		   
			UploadDocuments2.click();	

		   
	        try {
				s.wait(fileInputTextBox, 20);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				s.type(fileInputTextBox, inputFilePath + "2.pdf");
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				s.click(openButton);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	        //Wait till Upload
			//WebDriverWait File2wait = new WebDriverWait(driver, 100);
			//File2wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[4]/div/div/div[2]/button/span/i")));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebDriverWait wait12 = new WebDriverWait(driver, 100);
			wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-actions/div/h-stack/div/button[2]")));
			WebElement UploadDocuments3 = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-actions/div/h-stack/div/button[2]"));  		   
			UploadDocuments3.click();
			   
	        try {
				s.wait(fileInputTextBox, 20);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				s.type(fileInputTextBox, inputFilePath + "3.pdf");
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				s.click(openButton);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	        //Wait till Upload
			WebDriverWait File3wait = new WebDriverWait(driver, 100);
			File3wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[4]/div/div/div[3]/button/span/i")));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        
			   //8. Delete 2 files from the list
			   WebDriverWait DeteteBtn1Wait = new WebDriverWait(driver, 100);
			   DeteteBtn1Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[4]/div/div/div[1]/button/span/i")));
			   WebElement DeteteBtn1 = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[4]/div/div/div[1]/button/span/i"));  		   
			   DeteteBtn1.click();
			   
			  
			   
			   WebDriverWait ConfirmBtn1Wait = new WebDriverWait(driver, 100);
			   ConfirmBtn1Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-confirm/div/div/div[3]/div/div[2]/input")));			   
			   WebElement ConfirmBtn1 = driver.findElement(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-confirm/div/div/div[3]/div/div[2]/input"));  		   
			   ConfirmBtn1.click();
			   
			   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   
			   WebDriverWait DeteteBtn2Wait = new WebDriverWait(driver, 100);
			   DeteteBtn2Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[4]/div/div/div[2]/button/span/i")));
			   WebElement DeteteBtn2 = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-content[4]/div/div/div[2]/button/span/i"));  		   
			   DeteteBtn2.click();

			   WebDriverWait ConfirmBtn2Wait = new WebDriverWait(driver, 100);
			   ConfirmBtn2Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-confirm/div/div/div[3]/div/div[2]/input")));
			   WebElement ConfirmBtn2 = driver.findElement(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-confirm/div/div/div[3]/div/div[2]/input"));  		   
			   ConfirmBtn2.click();		
			   
			   //9.Click continue 
			   WebElement ContinueBtn = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order1/container/div/card/div/card-actions/div/h-stack/div/button[3]"));  		   
			   ContinueBtn.click();
			   
			   //10.Accept the terms and condition
			   WebDriverWait AcceptTermWait = new WebDriverWait(driver, 100);
			   AcceptTermWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order3/container/div/card/div/card-content[2]/div/h-stack/div/mat-checkbox/label/div")));

			   WebElement AcceptTermBtn = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order3/container/div/card/div/card-content[2]/div/h-stack/div/mat-checkbox/label/div"));  		   
			   AcceptTermBtn.click();

			   //11. Click submit to create the order
			   WebDriverWait SubmitBtnWait = new WebDriverWait(driver, 100);
			   SubmitBtnWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order3/container/div/card/div/card-actions/div/h-stack/div/button[2]")));

			   WebElement SubmitBtn = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-new-order3/container/div/card/div/card-actions/div/h-stack/div/button[2]"));  		   
			   SubmitBtn.click();
			   
			   //12. Click on the message button 
			   WebDriverWait MessageBtnWait = new WebDriverWait(driver, 100);
			   MessageBtnWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/flex/div/div/app-order-details/div[3]/div/div[2]/div/div[2]/input")));

			   WebElement MessageBtn = driver.findElement(By.xpath("/html/body/app-root/div/div/flex/div/div/app-order-details/div[3]/div/div[2]/div/div[2]/input"));  		   
			   MessageBtn.click();
			   
			   //13. Click on the message box and enter name, Order number current DateTime
			   
			   //Read Order Number
			   
			   String OrderNumberText = driver.findElement(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-message/div/div/div[2]/div/textarea")).getText();
			   
			   WebDriverWait MessageBoxWait = new WebDriverWait(driver, 100);
			   MessageBoxWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-message/div/div/div[2]/div/textarea")));

			   WebElement MessageBox = driver.findElement(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-message/div/div/div[2]/div/textarea"));  		   
			   MessageBox.click();
			   
			   // Create object of SimpleDateFormat class and decide the format
			   DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
			   
			   //get current date time with Date()
			   Date date = new Date();
			   
			   // Now format the date
			   String date1= dateFormat.format(date);
			   
			   MessageBox.sendKeys("Your Full Name "+OrderNumberText+ " "+date1);			   
			   
			   //14. Click on send button
			   WebElement SendBtn = driver.findElement(By.xpath("/html/body/dialog-holder/dialog-wrapper/div/app-message/div/div/div[3]/div[2]/input"));  		   
			   SendBtn.click();
			   
			   //15. Click on the down arrow mark in top right -> Menu will open
			   WebDriverWait ArrowBtnWait = new WebDriverWait(driver, 100);
			   ArrowBtnWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-header/div/div[2]/button/span/span")));

			   WebElement ArrowBtn = driver.findElement(By.xpath("/html/body/app-root/div/app-header/div/div[2]/button/span/span"));  		   
			   ArrowBtn.click();
			   
			   

			   //16. Click Logout
			   WebDriverWait LogoutBtnWait = new WebDriverWait(driver, 100);
			   LogoutBtnWait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div/button[4]")));

			   WebElement LogoutBtn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/button[4]"));  		   
			   LogoutBtn.click();
			   
			   
			   
	     //close Fire fox
	    //driver.close();

	            
	            
	}

}
