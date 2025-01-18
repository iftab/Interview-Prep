package java8FeatureAndImplementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem1 {

	public static void main(String[] args) {
			List<String> string = Arrays.asList("Hello", "World","learning", "gcp","cloud","aws");
			List<Integer> listint =Arrays.asList(1,2,3,2,6,3,7,8,1);
			
			System.out.println("*** Using Stream API ***");
			System.out.println(usingStream(string));
			System.out.println("*** Without Stream API ***");
			System.out.println(withoutStream(string));
		    System.out.println("*** Find elements which are duplicate ***");
			System.out.println(getDuplicateElement(listint));
			
		}
		
	    // Find count number of element as per String length Using Stream API. 
		public static Map<Integer, Long> usingStream(List<String> inputList) {
			return inputList.stream().collect(Collectors.groupingBy(s->s.length(), Collectors.counting()));
		}
		
		// Find count number of element as per String length Using Traditional Method. 
		public static Map<Integer, Integer> withoutStream(List<String> inputList) {
			Map<Integer, Integer> result =  new HashMap<>();
			
			for(String s : inputList) {
				result.put(s.length(), result.getOrDefault(s.length(), 0) + 1);
			}
			
			return result;
		}
		
		// Find all duplicate elements 
		public static List<Integer> getDuplicateElement(List<Integer> input){
			 
			 return input.stream()
					 .collect(Collectors.groupingBy(i->i, Collectors.counting()))
					 .entrySet().stream()
					 .filter(entry -> entry.getValue() > 1)
					 .map(e->e.getKey())
					 .collect(Collectors.toList());
			 
		}

}
