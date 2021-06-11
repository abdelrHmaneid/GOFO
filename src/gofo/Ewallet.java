package gofo;

public class Ewallet {

    private double Balance;
    private int ID;

    public Ewallet() { //Default constructor

        Balance = 0.0;
        ID = 0;

    }

    public Ewallet(int id, double bal) {//parametrized constructor
        Balance = bal;
        ID = id;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return Balance;
    }

    public int getID() {
        return ID;
    }

    void withdraw(double money) {  // withdraw method 
        if (getBalance() - money > -1001) {
            System.out.println("allowed");
            setBalance(getBalance() - money);
            System.out.println(getBalance());
        } else {
            System.out.println("Not allowed");
        }
    }

    void deposit(double money) { // Deposite method
        Balance += money;
    }

    @Override
    public String toString() {
        return ", Balance=" + Balance;
    }

}
