public class linaearsearch {
    public static void main(String[] args) {
        int[]arr={1,87,2,87,90,78};
        int target=90;

        boolean gid=false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Target in array at index");
                gid=true;
                break;
            }
        }
        if(!gid) System.out.println("Target was not  in array");
        
    }
}
// glt h ye  code