package Adapter;

import Adapter.thirdparty.IciciBankApi;
import Adapter.thirdparty.YesBankApi;

public class PhonepeApi {
    private BankApi bankApi;
    PhonepeApi(BankApi bankApi){
        this.bankApi=bankApi;
    }
    public void doSomething() throws InterruptedException{
        double currentBalance = bankApi.getBalance("1");
        Thread.sleep(25*24*60*60*1000);
        currentBalance=currentBalance*2;
    }
}
