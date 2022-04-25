package com.jim_wilson.pluralsight.getting_started_with_java_2020.sec4.lets_get_logical;

public class Main {
	public static void main(String[] args) {
		int guests = 150;
		int rooms = 0;

		if(rooms != 0 && guests / rooms > 30) {
			System.out.println("crowded");
		}

		System.out.println("the end");
	}
}
