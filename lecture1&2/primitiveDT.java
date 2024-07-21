public class primitiveDT{
    public static void main(String[] args) {
        int x = 5; 
        int y = 7;

        System.out.println("X is : "+x);
        System.out.println("Y is : "+y);

        byte b = 10;
        System.out.println("B is : "+b);
        
        int i = b;
        System.out.println("I is : "+i);

        byte b2 = (byte)129;
        System.out.println("B2 is : "+b2);

        byte b3 = (byte)128;
        System.out.println("B3 is : "+b3);
        
        byte b4 = (byte)256;
        System.out.println("B4 is : "+b4);

        float f = (float)5.5; //by default consider as decimal to be double

        float f2 = 5.5f;

        double d = 10.5;

        char ch = 'a';
        System.out.println(ch);

        int z = x + y;
        //+ -> operator
        //x,y -> operands


        // increment and decrement operator
        int m = 5;
        int n = m++;
        System.out.println("M is: "+m+", N is: "+n);
    }
}