package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] pa = new String[5];
		pa[0] = "one";
		pa[1] = "two";
		pa[2] = "three";
		pa[3] = "four";
		pa[4] = "five";
		printAll(pa);
		printAllReverse(pa);
		printEO(pa);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	static void printAll(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	static void printAllReverse(String[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	static void printEO(String[] arr) {
		for (int i = 0; i < arr.length; i += 2) {
			System.out.println(arr[i]);
		}
	}
	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.

}
