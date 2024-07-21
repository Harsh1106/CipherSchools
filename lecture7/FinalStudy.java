class A{
    final int x = 10; //Final Variables- Value must be assigned first but it cannot be changed
    final int noOfDigits;
    A(){
        noOfDigits = 26; //final variable values can be assigned inside the constructor
    }
    final void fun(){
        System.out.println("In A");
    }
}

class B extends A{
    // if we declare method as final then that method will not be overriden
    // @Override
    // void fun(){
    //     System.out.println("In B");
    // }
}
// Final Methods cannot be overriden in subclasses. Static methods may also be declared final to prevent from overriding.
// Final Variables must be initialized either at declaration time or inside the constructor.
// Final Class - final classes cannot be inherited.
// Not necessary for a final class to have final methods.
// Final class cannot have abstract methods.

public class FinalStudy {
    public static void main(String[] args) {
        
    }
}
