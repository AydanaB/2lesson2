package com.company;

public class GreatBritain extends Country{

    private String queen;
    private String bill;

    public GreatBritain(String language, int population, String queen, String bill) {
        super(language, population);
        this.queen = queen;
        this.bill = bill;
    }

    @Override
    public void print() {
        System.out.println(getInfo() +
                "\nГлава государства: " + queen +
                "\nВалюта: " + bill);
    }
}
