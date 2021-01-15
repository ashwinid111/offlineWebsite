package com.repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPageObjectRepository {
	@FindBy(xpath ="//th")
	public List<WebElement> titleList;
	
	@FindBy(xpath ="//td[5]")
	public List<WebElement> row5;
	
	@FindBy(xpath ="//td[6]")
	public List<WebElement> row6;
	
	@FindBy(xpath ="//small/following::a[3]")
	public WebElement window1;
	
	@FindBy(xpath ="//td[2]")
	public List<WebElement> window2;
}
