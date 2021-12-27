package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer("Java");// StringBuffer is synchronize
		for (int i = 0; i < 10000; i++) {
			sb.append("Hello");
		}
		System.out
				.println("The time of StringBuffer concating is: " + (System.currentTimeMillis() - startTime) + " ms");
		// Output: 2 ms

		startTime = System.currentTimeMillis();

		StringBuilder sb2 = new StringBuilder("Java");// StringBuilder is asynchronize, so it better than on performance
		for (int i = 0; i < 10000; i++) {
			sb.append("Hello");
		}
		System.out
				.println("The time of StringBuilder concating is: " + (System.currentTimeMillis() - startTime) + " ms");
		// Output 1 ms

	}

}
