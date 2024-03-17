package Lessions;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Less3 {
    public static int[] mass = new int[10];
    static Scanner scanner = new Scanner(System.in);
    public static int x= 0;
    public static int[] wer(int n){
        if(x == n){
            return mass;
        }
        else{
            System.out.println("Введите число");
            mass[x++] = scanner.nextInt();
        }
        return wer(n);
    }
    public static void wsr(int n){
        if(x == n){
            return;
        }
        System.out.print(" "+mass[x++]);
        wsr(n);
    }
    public static void main(String[] args){
        int[] out = wer(10);
        x =  0;
        wsr(10);

    }

}
