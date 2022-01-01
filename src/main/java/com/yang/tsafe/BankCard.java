package com.yang.tsafe;

public class BankCard {
    private double money;
    private final Object lock = new Object();

    public BankCard(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean fetchMoney(double get) {
        boolean flag = false;
        synchronized (lock) {
            double left = this.getMoney();
            if (left >= get) {
                left -= get;
                this.setMoney(left);
                flag = true;
            }
            return flag;
        }
    }
}
