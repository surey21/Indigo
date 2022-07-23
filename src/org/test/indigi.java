package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class indigi {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Indigo\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		driver.manage().window().maximize();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']"));
		int size = row.size();
		System.out.println(size);

		List<WebElement> cloumn = driver.findElements(By.xpath("//table[@class='table cb-srs-pnts']"));
		int clu = cloumn.size();
		System.out.println(clu);




	}



}
