package pgms;

public class basic_pgms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//time complexity = O(n^2)
		//BUBBLE SORT
		int[] n= {23,109,2,56,20};
		for (int i=0;i<n.length;i++) {
			for (int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					int temp = n[i];
					n[i]=n[j];
					n[j]=temp;
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
		int high=n.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(search==n[mid]) {
				System.out.println("index of searched value is"+mid);
				break;
			}
			else if(n[mid]>search) {
				high =mid-1;
			}
			else if(n[mid]<search) {
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
