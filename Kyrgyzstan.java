package com.company;

public class Kyrgyzstan extends Country{

    private String faith;
    private String continent;

    public Kyrgyzstan(String language, int population, String faith, String continent) {
        super(language, population);
        this.faith = faith;
        this.continent = continent;
    }

    @Override
    public void print() {
        System.out.println(getInfo() +
                "\nРелигия: " + faith +
                "\nКонтинент: " + continent);
    }
}
