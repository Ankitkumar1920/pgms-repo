package pgms;

public class methodsEg {
	public static void main(String[] args) {
		
		methodsEg d= new methodsEg();
		d.getData();
		String name = d.gd();
		System.out.println(name);
		methodsEg2 d1=new methodsEg2();
		d1.getUserData();
		//calling through static method without using object
		getData1();
		
	}
	//Why method - when there are some lines of code which can be used again and again then we wrap them into method
	//You always write method inside class
	//If the method doesn't return anything then we write void otherwise you can write the datatype(int,string) it returns
	public void getData() {
		System.out.println("hello world");
	}
	public String gd() {
		return "Ankit Kumar";
	}
	//If you want to use without calling object use 'static' it will attach the method to the class
	public static void getData1() {
		System.out.println("hello world");
	}
}
