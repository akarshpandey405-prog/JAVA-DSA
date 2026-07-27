import java.util.Arrays;

public class shallowandeepcopy {
    public static void main(String[] args) {
        //It is a shallow copy
        int[]arr={1,2,3,5};
        int[]y=arr;
        y[1]=6;
        System.out.println(arr[1]);

        int []z=Arrays.copyOf(arr, arr.length);
        z[2]=8;
        System.out.println(arr[2]);
    }

}
