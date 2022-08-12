package com.lti.stringarrays;

import java.util.Arrays;

public class CharArrayFromString {

	public static void main(String[] args) {
		//int num[] = {12, 5, 6};
		//for(int i = 0; i < num.length; i++) {
		//	System.out.println(num[i]);
		//}
		
		//for(int k:num) {
		//	System.out.println(k);
		//}
		
		
		String[] cityName = {"Pune", "Mumbai", "Chennai", "Delhi"};
		
		Arrays.sort(cityName);
		for(String city: cityName) {
			System.out.println(city);
		}
		
		
	}

}
