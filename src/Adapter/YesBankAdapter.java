package Adapter;

import Adapter.thirdparty.YesBankApi;

public class YesBankAdapter implements BankApi{
    private YesBankApi yesBankApi =
            new YesBankApi();
    @Override
    public double getBalance(String AccountNumber) {
        return 0;
    }

    @Override
    public boolean SendMoney(String fromAccount, String toAccount, double Amount) {
        return false;
    }
}
