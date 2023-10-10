package seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectRepository {

	
		
		WebDriver driver;
		
		 @FindBy(xpath = "/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]")
		 @CacheLookup
		 WebElement loginbtn;
		 
		 @FindBy(id = "mat-input-0")
		 @CacheLookup
		 WebElement username;
		 
		 @FindBy(id = "mat-input-1")
		 @CacheLookup
		 WebElement password;
		 
		 @FindBy(xpath ="/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-card-actions/button" )
		 @CacheLookup
		 WebElement LoginBTn;

		 @FindBy(css = "body > app-root > app-nav-bar > mat-toolbar > mat-toolbar-row > div:nth-child(3) > button.mat-focus-indicator.mat-menu-trigger.mat-button.mat-button-base.ng-star-inserted > span.mat-button-wrapper > mat-icon:nth-child(2)")
		 @CacheLookup
		 WebElement DownDrag;
		 
		 @FindBy(xpath ="//*[@id=\"mat-menu-panel-1\"]/div/button[2]")
		 @CacheLookup
		 WebElement LoghOut;
		 
		 @FindBy(xpath = "/html/body/app-root/div/app-home/div/div[2]/div/div[1]/app-book-card/mat-card/mat-card-content[2]/app-addtocart/button")
		 @CacheLookup
		 WebElement AddtocartFIRSt;
		 
		 @FindBy(xpath = "/html/body/app-root/div/app-home/div/div[2]/div/div[10]/app-book-card/mat-card/mat-card-content[2]/app-addtocart/button")
		 @CacheLookup
		 WebElement	AddtocartSECOND;
		 
		@FindBy(css = "body > app-root > app-nav-bar > mat-toolbar > mat-toolbar-row > div:nth-child(3) > button.mat-focus-indicator.mat-icon-button.mat-button-base > span.mat-button-wrapper > mat-icon")
		@CacheLookup
		WebElement ShoppingCart;
		
		
		 @FindBy(xpath = "/html/body/app-root/div/app-shoppingcart/div/div/div/div/button")
		 @CacheLookup
		 WebElement RemoveItems;
		 
		 @FindBy(xpath = "/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-nav-list/mat-list-item[2]")
		 @CacheLookup
		 WebElement Biography;
		 
		 @FindBy(xpath = "/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-nav-list/mat-list-item[3]/div")
		 @CacheLookup
		 WebElement Fiction;
		 
		 @FindBy(xpath ="/html/body/app-root/div/app-home/div/div[1]/div/app-book-filter/mat-nav-list/mat-list-item[5]" )
		 @CacheLookup
		 WebElement Fantasy;
		 
		 @FindBy(css = "body > app-root > app-nav-bar > mat-toolbar > mat-toolbar-row > div:nth-child(3) > app-theme-picker > button > span.mat-button-wrapper > mat-icon")
		 @CacheLookup
		 WebElement BackgroundFilter;
		
		 @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[4]")
		 @CacheLookup
		 WebElement ChangeTheme;
		
		 @FindBy(xpath = "/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]/span[1]/mat-icon")
		 @CacheLookup
		 WebElement checkCart;
		 @FindBy(xpath = "/html/body/app-root/div/app-shoppingcart/div/mat-card/table/tfoot/tr/mat-card-content/th[5]/button")
		 @CacheLookup
		 WebElement Checkout;
		 
		 @FindBy(xpath = "//*[@id=\"mat-input-15\"]")
		 @CacheLookup
		 WebElement enetrName; 
		 @FindBy(xpath = "//*[@id=\"mat-input-16\"]")
		 @CacheLookup
		 WebElement Addone ;
		 @FindBy(xpath = "/html/body/app-root/div/app-checkout/div/div[2]/div[1]/mat-card/mat-card-content/form/mat-form-field[3]/div/div[1]/div")
		 @CacheLookup
		 WebElement AddSec;
		 
		 @FindBy(xpath = "//*[@id=\"mat-input-18\"]")
		 @CacheLookup
		 WebElement pincode ;
		 
		 @FindBy(xpath = "//*[@id=\"mat-input-19\"]")
		 @CacheLookup
		 WebElement StateName;
		 
		 
		 
		 public void loginbtn()
		 {
			 loginbtn.click();
		 }
		 
		 public void enterusername(String un)
		 {
			 username.sendKeys(un);
		 }
		 
		 public void enterPassword(String pwd)
			{
				password.sendKeys(pwd);
			}
			
		
		public void LoginBTn()
		{
			 LoginBTn.click();
			
		}
		
		public void DownDrag() 
		{
			DownDrag.click();
		}
		
	    public void LoghOut()
	    {
	    	LoghOut.click();
	    }
	    
		 
	    public void AddtocartFIRSt()
	    {
	    	AddtocartFIRSt.click();
	    }
	    
	    public void AddtocartSECOND()
	    {
	    	AddtocartSECOND.click();
	    }
	    public void ShoppingCart()
	    {
	    	ShoppingCart.click();
	    }
	    public void RemoveItems()
	    {
	    	RemoveItems.click();
	    }
	    public void Biography()
	    {
	    	Biography.click();
	    }
	    public void Fiction()
	    {
	    	Fiction.click();
	    }
	    public void Fantasy()
	    {
	    	Fantasy.click();
	    }
	    public void BackgroundFilter()
	    {
	    	BackgroundFilter.click();
	    }
	    public void ChangeTheme()
	    {
	    	ChangeTheme.click();
	    }
	    
	    public void checkCart()
	    {
	    	checkCart.click();
	    }
	    
	    public void Checkout()
	    {
	    	Checkout.click();
	    }
	  public void EnterName(String nam)
	  {
	    enetrName.sendKeys(nam);
	  }
	  
	  public void Addone(String addres)
	  {
	    Addone.sendKeys(addres);
	  }

	  
	    public void StateName(String ma)
	  {
	    StateName.sendKeys(ma);
	  }	

		
	}
		 
		 