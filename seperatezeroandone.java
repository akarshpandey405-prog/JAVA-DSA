public class seperatezeroandone {
    public static void main(String[] args) {
        int[]arr={0,0,1,0,1,0};
        int numberofZeroes=0;
        int numberofOnes=0;
        for(int elep:arr){
            if(elep==0) numberofZeroes++;
            else numberofOnes++;
        }
        System.out.println(numberofZeroes);
        System.out.println(numberofOnes);
    }
}
