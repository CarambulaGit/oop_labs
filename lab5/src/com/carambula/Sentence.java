package com.carambula;

public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ",.!?()";
    private SentenceMember[] sentenceMembers;

    public Sentence(String s) {
        s = s.replaceAll(" +", " ");
        String[] split = s.split("(?=[,.!?() ])|\\s");
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (PUNCTUATION_SYMBOLS.contains(split[i])) {
                sentenceMembers[i] = new Punctuation(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);
            }
        }
    }

    public void remover() {
        for (SentenceMember sentenceMember : sentenceMembers) {
            if (sentenceMember instanceof Word) ((Word) sentenceMember).remover();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (SentenceMember sentenceMember : sentenceMembers) {
            sb.append(sentenceMember.toString());
        }
        return sb.toString();
    }
}
