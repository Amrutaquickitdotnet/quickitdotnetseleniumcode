package com.testngtest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_001 {
	
	@Test
	public void teaPreparation() {
		
		System.out.println("Actual Prpearion of Tea");
	}

	@BeforeTest
	public void setUp() {
		System.out.println("Gathering all ingredients");
	}
	
	@AfterTest
	public void serve() {
		System.out.println("Serving tea to guest");
	}
}
