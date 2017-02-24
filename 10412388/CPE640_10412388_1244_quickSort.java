import java.util.Random;

public class quickSort {
	private static Random r = new Random(0);
	public static void quicksort(int[] x, int low, int high){
			int i = low;
			int j = high;
			int pivot = x[low];
			while(i < j){            //just i<j!!!!
				while(x[i] < pivot){
					i++;
				}
				while(x[j] > pivot){
					j--;
				}
				if(i <= j){
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
					i++;
					j--;
				}
			}
			if(j > low){
				quicksort(x, low, j);
			}
			if(i < high){
				quicksort(x, i, high);
			}
	}
	public static void randomArray(int[] x, int m) {
		for (int i = 0; i < x.length; ++i) {
			x[i] = r.nextInt(m);
		}
	}

	public static void print(int[] x) {
		for (int i = 0; i < x.length; ++i)
			System.out.print(x[i] + " ");
		System.out.println();
	}

	public static void main(String [] args) {
		final int n = 10;
		int []x  = new int[n];
		randomArray(x, 30);
		int []y ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int []z ={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int []k ={62, 50, 50, 50, 62};
		print(x);
		quicksort(x,0,9);
		print(x);
		System.out.println();
		print(y);
		quicksort(y,0,y.length-1);
		print(y);
		System.out.println();
		print(z);
		quicksort(z,0,z.length-1);
		print(z);
		System.out.println();
		print(k);
		quicksort(k,0,k.length-1);
		print(k);
	}
}
