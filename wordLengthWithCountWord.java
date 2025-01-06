package com.learning.web;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem {

	public static void main(String[] args) {
		List<String> string = Arrays.asList("Hello", "World","learning", "gcp","cloud","aws");
		
		System.out.println("----Using Stream API----");
		System.out.println(usingStream(string));
		System.out.println("----Without Stream API----");
		System.out.println(withoutStream(string));
		
	}
	
	public static Map<Integer, Long> usingStream(List<String> inputList) {
		return inputList.stream().collect(Collectors.groupingBy(s->s.length(), Collectors.counting()));
	}
	
	public static Map<Integer, Integer> withoutStream(List<String> inputList) {
		Map<Integer, Integer> result =  new HashMap<>();
		
		for(String s : inputList) {
			result.put(s.length(), result.getOrDefault(s.length(), 0) + 1);
		}
		
		return result;
	}

}
