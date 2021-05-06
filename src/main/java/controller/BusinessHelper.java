/**
 * @author Levi Shepherd - lshepherd2
 * CIS175 - Spring 2021
 * May 6, 2021
 */
package controller;

import java.util.ArrayList;
import java.util.List;

import model.Business;

public class BusinessHelper {

	private Business business;
	
	public List<Business> getBusinesses() {
		List<Business> allBusinesses = new ArrayList<>();
		
		Business a = new Business(1, "Victory Lane", "3801 Easton Blvd", "515-263-1811");
		Business b = new Business(2, "Now Or Later Restaurant", "3750 E University Ave", "515-266-9777");
		Business c = new Business(3, "Tequila Cantina", "2824 Easton Blvd", "515-262-4485");
		Business d = new Business(4, "East Side Eddies", "3517 E 26th St", "515-777-3401");
		Business e = new Business(5, "Champs Chicken", "1320 E Euclid Ave", "515-278-1657");
		Business f = new Business(6, "Pueblo Viejo", "3841 E 14th St", "515-265-1720");
		
		allBusinesses.add(a);
		allBusinesses.add(b);
		allBusinesses.add(c);
		allBusinesses.add(d);
		allBusinesses.add(e);
		allBusinesses.add(f);
		
		return allBusinesses;
	}
}
