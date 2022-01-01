package com.yang.tsafe;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomerThread extends Thread{

    private BankCard bankCard;
    private String customerName;
    private double get;

    public CustomerThread(BankCard bankCard, String customerName, double get) {
        this.bankCard = bankCard;
        this.customerName = customerName;
        this.get = get;
    }
    @Override
    public void run() {
        // 取款
        boolean flag = bankCard.fetchMoney(get);
        String time = this.nowTime();
        if (flag) {
            System.out.println(time + "," + customerName + "取款" + get + "成功，余额" + bankCard.getMoney());
        } else {
            System.out.println(time + ",取款失败，暂无余额");
        }
    }

    private String nowTime() {
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        return df.format(d);
    }
}
