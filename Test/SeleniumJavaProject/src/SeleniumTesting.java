import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	static final int totalTestCases = 5;

	static File file = new File("chromedriver.exe");
	static String location = file.getAbsolutePath();
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver",location);
		WebDriver driver= new ChromeDriver();
		
		for(int currentTestCase = 0; currentTestCase < totalTestCases; currentTestCase++) {
			GenerateTestCase(currentTestCase,driver);
		}
		
	}

	private static void GenerateTestCase(int currentTestCase, WebDriver driver) {
		
		switch (currentTestCase) {
		  case 1:
		    TestCaseOne(driver);
		    break;
		  case 2:
			TestCaseTwo(driver);
		    break;
		  case 3:
			TestCaseThree(driver);
		    break;
		  case 4:
			TestCaseFour(driver);
		    break;
		  case 5:
		    TestCaseFive(driver);
		    break;
		
		}
		
	}

	private static void TestCaseFive(WebDriver driver) {
		driver.get("http://localhost:8080/enterCreditScore");
		
		driver.findElement(By.name("creditScore")).sendKeys("450");
		driver.findElement(By.name("nationalId")).sendKeys("6");
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("creditScore")).sendKeys("1500");
		driver.findElement(By.name("nationalId")).sendKeys("6");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://localhost:8080/home");
		driver.findElement(By.name("fullName")).sendKeys("Sabri Sarioglu");
		driver.findElement(By.name("phoneNumber")).sendKeys("+905337123217");
		driver.findElement(By.name("income")).sendKeys("5009");
		driver.findElement(By.name("nationalId")).sendKeys("1");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void TestCaseFour(WebDriver driver) {
		driver.get("http://localhost:8080/enterCreditScore");
		
		driver.findElement(By.name("creditScore")).sendKeys("1500");
		driver.findElement(By.name("nationalId")).sendKeys("4");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://localhost:8080/home");
		driver.findElement(By.name("fullName")).sendKeys("Nihat Kahveci");
		driver.findElement(By.name("phoneNumber")).sendKeys("+905337123217");
		driver.findElement(By.name("income")).sendKeys("10000000000");
		driver.findElement(By.name("nationalId")).sendKeys("4");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void TestCaseThree(WebDriver driver) {
		driver.get("http://localhost:8080/enterCreditScore");
		
		driver.findElement(By.name("creditScore")).sendKeys("700");
		driver.findElement(By.name("nationalId")).sendKeys("3");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("http://localhost:8080/home");
		driver.findElement(By.name("fullName")).sendKeys("Semih Senturk");
		driver.findElement(By.name("phoneNumber")).sendKeys("+905337123217");
		driver.findElement(By.name("income")).sendKeys("10000");
		driver.findElement(By.name("nationalId")).sendKeys("3");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void TestCaseTwo(WebDriver driver) {
		driver.get("http://localhost:8080/enterCreditScore");
		
		driver.findElement(By.name("creditScore")).sendKeys("501");
		driver.findElement(By.name("nationalId")).sendKeys("2");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("http://localhost:8080/home");
		driver.findElement(By.name("fullName")).sendKeys("Hamit Altintop");
		driver.findElement(By.name("phoneNumber")).sendKeys("+905337123217");
		driver.findElement(By.name("income")).sendKeys("4000");
		driver.findElement(By.name("nationalId")).sendKeys("2");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void TestCaseOne(WebDriver driver) {
		
		driver.get("http://localhost:8080/enterCreditScore");
		
		driver.findElement(By.name("creditScore")).sendKeys("450");
		driver.findElement(By.name("nationalId")).sendKeys("1");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.get("http://localhost:8080/home");
		driver.findElement(By.name("fullName")).sendKeys("Ahmet Sapan");
		driver.findElement(By.name("phoneNumber")).sendKeys("+905337123217");
		driver.findElement(By.name("income")).sendKeys("500");
		driver.findElement(By.name("nationalId")).sendKeys("1");
		
		driver.findElement(By.name("submit")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	

}
