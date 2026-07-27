public class sumis2{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        boolean flag=false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==2) System.out.println("Sum is 2");
                flag=true;
                
            }
        }
        if(flag=false ) System.out.println("Sum is not 2 ");
    }
}