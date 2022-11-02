package pgms;

import java.util.ArrayList;

public class arys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 9;
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2[2]);
		
		//for loop
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		String[] name = {"rahul","amrit","riya"};
		
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		//or enhanced for loop
		for(String s:name) {
			System.out.println(s);
		}
		
		//Arraylist is used to dynamically increase the size of array,Arraylist is a class of java
		ArrayList<String> a = new ArrayList();
		//The new operator instantiates a class by allocating memory for a new object and returning a reference to that memory
		a.add("Rahul");
		a.add("Rishika");
		a.add("Selenium");
		a.add("testng");
		System.out.println(a.get(2));
	}

}
