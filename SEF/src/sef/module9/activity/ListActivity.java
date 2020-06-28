package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		// 1 - Type code to create a list of names. Use ArrayList.
		List<String> listNames = new ArrayList<>();
		listNames.add("John Cena");
		listNames.add("Dwyane Johnson");
		listNames.add("Peter Parker");

		// 2 - Call print method to print the list passed as its parameter.
		print(listNames);
	// 3 - Type code to print this list
	// Notice the order in which elements get printed.
	}
	static void print(List<String> list) {
		for (String name : list) {
			System.out.println(name);
		}
		

	}
}
