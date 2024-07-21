// Variables can be declared static using keyword Static.
// we know that non static var and methods belong to instances.
// Static members belong to class. They are not part of any instance of the class.
// Static members can be accessed using the class name, even without creating instance of the class
// They are also called static variables. They occupy single location in the memory.

// Static methods are also called class methods.
// Static methods use static variables only, whereas non-static methods can use both instance variables & static variables.
// They are used to perform some common task for all objects.

// An abstract method is a method that is declared without an implementation (without a body). It is declared using the abstract keyword and must end with a semicolon.
// Abstract methods can only be defined in abstract classes. An abstract class is a class that cannot be instantiated on its own and can contain abstract methods.
// Subclasses that inherit from an abstract class must provide implementations for all inherited abstract methods. If a subclass does not implement all abstract methods, it must also be declared as abstract.
// Abstract methods do not have a method body. The method body is provided by the subclass that implements the abstract method.
// All methods in an interface are implicitly abstract (until Java 8 introduced default and static methods). Interfaces are used to declare a contract that implementing classes must follow.
// An abstract class can exist without abstract methods, vice versa isn't true.

abstract class Car{
    int maxSpeed;
    abstract void accelerate(); //only declared but not implemented
    abstract void brake();
}

abstract class BMW extends Car{
    void accelerate(){
        System.out.println("Accelerating.....");
    }
}
class BMW2 extends BMW{
    void brake(){
        System.out.println("Applying brake...");
    }
}
public class AbstractStatic {
    public static void main(String[] args) {
        // BMW bmw = new BMW();
        // bmw.accelerate();

        BMW2 bmw2 = new BMW2();
        bmw2.accelerate();
        bmw2.brake();
    }
}