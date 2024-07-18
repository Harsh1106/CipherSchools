class Car{
    String name; //Instance variable because object is called as Instance of class - Stored in Heap Memory
    String color;
    int year;
    int maxSpeed;
    void accelerate(){
        System.out.println("Car is accelarating");
    }
}
public class carStudy{
    public static void main(String[] args){
        Car polo = new Car(); //Local reference variable - stored in Stack Memory
        System.err.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);

        polo.name = "Polo";
        polo.color =  "Red";
        polo.year = 2016;
        polo.maxSpeed = 120;
        
        System.err.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
    }
}