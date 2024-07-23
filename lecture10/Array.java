public class Array{
    static void print(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void addOne(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        // int[] arr = new int[5]; //Array Declaration
        int[] arr = {1,2,3,4,5};
        // for(int i = 0 ; i < arr.length ; i++){
        //     arr[i] = i + 1;
        // }
        print(arr);
        addOne(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}