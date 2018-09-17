package com.zugzugolu.tutorial.atm;

import java.util.Scanner;

public class Login {
    public boolean login (account acount){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please sign in > ");
        int tryCount = 3;
        boolean isloged = false;
        String username,pass;
        for(int i = 0 ; i<tryCount;i++){
            if(i>0)
                System.out.println(tryCount-i+" login remaining");
            System.out.println("Username :");
            username = scanner.nextLine();
            System.out.println("Password :");
            pass = scanner.nextLine();
            if(acount.userExist(username)){
                if (acount.checkPassword(pass)){
                    isloged = true;
                    break;
                }
                else
                    System.out.println("Password is wrong");
            }else{
                System.out.println("Username is wrong");
            }
        }
        return isloged;
    }
}
