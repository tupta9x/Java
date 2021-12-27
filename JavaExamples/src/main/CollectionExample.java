package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
	
	public void CollectionExample1() {
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("Angular");
		arrayList.add("ReactJS");
		arrayList.add("JavaScript");
		System.out.println("All elements of ArrayList: ");
		System.out.println("\t" + arrayList + "\n");

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Java");
		linkedList.add("Angular");
		linkedList.add("ReactJS");
		linkedList.add("JavaScript");
		System.out.println("All elements of LinkedList: ");
		System.out.println("\t" + linkedList + "\n");

		// new TreeSet() will order elements
		// Set does not duplicate
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Java");
		hashSet.add("Java");
		hashSet.add("Angular");
		hashSet.add("ReactJS");
		hashSet.add("JavaScript");
		System.out.println("All elements of HashSet: ");
		System.out.println("\t" + hashSet + "\n");

		// new TreeMet() will order elements depend on their key
		// Map does not duplicate
		// Map has a pair of key and value
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        System.out.println("All elements of HashMap:");
        System.out.print("\t" + hashMap);
	}
}
