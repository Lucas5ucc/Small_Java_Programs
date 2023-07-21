package org.academiadecodigo.bootcamp;

public class Main {

    public static final String STRING = "rui rui rui rui campelo campelo campelo test test abc abc";

    public static void main(String[] args) {

        UniqueWords uniqueWords = new UniqueWords(STRING);

        for (String word: uniqueWords) {
            System.out.println(word);
        }

    }


}
