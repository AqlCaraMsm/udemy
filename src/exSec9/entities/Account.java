package exSec9.entities;

public class Account {
    private String holder;
    private int number;
    private double balance;

    public Account(String holder,int number, double initDeposit) {
        this.holder = holder;
        this.number = number;
        deposit(initDeposit);
    }

    public Account(String holder,int number) {
        this.holder = holder;
        this.number = number;
    }

    public String getholder() {
        return holder;
    }

    public void setholder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double ammount){
        balance += ammount;
    }

    public void withdraw(double ammount){
        balance -= ammount +5;
    }

    public String toString(){
        return "Account "+number+", Holder: "+holder+", Balance: $"+String.format("%.2f",balance);
    }
}
