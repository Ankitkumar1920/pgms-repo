package pgms;
import java.util.Random;

public class mergesort {
	public static void mergeSort(int[] arr) {
		int n = arr.length;
		
		if(n<2) {
			return;
		}
		
		int mid = n/2;
		int[] lhalf = new int[mid];
		int[] rhalf = new int[n-mid];
		
		for(int i=0;i<mid;i++) {
			lhalf[i] = arr[i];
		}
		
		for(int i=mid;i<n;i++) {
			rhalf[i-mid]= arr[i];
		}
		
		mergeSort(lhalf);
		mergeSort(rhalf);
		
		merge(arr, lhalf, rhalf);
	}
	
	public static void merge(int[] arr, int[] lhalf, int[] rhalf) {
		int lsize = lhalf.length;
		int rsize = rhalf.length;
		
		int i=0, j=0, k=0;
		
		while(i<lsize && j<rsize) {
			if(lhalf[i]<= rhalf[j]) {
				arr[k] = lhalf[i];
				i++;
			}
			else {
				arr[k] = rhalf[j];
				j++;
			}
			k++;
		}
		
		while(i<lsize) {
			arr[k] = lhalf[i];
			i++;
			k++;
		}
		
		while(j<rsize) {
			arr[k] = rhalf[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] nos = new int[10];
		for(int i=0;i<nos.length;i++) {
			nos[i]=rand.nextInt(1000);
		}
		System.out.println("Before");
		for(int i=0;i<nos.length;i++) {
			System.out.print(nos[i]+" ");
		}
		mergeSort(nos);
		System.out.println();
		System.out.println("After");
		for(int i=0;i<nos.length;i++) {
			System.out.print(nos[i]+" ");
		}
	}

}
