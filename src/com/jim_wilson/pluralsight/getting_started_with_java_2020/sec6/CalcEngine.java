package com.jim_wilson.pluralsight.getting_started_with_java_2020.sec6;

public class CalcEngine {
	private static double execute(char letter, double leftVal, double rightVal) {
		double result;

		switch(letter) {
			case 'a':
				result = leftVal + rightVal;
				break;
			case 's':
				result = leftVal - rightVal;
				break;
			case 'm':
				result = leftVal * rightVal;
				break;
			case 'd':
				result = rightVal != 0 ? leftVal / rightVal : 0.0d;
				break;
			default:
				System.out.println("invalid code: " + letter);
				result = 0.0d;
				break;
		}

		return result;
	}

	private static void handleCmdLine(String[] args) {
		char letter = args[0].charAt(0);

		double leftVal = Double.parseDouble(args[1]);

		double rightVal = Double.parseDouble(args[2]);

		double result = execute(letter, leftVal, rightVal);

		System.out.println("result: " + result);
	}

	public static void main(String[] args) {
		double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] letters = { 'd', 'a', 's', 'm' };
		double[] results = new double[letters.length];

		if(args.length == 0) {
			for(int i = 0; i < letters.length; i++) {
				results[i] = execute(letters[i], leftVals[i], rightVals[i]);
			}

			for(double result : results) {
				System.out.println("result: " + result);
			}
		}else if(args.length == 3) {
			handleCmdLine(args);
		}else {
			System.out.println("plz provide a letter & 2 numbers");
		}
	}
}
