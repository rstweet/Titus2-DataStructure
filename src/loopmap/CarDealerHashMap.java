package loopmap;

import java.util.HashMap; // import the HashMap class
import java.util.Scanner;

public class CarDealerHashMap {

	public static void main(String[] args) {
		// Create a HashMap object called vehicleList
		HashMap<String, String> vehicleList = new HashMap<String, String>();

		String model;
		String make;

		Scanner scan = new Scanner(System.in);

		// Add keys and values (model, make)
		vehicleList.put("civic", "honda");
		vehicleList.put("crv", "honda");
		vehicleList.put("corola", "toyota");
		vehicleList.put("camery", "toyota");
		vehicleList.put("cx9", "mazda");
		vehicleList.put("cx3", "mazda");

		// System.out.println(vehicleList);
		System.out.println("Below is our invertry list:");

		for (String i : vehicleList.keySet()) {
			System.out.println("Model: " + i + " Make: " + vehicleList.get(i));
		}

		System.out.println("Enter any Model: ");
		model = scan.nextLine();

		// closing the scanner
		scan.close();
        // getting vehicle make from hashmap vehiclelist
		make = vehicleList.get(model);

		// to debug make and model if printing the list
		// System.out.println("The make for model:" + model + " is " + make);
		System.out.println(
				"Oh, you're looking for a " + model + " ?" + " Our " + make + " selection is right over here...");

		// loop to get all vehicles of that make.
		for (String j : vehicleList.keySet()) {
			if (vehicleList.get(j) == make)
				System.out.println(j);

		}

	}
}
