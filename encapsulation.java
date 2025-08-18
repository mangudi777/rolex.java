class Vehicle{
     void drive(){
        System.out.println("drive");
    }
} 

class Bike extends Vehicle{
        @Override
     void drive(){
            System.out.println("driving Bike");
        }
        
    }
class Car extends Vehicle{
        @Override
         void drive(){
            System.out.println("driving Car");
        }
    }

class Main{
  public static void main(String[] args){
    Bike v = new Bike();
    v.drive();
    
    Car c = new Car();
    c.drive();
    
    Vehicle a = new Vehicle();
    a.drive();
   } 
}




class Payment{
     void money(){
        System.out.println("money");
    }
} 

class Upi extends Payment{
        @Override
     void money(){
            System.out.println("Upi money");
        }
        
    }
class Creditcard extends Payment{
        @Override
         void money(){
            System.out.println("Creditcard money");
        }
    }
class Paytm extends Payment{
        @Override
         void money(){
            System.out.println("Paytm money");
        }
    }

class Main{
  public static void main(String[] args){
    Upi v = new Upi();
    v.money();
    
    Creditcard c = new Creditcard();
    c.money();
    
    Paytm a = new Paytm();
    a.money();
    
    Payment b = new Payment();
    b.money();
   } 
}
