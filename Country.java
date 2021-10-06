package com.company;

public abstract class Country implements Printable {

    private String language;
    private int population;

    public Country(String language, int population) {
        this.language = language;
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public int getPopulation() {
        return population;
    }

    public String getInfo(){
        return "Язык: " + language +
                "\nНасление: " + population;
    }
}
