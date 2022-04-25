package com.jim_wilson.pluralsight.getting_started_with_java_2020.sec3.operator_precedence;

public class Main {
	public static void main(String[] args) {
		int val1 = 21;
		int val2 = 6;
		int val3 = 3;
		int val4 = 1;

		int result1 = val1 - val2 / val3;
		int result2 = (val1 - val2) / val3;
		int result3 = val1 / val3 * val4 + val2;
		int result4 = val1 /(val3 * (val4 + val2));

		System.out.println(
			"result1: " + result1 +
			" | result2: " + result2 +
			" | result3: " + result3 +
			" | result4: " + result4
		);
	}
}
