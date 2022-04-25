package com.jim_wilson.pluralsight.getting_started_with_java_2020.sec3.type_conversion;

public class Main {
	public static void main(String[] args) {
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;

		short result1 = byteVal;
		short result2 = (short) longVal;
		short result3 = (short) (byteVal - longVal);
		// long result4 = longVal - floatVal;
		float result4 = longVal - floatVal;

		System.out.println(
			"result1: " + result1 +
			" | result2: " + result2 +
			" | result3: " + result3 +
			" | result4: " + result4
		);
	}
}
