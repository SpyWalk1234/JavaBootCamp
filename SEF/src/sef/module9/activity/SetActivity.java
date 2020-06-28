package sef.module9.activity;

import java.util.Collection;
import java.util.HashSet;
//Needs to be completed
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		Set<String>stringSet = new HashSet<String>();
		stringSet.add("Jacob Masters");
		stringSet.add("Tommy Jarvis");
		stringSet.add("Itachi Uchiha");
		stringSet.add("Jacob Masters");
		//2 - Call print method to print the set passed as its parameter.
		print(stringSet);
	}
	
	static void print(Set set)
	{
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		for (Object s : set) {
		    System.out.println(s);
		}
	}
}
