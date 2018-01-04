package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TablePaginationObjects extends MainObjects{
	private WebElement previousButton;
	private WebElement nextButton;
	private WebElement firstButton;
	private WebElement secondButton;
	private WebElement thirdButton;
	private WebElement firstButtonValidation;
	private WebElement secondButtonValidation;
	private WebElement thirdButtonValidation;
	
	
	private final String url="http://www.seleniumeasy.com/test/table-pagination-demo.html";
    protected RemoteWebDriver wb;

    public TablePaginationObjects(RemoteWebDriver wb) {
    	this.wb=wb;
    }
    public TablePaginationObjects openViaUrl() {
    	wb.get(this.url);
    	return this;
    }
    public TablePaginationObjects firstButtonClick() {
    	firstButton.click();
    	return this;
    }
    public TablePaginationObjects secondButtonClick() {
    	secondButton.click();
    	previousButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[1]/a"));
    	return this;
    }
    public TablePaginationObjects thirdButtonClick() {
    	thirdButton.click();
    	previousButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[1]/a"));
    	return this;
    }
    public TablePaginationObjects previousButtonClick() {
    	previousButton.click();
    	return this;
    }
    public TablePaginationObjects nextButtonClick() {
    	nextButton.click();
    	previousButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[1]/a"));
    	return this;
    }
    public WebElement getFirstButtonValidation() {
    	return firstButtonValidation;
    }
    public WebElement getSecondButtonValidation() {
    	return secondButtonValidation;
    }
    public WebElement getThirdButtonValidation() {
    	return thirdButtonValidation;
    }
    
    public TablePaginationObjects initElements(RemoteWebDriver wb){
    	//previousButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[1]/a"));
    	nextButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[5]/a"));
    	firstButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[2]/a"));
    	secondButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[3]/a"));
    	thirdButton=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[4]/a"));
    	firstButtonValidation=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[2]"));
    	secondButtonValidation=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[3]"));
    	thirdButtonValidation=wb.findElement(By.xpath("//*[@id=\"myPager\"]/li[4]"));
    	return this;
    }
}
