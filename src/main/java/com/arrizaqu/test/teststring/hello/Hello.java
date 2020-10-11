package com.arrizaqu.test.teststring.hello;

import java.util.Arrays;

import com.arrizaqu.test.teststring.utils.MyUtils;

public class Hello {
	
	public static void main(String[] args) {
		//test fibonachi
		//fibTest();
		//string to array
		//stringToArray();
		//getshort with bubble short
		//callBubble();
		//test 1
		test1();
	}
	
	public static void fibTest() {
		int data = 9;
	}
	
	public static void stringToArray() {
		String text = "Indonesia merdeka";
		char[] dataChar = MyUtils.getCharArrayFromString(text);
		System.out.println(Arrays.toString(dataChar));
		int[] dataAscii = MyUtils.getCodeAsciiFromChar(dataChar);
		System.out.println(Arrays.toString(dataAscii));
		char[] dataOrigin = MyUtils.getCharFromCodeAscii(dataAscii);
		System.out.println(Arrays.toString(dataOrigin));
	}
	
	public static void callBubble() {
		int[] data = new int[] {1,2,3,8,6,3,5,5,2,8,4};
		System.out.println(Arrays.toString(MyUtils.getBubbleSort(data)));
	}
	
	public static void test1() {
		//shorting from text indonesia
		/*
		 * 1. convert string char to code ascii
		 * 2. short asc
		 * 3. convert ascii to string 
		 * */
		String text = "INDONESIAaA";
		text = text.toUpperCase();
		char[] dataChar = MyUtils.getCharArrayFromString(text);
		int[] dataAscii = MyUtils.getCodeAsciiFromChar(dataChar);
		int[] dataSort = MyUtils.getBubbleSort(dataAscii);
		char[] dataFinalChar = MyUtils.getCharFromCodeAscii(dataSort);
		System.out.println(Arrays.toString(dataFinalChar));
	}
	

}
