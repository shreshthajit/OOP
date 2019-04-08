 

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Tree_map_and_Hash_map{
	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(5, "A");
		hMap.put(11, "C");
		hMap.put(4, "Z");
		hMap.put(77, "Y");
		hMap.put(9, "P");
		hMap.put(66, "Q");
		hMap.put(0, "R");
		Map<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(5, "A");
		tMap.put(11, "C");
		tMap.put(4, "Z");
		tMap.put(77, "Y");
		tMap.put(9, "P");
		tMap.put(66, "Q");
		tMap.put(0, "R");
		System.out.println("HashMap iteration order =======");
		for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("\nTreeMap iteration order =======");
		for (Map.Entry<Integer, String> entry : tMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
 
