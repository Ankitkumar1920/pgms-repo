package pgms;

public class loopFWD {
	public static void main(String[] args) {
		
		//while loop
		int i=0;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		//do while
		int k=20;
		do {
			System.out.print(k+" ");
			k++;
		}while(k<=30);
		System.out.println();
		//right angled triangle
//		int b=1;
//		for (int a=4;a>=1;a--) {
//			for(int j=1;j<=a;j++) {
//				System.out.print(b+" ");
//				b++;
//			}
//			System.out.println();
//		}
//		
		int c=1;
		for (int a=1;a<=4;a++) {
			for(int j=0;j<a;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
		
		for (int a=2;a<=5;a++) {
			for(int j=1;j<a;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
//		int d=3;
//		for (int a=1;a<=4;a++) {
//			for(int j=0;j<a;j++) {
//				System.out.print(d+" ");
//				d+=3;
//			}
//		System.out.println();
//		}
		for(int e=0;e<5;e++) {
			for(int f=0;f<5-e;f++) {
				System.out.print(" ");
				for(int g=0;g<=e;g++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
	}
}
