package com.demo.demo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
   
{
   public static void main(String[] arg) {
	   WebDriver driver;
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
 
	   
   }}

