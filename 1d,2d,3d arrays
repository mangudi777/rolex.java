PROGRAM 1:
class main{
    public static void main(String[] args){
        int[][] arr;
        arr = new int[1][3];
        arr[0][0]=2;
        arr[0][1]=5;
        arr[0][2]=7;
        System.out.println(arr[0][1]);
    }
   
}

PROGRAM 2:
import java.util.Scanner;
 class main{
     public static void main(String [] args){
         int [] [] arr = {{1,2},{4,5}};
         
         for(int i = 0;i<3;i++){
             for(int j = 0;j<3;j++){
                 System.out.print(arr[i][j]+ " ");
               
             }
             System.out.println();
         }
           
     }
 }

PROGRAM 3:
class Main { 
    public static void main(String[] args) {
        int x=3;
        int y=3;
        int[][] arr=new int[x][y];
        int num=1;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=num;
                num++;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

PROGRAM 4:
import java.util.Scanner;

class Main { 
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int row = x.nextInt();
        int col = x.nextInt();
        int[][] arr = new int [row][col];
        for (int i = 0; i<row;i++){
            for (int j = 0; j<col; j++){
                arr[i][j]  = x.nextInt();
                
                System.out.print(arr +" ");
            }
            System.out.println();
        }
    }
}

PROGRAM 5:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][][] arr = {
            {
                {1,2,3},{4,5,6}
            },
            {
                {7,8,9},{10,11,12}
               
            }
        };

        for (int[][] x :arr) {
            for (int[] y :x) {
                for (int item : y) {
                    System.out.print(item+"  ");
                }
                System.out.println();
            }
           
        }
    }
} 


PROGRAM 6:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][][] arr = {
            {
                {1,2,3},{4,5,6}
            },
            {
                {7,8,9},{10,11,12}
               
            }
        };

        for (int[][] x :arr) {
            for (int[] y :x) {
                for (int item : y) {
                    System.out.print(item+"  ");
                }
                System.out.println();
            }
        }
        for (int[][] x: arr){
            for(int[] y:x){
                if (y.length == 3 && y[0] == 7 && y[1] == 8 && y[2] == 9) {
                    continue;
                }
                 for (int item : y) {
                    System.out.print(item+"  ");
                }
                System.out.println();
            }
        } 
    }
}
