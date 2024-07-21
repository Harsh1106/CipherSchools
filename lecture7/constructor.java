
class Loan{
    int rate;
    Loan(){
        System.out.println("Default constructor of loan");
    }
    Loan(int rate){
        this.rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
    }
}

// The constructor of base class will always run before the constructor of the child class so as to initialize any variable in parent class that might not be required in the child class
class carLoan extends Loan{
    int rate;
    carLoan(){
        System.out.println("Default Constructor of carLoan");
        System.out.println(super.rate); //using super to access the instance variable of parent class
    }
    carLoan(int rate){
        super(7); // to invoke the constructor of parent class(must be 1st line of the child constructor)
        this.rate = rate;
    }
    void printRate(){
        System.out.println(this.rate);
        super.printRate(); //using super to invoke the methods of the parent class
        System.out.println(super.rate);
    }
}

public class constructor{
    public static void main(String[] args) {
        carLoan cl1 = new carLoan();
        carLoan cl2 = new carLoan(5);
        cl2.printRate();
    }
}