package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Кыргызстан").print();
        System.out.println("-------------------");
        createObject("Япония").print();
        System.out.println("-------------------");
        createObject("Великобритания").print();

    }

    public static Country createObject(String className){
        switch (className){
            case "Кыргызстан":
                return new Kyrgyzstan("кыргызский, русский", 6592000,
                        "светское государство", "Средняя Азия");
            case "Япония":
                return new Japan("японский", 125552000, "Токио", 6852);
            case "Великобритания":
                return new GreatBritain("английский", 66273576,
                        "Елизавета II", "фунт стерлингов");
        }
        return null;
    }
}
