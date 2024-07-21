//The overriding method should have same signature as the method to be overriden.
// Final method can not be overriden.
// Method having high level of accessibility cannot be overriden by method having lower level of accessibility.
// for e.g. : A public method cannot be overriden by a protected or private method.
class Parent{
    void fun(){ //overriden method
        System.out.println("Inside Parent");
    }
}

class Child extends Parent{
    void fun(){ //overriding method
        System.out.println("Inside Child");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        Child c = new Child();
        c.fun();
    }
}