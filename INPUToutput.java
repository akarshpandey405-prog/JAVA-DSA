import java.util.Scanner;

public class INPUToutput{
 public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter no of digits:");

    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
    }
 }
    
}