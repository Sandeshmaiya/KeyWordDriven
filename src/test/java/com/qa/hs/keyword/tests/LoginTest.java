package com.qa.hs.keyword.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeywordEngine;

public class LoginTest {
	public KeywordEngine keywordEngine ;
	
	@Test
	public void loginTestScenario() {
		keywordEngine = new KeywordEngine();
		keywordEngine.startExecution("loginSheet");
		
	}

}
