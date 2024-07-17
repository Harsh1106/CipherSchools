public class loops{
    public static void main(String[] args){
        int i;
        // for loop
        for(i = 1 ; i < 20 ; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Value of i is: "+i);
        System.out.println("------------------------");
        for(i = 0 ; i < 10 ; i++){
            System.out.print(i + 1+" ");
        }
        System.out.println();
        System.out.println("I is : "+i);

        // while loop
        int n = 0;
        while(n < 5){
            System.out.println("Hello");
            n++;
        }

        // do-while loop - it runs atleast once
        n = 5;
        do{
            System.out.println(n);
            n--;
        }while(n > 0);
        
        // there is one more loop which is for-enhanced loop
    }
}