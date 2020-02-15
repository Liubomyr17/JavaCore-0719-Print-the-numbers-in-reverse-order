package com.company;

import sun.awt.windows.WPrinterJob;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

0719 Print the numbers in reverse order.

Enter 10 numbers from the keyboard and fill out the list with them.
Output them in reverse order.
Use only for loop.

Requirements:
1. Declare a variable of type integer list and immediately initialize ee.
2. Read 10 integers from the keyboard and add them to the list.
3. Print the numbers in reverse order.
4. Use the for loop.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++)
            list.add(Integer.parseInt(reader.readLine()));
        for(int i = list.size()-1; i>=0;i--)
    System.out.println(list.get(i));
    }
}







