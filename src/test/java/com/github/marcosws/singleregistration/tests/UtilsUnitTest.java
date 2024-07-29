package com.github.marcosws.singleregistration.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;

import com.github.marcosws.singleregistration.core.Utils;

@TestMethodOrder(OrderAnnotation.class)
public class UtilsUnitTest {
	
	@Test
	@Order(1)
	public void testStringToBooleanWithValueS() {
		Boolean b = Utils.stringToBoolean("S");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertTrue(b);
	}
	
	@Test
	@Order(2)
	public void testStringToBooleanWithValueSim() {
		Boolean b = Utils.stringToBoolean("Sim");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertTrue(b);
	}
	
	@Test
	@Order(3)
	public void testStringToBooleanWithValueSIM() {
		Boolean b = Utils.stringToBoolean("SIM");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertTrue(b);
	}
	
	@Test
	@Order(4)
	public void testStringToBooleanWithValueTrue() {
		Boolean b = Utils.stringToBoolean("True");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertTrue(b);
	}
	
	@Test
	@Order(5)
	public void testStringToBooleanWithValueTRUE() {
		Boolean b = Utils.stringToBoolean("TRUE");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertTrue(b);
	}
	
	@Test
	@Order(6)
	public void testStringToBooleanWithValueY() {
		Boolean b = Utils.stringToBoolean("Y");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertTrue(b);
	}
	
	@Test
	@Order(7)
	public void testStringToBooleanWithValueYes() {
		Boolean b = Utils.stringToBoolean("Yes");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertTrue(b);
	}
	
	@Test
	@Order(8)
	public void testStringToBooleanWithValueN() {
		Boolean b = Utils.stringToBoolean("N");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertFalse(b);
	}
	
	@Test
	@Order(9)
	public void testStringToBooleanWithValueNao() {
		Boolean b = Utils.stringToBoolean("Não");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertFalse(b);
	}
	
	@Test
	@Order(10)
	public void testStringToBooleanWithValueNAO() {
		Boolean b = Utils.stringToBoolean("NAO");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertFalse(b);
	}
	
	@Test
	@Order(11)
	public void testStringToBooleanWithValueNO() {
		Boolean b = Utils.stringToBoolean("NO");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertFalse(b);
	}
	
	@Test
	@Order(12)
	public void testStringToBooleanWithValueFalse() {
		Boolean b = Utils.stringToBoolean("False");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertFalse(b);
	}
	
	@Test
	@Order(13)
	public void testStringToBooleanWithValueFALSE() {
		Boolean b = Utils.stringToBoolean("FALSE");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertFalse(b);
	}
	
	@Test
	@Order(14)
	public void testStringToBooleanWithValueAnyWord() {
		Boolean b = Utils.stringToBoolean("AnyWord");
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName()  + " : value: " + b);
		Assertions.assertFalse(b);
	}

}
