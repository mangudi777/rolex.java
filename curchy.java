import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data= new Scanner(System.in);
        System.out.println("Enter the Starting number");
        int SN = data.nextInt();
        
        System.out.println("Enter the Ending number");
        int EN = data.nextInt();
        
        int RN = SN +(int) (Math.random() * ((SN+EN)+1));
        System.out.println(RN);
    }
}
