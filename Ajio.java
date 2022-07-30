package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*	1. Launch the URL https://www.ajio.com/
					2. In the search box, type as "bags" and press enter
					3. To the left  of the screen under " Gender" click the "Men"
					4. Under "Category" click "Fashion Bags"
					5. Print the count of the items Found. 
					6. Get the list of brand of the products displayed in the page and print the list.
					7. Get the list of names of the bags and print it */
		//We have to call WDM for the browser driver!!


		WebDriverManager.edgedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.ajio.com/");

		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();

		WebElement total=driver.findElement(By.xpath("//div[@class='length']"));
		String search=total.getText();
		System.out.println("Total items found : "+search);

		List<WebElement> brand=driver.findElements(By.xpath("//div[@class='brand']"));
		Set<String> brandlist=new LinkedHashSet<String>();
		for(int i=0;i<brand.size();i++)
		{
			brandlist.add(brand.get(i).getText());
		}
		System.out.println("The Brands are ");
		for (String each : brandlist) {
			System.out.println(each);
		}

		List<WebElement> name=driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bagName=new ArrayList<String>();
		System.out.println("The Names of the bags are ");
		for(int j=0;j<name.size();j++)
		{
			bagName.add(name.get(j).getText());
			System.out.println(bagName.get(j));
		}

	}}