import java.util.Scanner;
public class ArrayInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        // Input the size
        int n = sc.nextInt();
        // Create the array
        int arr[] = new int[n];
        // Take the element as input
        System.out.println("Enter the element of the array:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
}