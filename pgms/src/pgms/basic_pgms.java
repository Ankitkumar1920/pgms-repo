package pgms;
import java.util.Scanner;

public class basic_pgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//time complexity = O(n^2)
		//BUBBLE SORT
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//SELECTION SORT = It basically swaps with every iteration
		//time complexity O(n^2)
//		for(int i=0;i<n.length-1;i++) {
//			int smallest=i;
//			for(int j=i+1;j<n.length;j++) {
//				if(n[smallest]>n[j]) {
//					smallest=j;
//				}
//			}
//			int temp=n[smallest];
//			n[smallest]=n[i];
//			n[i]=temp;
//		}
//		for(int i=0;i<n.length;i++) {
//			System.out.println(n[i]);
//		}
		//BINARY SEARCH - The array must be sorted
		//time complexity = O(log n)
		int search = 109;
		int low=0;
		int high=arr.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(search==arr[mid]) {
				System.out.println("index of searched value is"+mid);
				break;
			}
			else if(arr[mid]>search) {
				high =mid-1;
			}
			else if(arr[mid]<search) {
				low=mid+1;
			}
			
		}
		if(low>high) {
			System.out.println("Not found");
		}
		//LINEAR SEARCH
		//time complexity = O(n)
//		int pos=-1
//		for(int i=0;i<n.lenght;i++) {
//			if(n[i]==search) {
//				pos=i;
//				break;
//			}
//		}
//		if(pos==-1) {
//			System.out.println("Not found");
//		}
	}

}
