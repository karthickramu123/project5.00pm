package org.page;
import org.openqa.selenium.WebDriver;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	 public LoginPage() {
		 super();
			System.out.println("calling constructor pom launch");
			PageFactory.initElements(driver, this);
		}
	 @FindBy (name="login")
	 private WebElement txtusername;
	
	 @FindBy (id="pass")
	private WebElement txtpassword;
	
	
	public WebElement getTxtusername() {
		return txtusername;
	}




	public WebElement getTxtpassword() {
		return txtpassword;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("karthi");
System.out.println("ranjith");

	}

}
