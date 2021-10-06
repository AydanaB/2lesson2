package com.company;

public class Japan extends Country{

    private String capital;
    private int islands;

    public Japan(String language, int population, String capital, int islands) {
        super(language, population);
        this.capital = capital;
        this.islands = islands;
    }

    @Override
    public void print() {
        System.out.println(getInfo() +
                "\nСтолица: " + capital +
                "\nКоличество островов: " + islands);
    }
}
