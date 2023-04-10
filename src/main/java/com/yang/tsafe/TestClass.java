package com.yang.tsafe;

public class TestClass {
    public static void main(String[] args) {
        BankCard card = new BankCard(2000000.0);
        Thread t = new CustomerThread(card, "Lily", 2000000.0);
        Thread t2 = new CustomerThread(card, "Alpha", 2000000.0);

        t.start();
        t2.start();

        System.out.println("test done");
        System.out.println("git branch MUSIC update");

        System.out.println("git版本控制1");
        System.out.println("game branch commit");
        System.out.println("master final commit");
        // Test Fork
        System.out.println("Fork Here");
        // Test Git on Apir-10th
    }
}
