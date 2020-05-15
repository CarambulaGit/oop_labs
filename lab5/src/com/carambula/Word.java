package com.carambula;

import java.util.ArrayList;
import java.util.Collections;

public class Word extends SentenceMember {
    private ArrayList<Letter> letters;

    public Word(String s) {
        letters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            letters.add(new Letter(s.charAt(i)));
        }
    }

    public void remover() {
        Letter lastLetter = letters.get(letters.size() - 1);
        letters.removeAll(Collections.singletonList(lastLetter));
//        letters.removeIf(lastLetter::equals);
        letters.add(lastLetter);
    }

    @Override
    public String toString() {
//        return letters.toString();
        StringBuilder sb = new StringBuilder();

        for (Letter letter : letters) {
            sb.append(letter.toString());
        }
        return sb.toString();
    }
}
