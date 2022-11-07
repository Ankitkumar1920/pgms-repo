package pgms;
import java.util.Random;

public class insertionsort {
	public static void insertionSort(int[] arr) {
		//In the algorithm the first element is sorted with itself so it makes sense to start with second element
		for(int i=1;i<arr.length;i++) {
			int currentValue = arr[i];
			
			int j=i-1;
			while(j>=0 && arr[j]>currentValue) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = currentValue;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] n=new int[10];
		for(int i=0;i<10;i++) {
			n[i]=rand.nextInt(100);
		}
		System.out.println("Before");
		for(int i=0;i<10;i++) {
			System.out.print(n[i]+" ");
		}
		insertionSort(n);
		System.out.println("After");
		for(int i=0;i<10;i++) {
			System.out.print(n[i]+" ");
		}
	}

}
