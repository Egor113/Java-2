package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int n,m;

    public static void main(String[] args) throws IOException {
        String[][] arr = inputArray();
        System.out.println(sum(arr));

    }
    public static int sum(String[][] arr){
//        if (n!=4 || m!=4){
//            throw new Exception();
//        }
        int sum = 0;
        try{
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
//                    try{
//
//                    }
                    sum+= Integer.parseInt(arr[i][j]);
                }
            }
        }
        catch (MyArraySizeException ex){
            ex.getMessage();
        }


        return 0;
    }

    public static String[][] inputArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк массива");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите столбцов массива");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите массив строк, каждый элемент с новой строки");
        String [][] array = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = reader.readLine();
            }
        }
        System.out.println("Исходный массив строк:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        Main.n = n;
        Main.m = m;
        return array;
    }
}

