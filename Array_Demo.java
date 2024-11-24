import java.util.Scanner;

/**
 * Array_Demo
 */
public class Array_Demo {

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
          arr[i]=sc.nextInt();  
        }
        int[] a={1,2,3,4,5};
        int start=0;
        int end=a.length-1;
        while (start<end) {
          int temp=a[start];
          a[start]=a[end];
          a[end]=temp;
          start++;
          end--;
          
        }
    
        for (int i = 0; i < a.length; i++) {
          System.out.println(a[i]);
        }
        sc.close();


    }
}