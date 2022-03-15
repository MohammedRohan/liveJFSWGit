package com.demo.basics;

public class StringEx {
	public static void main(String[] args) {
		String placeString = "Chennai";
		System.out.println(placeString);

		// Display the characters
		for (int ctr = 0; ctr < placeString.length(); ctr++) {
			System.out.println("Char at " + (ctr + 1) + " is " + placeString.charAt(ctr));
		}
		System.out.println("String Reversal");
		// reverse the string
		for (int ctr = placeString.length() - 1; ctr >= 0; ctr--) {
			System.out.println("Char at " + (ctr + 1) + " is " + placeString.charAt(ctr));
		}
//twoDimArray();
		
		//compare two strings
//		String placeString2 = "Mumbai";
		String placeString2 = "Asia";
		int result = placeString.compareTo(placeString2);
		if(result == 0) {
			System.out.println("Places are equal");
		}
		else if (result < 0) {
			System.out.println("Smaller");
		}
		else {
			System.out.println("Greater");
		}
		System.out.println(result);
	}

	private static void twoDimArray() {
		// singleDimArray();
		String seatArray[][] = new String[2][5];
		seatArray[0][0] = "Dad";
		seatArray[0][1] = "Mom";
		seatArray[0][2] = "Son";
		seatArray[0][3] = "Daughter";
		seatArray[0][4] = "Pet Tommy";

		seatArray[1][0] = "Unlcle";
		seatArray[1][1] = "Aunty";
		seatArray[1][2] = "Uncle's Son";
		seatArray[1][3] = "Uncle's Daughter";
		seatArray[1][4] = "Pet Fluffy";

		for (int row = 0; row <= 1; row++) {
			for (int seat = 0; seat <= 4; seat++) {
				System.out.print(seatArray[row][seat] + "\t");
			}
			System.out.println();
		}
	}
}
