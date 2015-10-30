package CityPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConnectPage {
	
	By connectButton = By.xpath("html/body/div[1]/div/div/div[1]/div/ul/li[4]/a");
	By dropdown = By.xpath("html/body/div[1]/div/div/div[1]/div/ul/li[4]/div");
	By signIn = By.xpath("html/body/div[1]/div/div/div[1]/div/ul/li[4]/div/span[1]");
	By signUp = By.xpath("html/body/div[1]/div/div/div[1]/div/ul/li[4]/div/span[2]");
	
	WebDriver driver;
	
	public ConnectPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickConnect(){
		driver.findElement(connectButton).click();
	}
	
	public void clickSignIn(){
		driver.findElement(signIn).click();
	}
	
	public void clickSignUp(){
		driver.findElement(signUp).click();
	}
	
	public boolean dropdownVis(){
		return driver.findElement(dropdown).isDisplayed();
	}
	
	public void AccesstoSignIn(){
		this.clickConnect();
		if(this.dropdownVis()){
			this.clickSignIn();
		}
	
	}

}
