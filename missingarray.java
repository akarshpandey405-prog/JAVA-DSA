
public class missingarray{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6};
        int n=arr.length+1;
        int sum=(n)*(n+1)/2;
        int arrsum=0;
        for(int i=0; i<arr.length; i++){
            arrsum=arrsum+arr[i];
        }
        System.out.println(arrsum);
        System.out.println(sum);
    }
}