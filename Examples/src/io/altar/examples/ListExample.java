package io.altar.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ListExample {
//ver dentro da lista
	public static void main(String[] args) {
		
		List <String> listStrings = new ArrayList<>();
		listStrings.add("Ze carlos");
		listStrings.add("ze manel");

	for(String str:listStrings) { 
        System.out.println(str);  
     }  
//	Iterator<String> it = listStrings.iterator();	
//	while(it.hasNext()) {
//	String element = it.next();
//	System.out.println(element);
//	}
}

}
