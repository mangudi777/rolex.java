class Cars{
    void sound(){
        System.out.println("Cars make a sound");
    }
}

class BMW extends Cars{
    void sound(){
        System.out.println("BMW");
    }
}

class Audi extends Cars{
    void sound(){
        System.out.println("Audi");
    }
}

class Benz extends Cars{
    void sound(){
        System.out.println("Benz");
    }
}

public class Main{
    public static void main(String[] args){
        Cars a;
        a = new BMW();
        a.sound();
        
        a = new Audi();
        a.sound();
        
        a = new Benz();
        a.sound();
    }
}







class Cars{
    void sound(){
        System.out.println("Cars make a sound");
    }
}

class BMW extends Cars{
    void sound(){
        System.out.println("BMW");
    }
}

public class Main{
    public static void main(String[] args){
        Cars a;
        a = new BMW();
        a.sound();
        
        
    }
}




import java.util.Scanner;
class Vehical{
    void vehical(){
        System.out.println("Vehical");
    }
}

class FourWheeler extends Vehical{
    FourWheeler(){
        System.out.println("FourWheele");
    }
}

class Car extends FourWheeler{
    Car(){
        System.out.println("Car");
    }
}

public class Main{
    public static void main(String[] args){
        Car obj = new Car();
        
    }
}



import java.util.Scanner;
class Parents{
    Parents(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parents name");
        String a = sc.nextLine(); 
    }
}

class Child1 extends Parents{
    Child1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first child name");
        String b = sc.nextLine();
    }
}

class Child2 extends Parents{
    Child2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the second child name");
        String c = sc.nextLine();
    }
}

public class Main{
    public static void main(String[] args){
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
    }
}
