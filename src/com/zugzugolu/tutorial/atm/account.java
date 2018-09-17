package com.zugzugolu.tutorial.atm;

public class account {
    private static String username;
    private static String password;
    private static double balance;
    public account(String _username, String _password, double _balance){
        this.username = _username;
        this.password = _password;
        this.balance = _balance;
    }
    public boolean userExist(String username){
        return this.username.equals(username);
    }
    public boolean checkPassword(String pass){
        return this.password.equals(pass);
    }

    public static double getBalance() {
        return balance;
    }
    public static void addMoney(double mebla){
        balance+=mebla;
    }

    public static void getMoney(double mebla) {
        balance -= mebla;
    }
}
