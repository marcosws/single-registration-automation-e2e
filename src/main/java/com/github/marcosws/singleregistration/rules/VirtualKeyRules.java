package com.github.marcosws.singleregistration.rules;

import org.junit.Assert;

import com.github.marcosws.singleregistration.page.VirtualKeyPage;

public class VirtualKeyRules {
	
	VirtualKeyPage virtualKeyPage = new VirtualKeyPage();
	
	public VirtualKeyRules waitVirtualKeyPage() {
		virtualKeyPage.waitH1TitleVirtualKey();
		return this;
	}
	
	public VirtualKeyRules clickGeneratePassword() {
		virtualKeyPage.clickButtonGeneratePassword();
		return this;
	}
	public VirtualKeyRules getPasswordAndEnterVirtualKey() {
		
		String password = virtualKeyPage.getTextInputTextPassword();
		String textButtonOne = virtualKeyPage.getTextButtonKeyOne();
		String textButtonTwo = virtualKeyPage.getTextButtonKeyTwo();
		String textButtonThree = virtualKeyPage.getTextButtonKeyThree();
		String textButtonFour = virtualKeyPage.getTextButtonKeyFour();
		String textButtonFive = virtualKeyPage.getTextButtonKeyFive();
		
		for(Character c: password.toCharArray()) {
			
			if(textButtonOne.contains(c.toString()))
				virtualKeyPage.clickButtonKeyOne();
			else if(textButtonTwo.contains(c.toString()))
				virtualKeyPage.clickButtonKeyTwo();
			else if(textButtonThree.contains(c.toString()))
				virtualKeyPage.clickButtonKeyThree();
			else if(textButtonFour.contains(c.toString()))
				virtualKeyPage.clickButtonKeyFour();
			else if(textButtonFive.contains(c.toString()))
				virtualKeyPage.clickButtonKeyFive();
			
		}
		return this;

	}
	public VirtualKeyRules clickKeyEnter() {
		virtualKeyPage.clickButtonKeyEnter();
		return this;
	}
	
	public VirtualKeyRules validateMessageAccessAllowed() {
		String expected = "Acesso permitido!";
		String actual = virtualKeyPage.getTextMessageBox();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	
	public VirtualKeyRules validateMessageAccessDenied() {
		String expected = "Acesso negado!";
		String actual = virtualKeyPage.getTextMessageBox();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
}
