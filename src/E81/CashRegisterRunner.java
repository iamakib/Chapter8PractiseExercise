package E81;

import E82.CashRegister;
import E82.Coin;

public class CashRegisterRunner {
    public static void main(String[] args) {
        E82.Coin quarter = new E82.Coin(0.25,"Quarter");
        E82.Coin dime = new E82.Coin(0.1,"Dime");
        E82.Coin nickel = new E82.Coin(0.05,"Nickel");
        E82.Coin penny = new Coin(0.01,"Penny");

        E82.CashRegister cashRegister = new CashRegister();


        cashRegister.receivePayment(3,quarter);
        cashRegister.receivePayment(20,dime);
        cashRegister.receivePayment(3,nickel);
        cashRegister.receivePayment(1,penny);



        double coinInput = cashRegister.getPayment();
        System.out.printf("Total input coin amount is %.2f" , coinInput);
    }
}
