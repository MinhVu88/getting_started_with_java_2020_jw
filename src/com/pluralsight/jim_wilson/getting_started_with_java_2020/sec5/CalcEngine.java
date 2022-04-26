package com.pluralsight.jim_wilson.getting_started_with_java_2020.sec5;

public class CalcEngine {
	public static void main(String[] args) {
		double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] letters = { 'd', 'a', 's', 'm' };
		double[] results = new double[letters.length];

		for(int i = 0; i < letters.length; i++) {
			switch(letters[i]) {
				case 'a':
					results[i] = leftVals[i] + rightVals[i];
					break;
				case 's':
					results[i] = leftVals[i] - rightVals[i];
					break;
				case 'm':
					results[i] = leftVals[i] * rightVals[i];
					break;
				case 'd':
					results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.0d;
					break;
				default:
					System.out.println("invalid code: " + letters[i]);
					results[i] = 0.0d;
					break;
			}
		}

		for(double result : results) {
			System.out.println("result: " + result);
		}
	}
}
