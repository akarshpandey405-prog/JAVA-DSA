public class sepzeroand1print {
    public static void main(String[] args) {
        int[]arr={0,0,1,0,1,0};
        int numberofZeroes=0;
        int numberofOnes=0;
        for(int elep:arr){
            if(elep==0) numberofZeroes++;
            else numberofOnes++;
        }
       for(int i=0; i<numberofZeroes; i++){
        arr[i]=0;
       }
       for(int i=numberofZeroes; i<arr.length; i++){
        arr[i]=1;
       }
       for(int i=0; i<arr.length; i++){
       System.out.println(arr[i]);
       }
    }
}
