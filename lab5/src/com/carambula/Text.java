package com.carambula;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;

    public Text(String s) {
        String[] split = s.split("\n");
        sentences = new Sentence[split.length];
        for (int i = 0; i < split.length; i++) {
            sentences[i] = new Sentence(split[i]);
        }
    }

    public void remover() {
        for (Sentence sentence : sentences) {
            sentence.remover();
        }
    }

    @Override
    public String toString() {
//        return Arrays.toString(sentences);
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString());
        }
        return sb.toString();
    }
}
