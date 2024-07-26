public class StringStudy {
    public static void main(String[] args) {
        String name = "CipherSchools"; //created using string literals- stored in method area
        String name2 = "CipherSchools";

        String name3 = new String("CipherSchools"); //creating string using constructors
        String name4 = new String("CipherSchools");

        System.out.println(name == name2); // == opearators compares references for objects and values for primitive types
        System.out.println(name3 == name4);
        System.out.println(name == name3);

        // Strings are immutable
        // Everytime we do an operation on String, a new object is created

        System.out.println("==========================================");
        System.out.println("1. Concatenation");
        // 1.Concatenation
        String s1 = "Hello";
        s1 = s1 + "Peeps";
        System.out.println(s1);
        System.out.println(s1+" How are you doing?");
        System.out.println(s1);

        // Another way to concat functions
        String s2 = new String("Hello");
        String s3 = new String(" People");

        s2 = s2.concat(s3);
        System.out.println(s2);


        System.out.println("==========================================");
        System.out.println("2. Checking if strings are equal in value");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        // Equals method  -> Object class
        // This generally compares references(hashcodes) of objects (just like ==).
        // But, for String Class it has been overriden to check for content equality

        System.out.println("==========================================");
        System.out.println("3. Creating new String object from character array");
        char arr[] = {'C', 'I', 'P', 'H', 'E', 'R'};
        String strFromArr = new String(arr);
        System.out.println(strFromArr);
    }
}
