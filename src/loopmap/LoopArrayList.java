package loopmap;

import java.util.*;

public class LoopArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> numbs = new ArrayList<Integer>();

		Scanner userInput = new Scanner(System.in);
		int i = 0;
		int mynumb;
		int mysum = 0;
		int myprod = 1;
		while (i < 3) {
			System.out.println("iteration:" + i);
			System.out.println("Enter any number:");
			mynumb = userInput.nextInt();
			numbs.add(mynumb);
			System.out.println("The numbered enter is:" + mynumb);
			i++;

		}
		userInput.close();
		System.out.println("length of array list is:" + numbs.size());
		// System.out.println("Sum is:" + numbs);

		for (Integer k : numbs) {
			System.out.println(k);
			mysum = mysum + k;
			myprod = myprod * k;
		}
		System.out.println("Sum is:" + mysum);
		System.out.println("prod is:" + myprod);

		Collections.sort(numbs); 		
		System.out.println("min is:" + numbs.get(0));
		System.out.println("max is:" + numbs.get(numbs.size() -1));
		
		System.out.printf("max is:%d" ,numbs.get(numbs.size() -1));
		  
		// printing the sorted ArrayList   
		//System.out.println("After Sorting: "+ numbs); 
		//System.out.println("After Sorting: "+ numbs.sort(c)); 
	}
}

