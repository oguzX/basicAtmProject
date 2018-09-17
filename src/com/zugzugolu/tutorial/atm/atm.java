package com.zugzugolu.tutorial.atm;

import java.util.Scanner;

public class atm {
    Scanner scanner = new Scanner(System.in);
    public atm(){
        account account = new account("zug","123",1000);
        System.out.println("_____ATM_____");
        Login login  = new Login();
        if(login.login(account)){
            System.out.println("Login is successful!");
            while (menu()==true);
        }else{
            System.out.println("Login is not success");
        }
    }
    public boolean menu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Add money into your account");
        System.out.println("3. Get money");
        System.out.println("4. Add money[infinity]");
        System.out.println("5. Çıkış");
        switch (scanner.nextLine()){
            case "1":
                System.out.println("Balance is :"+account.getBalance());
                break;
            case "2":
                paraYatir();
                break;
            case "3":
                paraYatirH();
                break;
            case "4":
                paraYatirH();
                break;
                default:
                    return false;
        }
        return true;
    }
    public void paraYatir(){ 
        System.out.print("How much do you want to add to your bank account? : ");
        account.addMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Operation complete, your new balance is: "+account.getBalance());
    }
    public void paraYatirH(){
        do{
            account.addMoney(10);
            System.out.println("Operation complete, your new balance is: "+account.getBalance());
        }while(!scanner.nextLine().equals("q"));
    }
    public void paraCek(){
        System.out.print("How much do you want? : ");
        account.getMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Operation complete, you can take money from me. Yeni bakiyen :"+account.getBalance());
    }


}
