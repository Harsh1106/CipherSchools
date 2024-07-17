class Student{
    String name;
    int marks;
    boolean checkPass(){
        // if(marks > 40){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        if(marks >= 40) return true;
        return false;
    }
}

public class controlFlow {
    int findMax(int a, int b, int c){
        if(a > b){ //nested if else
            if(a > c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b > c){
                return b;
            }
            else{
                return c;
            }
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.marks = 80;

        Student s2 = new Student();
        s2.name = "Yuvraj";
        s2.marks = 30;
        
        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        controlFlow obj = new controlFlow();
        System.out.println(obj.findMax(10, 7, 15));

        char ch = 'a';
        switch(ch){
            case 'a':
                System.out.println("Hi, I am A");
                break;
            case 'b':
                System.out.println("Hi, I am B");
                break;
            case 'c':
                System.out.println("Hi, I am C");
                break;
            case 'd':
                System.out.println("Hi, I am D");
                break;
            case 'e':
                System.out.println("Hi, I am E");
                break;
            default:
            System.out.println("I am not anyone of them!");
        }
        System.out.println("After switch!");
    }
}
