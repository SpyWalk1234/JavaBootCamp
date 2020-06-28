package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Map;

public class MapActivity {

	static String temp = "My Testing";

	public static void main(String[] args) {
		// 1 - Type code to create a HashMap of key value pair
		// where key is id of type String and value is a name
		HashMap<String, String> mapNames = new HashMap<String, String>();

		mapNames.put("1", "Michael Scofield");
		mapNames.put("2", "Stanley Kubrick");
		mapNames.put("3", "Hanna Montana");
		mapNames.put("4", "Naruto Uzumaki");

		print(mapNames);

		// 2 - Call print method to print the map passed as its parameter.

		// 3 - Type code to print this map
	}

	static void print(HashMap<String, String> mapNames) {
		for (Map.Entry<String, String> entry : mapNames.entrySet()) {
			System.out.println("id: " + entry.getKey() + " name: " + entry.getValue());
		}
	}
}
