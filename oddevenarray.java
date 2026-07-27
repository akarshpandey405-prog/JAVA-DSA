public class oddevenarray {
    public static void main(String[] args) {
        int[]arr={1,2,-78,90};
        for(int i=0; i<arr.length; i++){
            if(i%2==0) System.out.print(2*arr[i]+" ");
            else System.out.print(10*arr[i]+" ");
        }
        System.out.println();
    }
}
