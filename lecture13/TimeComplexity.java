public class TimeComplexity{
    public static boolean isPrimeRam(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeSham(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 1000000; //it won't reflect any shift in time calculation because our system is capable of commputing 10^4 so it is not a big task for it that's why it results zero if n = 100
        long start =  System.currentTimeMillis(); //note time before funtion call
        System.out.println(isPrimeRam(n));
        long end = System.currentTimeMillis(); //note time after function executed
        System.out.println("Time taken by Ram's Approach: "+ (end - start));

        start = System.currentTimeMillis(); //note time before function call
        System.out.println(isPrimeSham(n));
        end = System.currentTimeMillis(); //note time after function executed
        System.out.println("Time taken by Sham's Approach: "+(end - start));
    }
}