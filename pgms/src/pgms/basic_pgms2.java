
package pgms;
import java.util.Scanner;

public class basic_pgms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse a number
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		int rev=0;
//		while(num!=0){
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println("Reverse no. is" +rev);
		//REVERSE STRING
//		String str="ABCD";
//		String rev="";
//		int len=str.length();
//		for(int i=len-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//			
//		}
//		System.out.println("Reversed string is"+rev);
		//REVERSE STRING USING CHAR ARRAY
//		String str = "ABCD";
//		String rev="";
//		char[] a= str.toCharArray();
//		for(int i=a.length-1;i>=0;i--) {
//			rev=rev+a[i];
//			
//		}
//		System.out.println("Rev is"+rev);
		//FIBONACCI NUMBER
		int n1=0, n2=1,sum=0;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}

}
