package Adapter;

public interface BankApi {
    double getBalance(String AccountNumber);
    boolean SendMoney(String fromAccount,String toAccount,double Amount);
}
