package SeleniumOperaciones;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	protected WebDriver driver;
	String Message;
	
	protected void chromeConnection() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Chrome/chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void Input(String inputText, By locator) {
		driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE),inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public String getText(By locator) {
		Message = driver.findElement(locator).getText();
		return Message;

	}
	
	public void ListaBox(int index,By locator) {
		WebElement element=driver.findElement(locator);
        Select sel=new Select(element);
        sel.selectByIndex(index); 	    
	}
	
	public Boolean isDisplayed(By locator) {
		Boolean visible = null;
		try {
			visible = driver.findElement(locator).isDisplayed();
			
		}catch(Exception e) {
			visible = false;
		}
		return visible;
	}
	
	public WebElement Iframe(By locator) {
		WebElement frameID = driver.findElement(locator);
		driver.switchTo().frame(frameID);
		return frameID;
	}
	
	public void DataList(By locator, By LocatorList) {
		WebElement input = driver.findElement(locator);
		WebElement option = driver.findElement(LocatorList);
		String value = option.getAttribute("value");
		input.clear();
		input.sendKeys(value);
	}
	

}
