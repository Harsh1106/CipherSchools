class demo{
    void fun(){
        System.out.println("I have no paremeters");
    }
    void fun(int a){
        System.out.println("I have 1 parameters");
    }
    void fun(String s){
        System.out.println("I have a string: "+s);
    }
    void fun(int a, int b){
        System.out.println("I have 2 parameters");
    }
}

public class methodOverload {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.fun();
        obj.fun(5);
        obj.fun("Harsh");
        obj.fun(2, 3);

        // Best example of overloading is println().
    }
}
