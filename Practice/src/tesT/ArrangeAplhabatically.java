package tesT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrangeAplhabatically{

	public static void displayListing() {
		
		System.out.println("Calling displayListing()");
		// TODO Auto-generated method stub

		System.out.println("----------------------------------");
		List<String> listOfCountryNames=new ArrayList<String>(); 
		
		listOfCountryNames.add("India");
		listOfCountryNames.add("China");
		listOfCountryNames.add("Srilanka");
		listOfCountryNames.add("NewZealand");
		
		Collections.sort(listOfCountryNames);
		
		Iterator<String> itr=listOfCountryNames.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
