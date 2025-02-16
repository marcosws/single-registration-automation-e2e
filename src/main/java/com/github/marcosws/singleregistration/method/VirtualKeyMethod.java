package com.github.marcosws.singleregistration.method;

import org.junit.Assert;

import com.github.marcosws.singleregistration.page.VirtualKeyPage;

public class VirtualKeyMethod {
	
	VirtualKeyPage virtualKeyPage = new VirtualKeyPage();
	
	public VirtualKeyMethod waitVirtualKeyPage() {
		virtualKeyPage.waitH1TitleVirtualKey();
		return this;
	}
	
	public VirtualKeyMethod clickGeneratePassword() {
		virtualKeyPage.clickButtonGeneratePassword();
		return this;
	}
	public VirtualKeyMethod getPasswordAndEnterVirtualKey() {
		
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
	public VirtualKeyMethod clickKeyEnter() {
		virtualKeyPage.clickButtonKeyEnter();
		return this;
	}
	
	public VirtualKeyMethod validateMessageAccessAllowed() {
		String expected = "Acesso permitido!";
		String actual = virtualKeyPage.getTextMessageBox();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	
	public VirtualKeyMethod validateMessageAccessDenied() {
		String expected = "Acesso negado!";
		String actual = virtualKeyPage.getTextMessageBox();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
}
