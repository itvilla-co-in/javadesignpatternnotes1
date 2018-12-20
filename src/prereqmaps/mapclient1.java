package prereqmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapclient1 {

	 public static void main(String args[])
	   {
		 
		 
		 Map<Integer, String> myerrormap = new HashMap<>();
		 
		 myerrormap.put(100, "PAGE NOT FOUND");
		 myerrormap.put(200, "RESOUCE LOCKED");
		 myerrormap.put(300, "SLOW NETWORK");
		 myerrormap.put(400, "APLLICATION ERROR");
		  
		 System.out.println(myerrormap);
		 System.out.println("Size of my pas is ==== " + myerrormap.size());
		 
		 String mystatusdesc = myerrormap.get(200);
		 System.out.println("Description of 200 is : " + mystatusdesc);
		 
		 if (myerrormap.containsKey(300)) {
			    System.out.println("checking contains  = " + myerrormap.get(300));
			}
		 
		 if (myerrormap.containsValue("RESOUCE LOCKED")) {
			    System.out.println("RESOUCE LOCKED value found in map");
			}
		 
		 
		 System.out.println(" ******** REPLACING *********** ");
		 System.out.println("OLD MAP " + myerrormap.get(300));
		
		 myerrormap.replace(300, "REPLACE ERROR ");
		
		 System.out.println("Map after: " + myerrormap.get(300));
		 
		 Set<Integer> mymapcodes = myerrormap.keySet();
		 Iterator<Integer> iterator = mymapcodes.iterator();
		 
		 while (iterator.hasNext()) {
			    Integer mykey = iterator.next();
			    String myvalue = myerrormap.get(mykey);
			 
			    System.out.println(mykey + " ===== " + myvalue);
			}
		 
		 
		 
		 Collection<String> mymapvalues = myerrormap.values();
		 for (String errorvalues : mymapvalues) {
			    System.out.println(errorvalues);
			}
		 
		 
		 System.out.println("*****************************");
		 Set<Map.Entry<Integer, String>> mysetentiremap = myerrormap.entrySet();
		 
		 for (Map.Entry<Integer, String> entry : mysetentiremap) {
		     Integer mykey = entry.getKey();
		     String myvalue = entry.getValue();
		  
		     System.out.println(mykey + " ========> " + myvalue);
		 }
		 
		 
	   }
	
}
