package Adapter;

import Adapter.thirdparty.IciciBankApi;

public class IciciBankAdapter implements BankApi{
    private IciciBankApi iciciBankApi =
            new IciciBankApi();

    @Override
    public double getBalance(String AccountNumber) {
        return 0;
    }

    @Override
    public boolean SendMoney(String fromAccount, String toAccount, double Amount) {
        return false;
    }
}
