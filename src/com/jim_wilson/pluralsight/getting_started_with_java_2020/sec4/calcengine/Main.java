package com.jim_wilson.pluralsight.getting_started_with_java_2020.sec4.calcengine;

public class Main {
	public static void main(String[] args) {
		double val1 = 100.0d;
		double val2 = 0.0d;
		double result = 0.0d;
		char letter = 'd';

		/*
		if(letter == 'a') {
			result = val1 + val2;
		}else if(letter == 's') {
			result = val1 - val2;
		}else if(letter == 'm') {
			result = val1 * val2;
		}else if(letter == 'd') {
			if(val2 != 0) {
				result = val1 / val2;
			}
		}else {
			System.out.println("invalid code: " + letter);
			result = 0.0d;
		}
		*/

		switch(letter) {
			case 'a':
				result = val1 + val2;
				break;
			case 's':
				result = val1 - val2;
				break;
			case 'm':
				result = val1 * val2;
				break;
			case 'd':
				result = val2 != 0 ? val1 / val2 : 0.0d;
				break;
			default:
				System.out.println("invalid code: " + letter);
				result = 0.0d;
				break;
		}

		System.out.println("result: " + result);
	}
}
