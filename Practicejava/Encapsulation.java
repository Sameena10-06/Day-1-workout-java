// Encapulation example
class Bank{
    private int balance;
    public int getBalance(){
        return balance;
       
    }
    public int setBalance(int balance){
        this.balance = balance;
        return balance;
    }
}

class Encapsulation {
    public static void main(String[]args){
        Bank b1 =new Bank();
        b1.setBalance(100);
        Bank b2 = new Bank();
        b2.setBalance(1000);
        // b2.getBalance();
        // b1.getBalance();
        System.out.println("Balance of b1 :" + b1.getBalance());
        System.out.println("Balance of b2 :" +b2.getBalance());
    }
}
