PROGRAM:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
       
        int n=6;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
}
OUTPUT:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 

PROGRAM:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
       
        int n=6;
        for (int i=n; i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
           
        }
    }
}

OUTPUT:
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

PROGRAM:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int num=1;
        int n=6;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
           
           
        }
    }
}

OUTPUT
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 

PROGRAM:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int num=1;
        int n=6;
        for (int i=n; i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
                
            }
            System.out.println();  
        }
    }
}

OUTPUT:
1 2 3 4 5 6 
7 8 9 10 11 
12 13 14 15 
16 17 18 
19 20 
21 

PROGRAM:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int num=1;
        int n=4;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(num*num);
                num++;
            }
            System.out.println();
           
           
        }
    }
}
OUTPUT:
1
49
162536
496481100

PROGRAM:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int num=1;
        int n=6;
        for (int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                
                num++;
                if (num%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
           
           
        }
    }
}

OUTPUT:
1
01
010
1010
10101
010101

PROGRAM:
public class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1;i<=n;i++){
            for (int a=0;a<n-i;a++){
                System.out.print("  ");
            }

             for (int j=0;j<i;j++) {
                System.out.print("  * ");
            }

                System.out.println();
        }
    }
}
OUTPUT:
          * 
        *   * 
      *   *   * 
    *   *   *   * 
  *   *   *   *   *
