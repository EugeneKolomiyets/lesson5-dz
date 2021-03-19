package ua.alevel.dz5;

import java.util.Random;

public class newDz5 {
    public static void main(String[] args) {

        int N=10;
        int[][]arr=new int [N][N];
        Random random = new Random();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");

        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");

        int F=10;
        int[]f1=new int [F];
        for (int i = 0; i <f1.length ; i++) {
                f1[i]=random.nextInt(5);
                System.out.print(f1[i] + " ");
        }
        System.out.println();

        System.out.println("areFibNumbers = "+areFibNumbers(f1));
    }

    public static boolean areFibNumbers(int[]f1){
        int tmp,fib1,fib2,fib3;
        boolean areFib;
        for (int i = 0; i <f1.length ; i++) {
            tmp=f1[i];
            if (tmp==0)
                continue;
            fib1=0;fib2=1;
            areFib=false;
            do{
                fib3=fib1+fib2;
                if(fib3==tmp){
                    areFib=true;
                    break;
                }
                fib1=fib2;
                fib2=fib3;
            }while (tmp>fib3);
            if (!areFib)
                return false;
        }
        return true;
    }
}
