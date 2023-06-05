package GFC_Maven.GFC_MAven;

import org.checkerframework.framework.qual.RequiresQualifier.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5_3 {
	
		public static void main(String[] args) 
		{
		
			WebDriverManager.chromedriver().setup();
			WebDriver dr=new ChromeDriver();

			dr.get("https://j2store.net/free/");
			dr.manage().window().maximize();
			dr.findElement(By.xpath("//*[@id=\'Mod112\']/div/div/ul/li[1]/h4/a")).click();
			java.util.List<WebElement> name=dr.findElements(By.className("product-title"));
			for(WebElement list:name)
			{
				System.out.print(list.getText()+",");
			}

		}

	}


