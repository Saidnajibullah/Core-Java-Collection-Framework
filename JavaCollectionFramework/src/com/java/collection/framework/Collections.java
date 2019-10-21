package com.java.collection.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {

// =======================  Lists  ============================//

		// Internal structure of ArrayList : [0][1][2][3][4][5][6]......
		// Internal structure of LinkedList :
		// [0]<-->[1]<-->[2]<-->[3]<-->[4]<-->[5]<-->[6]<-->......

		// Comparing ArrayList and LinkedList.
		// Since ArrayList stores inputs sequentially, adding new data at the beginning
		// or meddle of the list takes more time.
		// So, LinkedList has higher performance than the ArrayList.

		List<Integer> arralyList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		compareLists("ArrayList", arralyList);
		compareLists("LinkedList", linkedList);
		
		System.out.println("Maps Section\n");
		
		
		////to store unique custom objects as keys in a map they should have their equal and hashCode methods declared.
		// HashMap does not accept duplicate keys but can have duplicate values.
		// HashMap does not keep the order if their elements.
		//LinkedHashMap maintains the order of inputs the way they were added.
		//TreeMap sorts the keys in natural way, such as 1, 2, 3, ....
		
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> TreeMap = new TreeMap<>();
		maps(hashMap);
		System.out.println("HashMap ends...........................\n");
		maps(linkedHashMap);
		System.out.println("LinkedHashMap ends...........................\n");
		maps(TreeMap);
		System.out.println("TreeMap ends...........................\n");
		
		System.out.println("Sets Section\n");
		
		
		//Sets do not accept duplicate values.
		//Sets support the contain method which makes it very easy to look for a particular item.
		//to store unique custom objects in a set they should have their equal and hashCode methods declared.
		//HashSet does not maintain the order of items.
		Set<String> hashSet = new HashSet<>();
		
		//LinkedHashSet maintains the order of items.
		Set<String> linkedHashSet = new LinkedHashSet<>();
		
		//TreeSet orders items in natural way: 1, 2, 3, ...; alphabets in ascending.
		Set<String> treeSet = new TreeSet<>();
		sets(hashSet);
		System.out.println("HashSet ends...........................\n");
		sets(linkedHashSet);
		System.out.println("LinkedHashSet ends...........................\n");
		sets(treeSet);
		System.out.println("TreeSet ends...........................\n");

	}

	public static void compareLists(String description, List<Integer> list) {

		long startTime = System.currentTimeMillis();
		// Adding initial inputs.
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long endTime = System.currentTimeMillis();

		System.out.println(
				"Initial inputs taken time by " + description + " is " + (endTime - startTime) + " Milli Seconds\n");

		// Adding inputs at the end of the lists
		// Based on the results, LinkedList is a little faster than ArrayList

		long startTime1 = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long endTime1 = System.currentTimeMillis();

		System.out.println("Adding at the end taken time by " + description + " is " + (endTime1 - startTime1)
				+ " Milli Seconds\n");

		// Adding inputs at the beginning of the lists
		// Based on the results, LinkedList is much faster than ArrayList

		long startTime2 = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long endTime2 = System.currentTimeMillis();

		System.out.println("Adding at the beginnig taken time by " + description + " is " + (endTime2 - startTime2)
				+ " Milli Seconds\n");

		// Adding inputs at the middle of the lists
		// Based on the results, LinkedList is slower than ArrayList

		long startTime3 = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			list.add(list.size() - 1000, i);
		}

		long endTime3 = System.currentTimeMillis();

		System.out.println("Adding at the middle taken time by " + description + " is " + (endTime3 - startTime3)
				+ " Milli Seconds\n");

	}
	// ======================= Maps ============================//
	
	public static void maps(Map<Integer, String> map) {


		map.put(4, "Four");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(1, "One");
		map.put(5, "Five");

		
        //One way of iterating through map.
		System.out.println("One way of iterating through map\n");
		for (Entry<Integer, String> entry : map.entrySet()) {

			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);

		}
		
		
        //Another way of iterating through map.
		System.out.println("Another way of iterating through map\n");
		for (Integer key : map.keySet()) {
			
			String value = map.get(key);
			System.out.println(key + ": " + value);

		}
	}
	
	public static void sets(Set<String> set) {
		
		set.add("Cat");
		set.add("Dog");
		set.add("Lion");
		set.add("Tiger");
		set.add("Bear");
		System.out.println(set);
		
		//Iterating through sets
		System.out.println("One way of iterating through sets\n");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Another way of iterating through sets\n");
		for(String element: set) {
			System.out.println(element);
		}
	}

}
