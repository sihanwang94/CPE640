
public class ComputeChooser {
    static int n, r;
    static int []x  = new int[1000];
    public ComputeChooser(int n, int r) {
        this.n = n;
        this.r = r;
    }
    public static int Compute(ComputeChooser a){
        for(int i = 0; i < n; i++){
            if(i == 0){
                x[i] = 1 ;
            }else{
                x[i] = x[i-1] * (i+1);
            }
        }
        int k = x[n-1]/(x[r-1]*x[n-r-1]);
        return k;
    }
    public static void main(String [] args) throws Exception {
        ComputeChooser a = new ComputeChooser(10, 4);
        int k = Compute(a);
        System.out.println(k +" ");
    }
}

