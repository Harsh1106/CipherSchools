class Demo{
    private int a = 5;
    private int b = 5;
    private int c = 5;
    private int d = 5;
    // we can  use setter to set the value of members
    public int getA() {
        System.out.println("Value of A");
        return a;
    }
    public int getB() {
        System.out.println("Value of B");
        return b;
    }
    public int getC() {
        System.out.println("Value of C");
        return c;
    }
    public int getD() {
        System.out.println("Value of D");
        return d;
    }
}

public class EncapStudy {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.getA());
        System.out.println(d.getB());
        System.out.println(d.getC());
        System.out.println(d.getD());
    }
}
