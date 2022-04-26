package com.pluralsight.jim_wilson.getting_started_with_java_2020.sec8;

import java.util.Scanner;

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

	private static char retrieveFirstLetter(String userInput) {
		return userInput.charAt(0);
	}

	private static double getNumberFromWord(String word) {
		double value = 0.0d;

		String[] numberWords = {
			"zero", "one",
			"two", "three",
			"four", "five",
			"six", "seven",
			"eight", "nine"
		};

		for(int i = 0; i < numberWords.length; i++) {
			if(word.equals(numberWords[i])) {
				value = i;

				break;
			}
		}

		return value;
	}

	private static char getMathOperatorFromLetter(char letter) {
		char[] letters = { 'a', 's', 'm', 'd' };

		char[] mathOperators = { '+', '-', '*', '/' };

		char symbol = ' ';

		for(int i = 0; i < letters.length; i++) {
			if(letter == letters[i]) {
				symbol = mathOperators[i];

				break;
			}
		}

		return symbol;
	}

	private static void processUserInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a math operator & 2 numbers (in words, separated by spaces): ");

		String userInput = sc.nextLine();

		String[] individualParts = userInput.split(" ");

		processUserInputParts(individualParts);

		sc.close();
	}

	private static void displayResult(
		char letter,
		double leftVal,
		double rightVal,
		double result
	) {
		char symbol = getMathOperatorFromLetter(letter);

		String output = String.format("%.2f %c %.2f = %.2f", leftVal, symbol, rightVal, result);

		System.out.println("=> " + output);
	}

	private static void processUserInputParts(String[] parts) {
		char letter = retrieveFirstLetter(parts[0]);

		double leftVal = getNumberFromWord(parts[1]);

		double rightVal = getNumberFromWord(parts[2]);

		double result = execute(letter, leftVal, rightVal);

		displayResult(letter, leftVal, rightVal, result);
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
		}else if(args.length == 1 && args[0].equals("interactive")) {
			processUserInput();
		}else if(args.length == 3) {
			handleCmdLine(args);
		}else {
			System.out.println("plz provide a math operator & 2 numbers");
		}
	}
}
