package hw;

public class primeNumber{
	private static int number[] = new int[100000000];
	public static int countPrime(int low, int high){
		prime(high);
		int m = 0;
		int x = low;
		for(int i = 0; i <= high; i++){
			if(number[i] == x){
				m++;
				x++;
			}
			else if(number[i] > x){
				x = number[i];
				m++;
			}
		}
		return m;
	}
	public static void prime(int n){
		boolean prime[] = new boolean[n+1];
        for(int i = 0; i < n; i++)
            prime[i] = true;
        for(int p = 2; p*p <= n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
        int m = 0;
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                number[m++] = i;
        }
	}
	public static void main(String args[]){
		int k = countPrime(1,20);
		System.out.println("input:1,20; output:"+k);
		int l = countPrime(11,20);
		System.out.println("input:11,20; output:"+l);
		int q = countPrime(1000000,1000020);
		System.out.println("input:1000000,1000020; output:"+q);
	}
}