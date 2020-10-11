package com.arrizaqu.test.teststring.utils;

public class MyUtils {
	
	//membuat data fibonachi
	public static int[] getFibonachi(int data) {
		
		int[] rs = new int[data];
		
		rs[0] = 1;
		rs[1] = 1;
		
		for(int i = 2; i < data; i++) {
			rs[i] = rs[i-1] + rs[i - 2];
		}
		
		return rs;
	}
	
	//membuat sorting data menggunakan method bubble sort
	public static int[] getBubbleSort(int[] arr) {
	    int n = arr.length;  
	    int temp = 0;  
	     for(int i=0; i < n; i++){  
             for(int j=1; j < (n-i); j++){  
                  if(arr[j-1] > arr[j]){  
                         //swap elements  
                         temp = arr[j-1];  
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
                 }  
                      
             }  
	     }  

		return arr;
	}
	
	public static char[] getCharArrayFromString(String data) {
		char[] rs = new char[data.length()];
		
		for (int i = 0; i < data.length(); i++) {
			rs[i] = data.charAt(i);
		}
		return rs;
	}
	
	public static int[] getCodeAsciiFromChar(char[] mychar) {
		int[] rs = new int[mychar.length];
		
		for (int i = 0; i < mychar.length; i++) {
			rs[i] = mychar[i];
		}
		
		return rs;
	}
	
	public static char[] getCharFromCodeAscii(int[] data) {
		char[] rs = new char[data.length];
		
		for (int i = 0; i < data.length; i++) {
			rs[i] = (char) data[i];
		}
		
		return rs;
	}
	
	

}
