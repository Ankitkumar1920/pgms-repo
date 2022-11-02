package pgms;

public class stng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object that represents sequence of characters, two methods to declare string
		//String literal
		String s = "Ankit Kumar";
		String s1=s;
		
		//using new memory allocate operator
		String s2 = new String("Welcome");
		String[] splittedstring=s.split(" ");
		for(String p:splittedstring) {
			System.out.println(p);
		}
		
		String s3="Ankit Kumar Singh";
		String s4=s3;
		String[] spst=s3.split("Kumar");
		System.out.println(spst[0]);
		System.out.println(spst[1].trim());
		//To print single characters
		for(int i=0;i<s3.length();i++) {
			System.out.println(s3.charAt(i));
		}
		//To print reverse of a String
		for(int i=s4.length()-1;i>=0;i--) {
			System.out.print(s4.charAt(i));
		}
		
	}

}
