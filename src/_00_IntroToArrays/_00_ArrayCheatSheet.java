package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] st = new String[5];
		//2. print the third element in the array
		System.out.println(st[3]);
		//3. set the third element to a different value
		st[3] = "three";
		//4. print the third element again
		System.out.println(st[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < st.length; i++) {
			st[i] = "index " + (i);
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		//7. make an array of 50 integers
		Integer[] in = new Integer[50];
		//8. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < in.length; i++) {
			in[i] = ran.nextInt(100);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int s = in[0];
		for (int i = 1; i < in.length; i++) {
			if(s>in[i]) {
				s = in[i];
			}
		}
		System.out.println(s);
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < in.length; i++) {
			System.out.print(in[i]+", ");
		}
		//11. print the largest number in the array.
		int l = in[0];
		for (int i = 1; i < in.length; i++) {
			if(l<in[i]) {
				l = in[i];
			}
		}
		System.out.println("\n"+l);
		//12. print only the last element in the array
		System.out.println(in[(in.length-1)]);
	}
}
