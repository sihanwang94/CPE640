import java.util.Random;

public class heapSort {
	private static Random r = new Random(0);
	public static void heapsort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i)
    {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
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
		heapsort(x);
		print(x);
		System.out.println();
		print(y);
		heapsort(y);
		print(y);
		System.out.println();
		print(z);
		heapsort(z);
		print(z);
		System.out.println();
		print(k);
		heapsort(k);
		print(k);
	}
}
