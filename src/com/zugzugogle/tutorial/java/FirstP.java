package com.zugzugogle.tutorial.java;

import java.util.Scanner;

public class FirstP {
    public static void main(String ...args){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("[1] Giris Yap");
        }while(scanner.nextLine() != "q");
    }
}
