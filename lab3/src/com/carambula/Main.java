package com.carambula;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        StringBuilder
//        In words remove every letter that match the last
        StringBuilder text = new StringBuilder();
        int indOfLastLetter;
        text.append("Корабли лавировали лавировали да не вылавировали");
//        text.append("haleluya, holo. Halera:.. homosapience! halele?");
        String[] words = text.toString().split(" ");
        text.delete(0, text.length());
        for (String word : words) {
            if (Pattern.matches(".*[^a-zA-Z]", word)){
                indOfLastLetter = word.replaceAll("[^a-zA-Zа-яА-Я]","").length() - 1;
            } else {
                indOfLastLetter = word.length() - 1;
            }
            String lastLetter = String.valueOf(word.charAt(indOfLastLetter));
            for (int i = 0; i < indOfLastLetter; i++) {
                if (lastLetter.equalsIgnoreCase(String.valueOf(word.charAt(i)))) continue;
                text.append(word.charAt(i));
            }
            text.append(word.substring(indOfLastLetter)).append(" ");
        }
        System.out.println(text);
    }
}
