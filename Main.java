package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Кыргызстан");
        System.out.println("-------------------");
        createObject("Япония");
        System.out.println("-------------------");
        createObject("Великобритания");

    }

    public static void createObject(String className){
        switch (className){
            case "Кыргызстан":
                Kyrgyzstan kyrgyzstan = new Kyrgyzstan("кыргызский, русский", 6592000,
                        "светское государство", "Средняя Азия");
                System.out.println(className); kyrgyzstan.print();
                break;
            case "Япония":
                Japan japan = new Japan("японский", 125552000, "Токио", 6852);
                System.out.println(className); japan.print();
                break;
            case "Великобритания":
                GreatBritain greatBritain = new GreatBritain("английский", 66273576,
                        "Елизавета II", "фунт стерлингов");
                System.out.println(className); greatBritain.print();
                break;
        }
    }
}
