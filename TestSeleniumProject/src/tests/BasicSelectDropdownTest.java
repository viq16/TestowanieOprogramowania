package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import pageObject.BasicSelectDropdownObject;
import pageObject.JQueryDropdownObjects;

public class BasicSelectDropdownTest {
	private RemoteWebDriver wb;
	private BasicSelectDropdownObject rbp;

	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Erazer\\Desktop\\Selenium\\chromedriver.exe");
		wb = new ChromeDriver();
        wb.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(1000);
	}
	@Test
	public void selectFileTest() throws Exception{
		rbp = new BasicSelectDropdownObject(wb);
		rbp.openViaUrl();
		rbp.initElements(wb);
		rbp.selectDaySelect();
		
		Assert.assertEquals("Day selected :- Saturday", rbp.getDayValidation().getText());
	}
	@Test
	public void selectMultiTest() throws Exception{
		rbp = new BasicSelectDropdownObject(wb);
		rbp.openViaUrl();
		rbp.initElements(wb);
		rbp.selectMultiSelect();
		rbp.getOneSelectedClick();
		Assert.assertEquals("First selected is : Ohio", rbp.getSelectedValidation().getText());
		Thread.sleep(3000);
		rbp.getAllSelectedClick();
		Assert.assertEquals("Options selected are : Ohio,Florida", rbp.getSelectedValidation().getText());
	}
	@After
    public void tearDown() throws Exception {
    	Thread.sleep(3000);
        wb.close();
        wb.quit();
    }
}
