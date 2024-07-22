public class A{
    int x = 10;
    private int y = 15;
    protected int z = 20;
    public int w = 25;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println();
    }
}
// public var is accessible everywhere
//default is not accessible outside the package
// private not accessible outside the class
// protected will be visible in different package in subclass, using object of childclass only. 