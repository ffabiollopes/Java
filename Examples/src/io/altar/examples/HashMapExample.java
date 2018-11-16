package io.altar.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
	Map<String, String> stringMap = new HashMap<String, String>();
		stringMap.put("1","Ze carlos");
		stringMap.put("2","ze manel");
		
  Iterator<String> stringIterator = stringMap.values().iterator();
  while (stringIterator.hasNext()) {
	  System.out.println(stringIterator.next());
	}
  Iterator<String> stringKeyIterator = stringMap.keySet().iterator();
  while (stringKeyIterator.hasNext()) {
	  System.out.println(stringKeyIterator.next());
  
	}
	}
}
