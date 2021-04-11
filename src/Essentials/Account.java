package Essentials;

public class Account {
    public float balance;

    public void deposite(float amount){
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(float amount){
        if(amount > 0)
            balance -= amount;
    }

    public void setBalance(float balance){
        if(balance > 0)
            this.balance = balance;
    }

    public float getBalance(){
        return balance;
    }
}
