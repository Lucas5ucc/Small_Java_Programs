package org.academiadecodigo.bootcamp.guessnumber;

public class Players {

    private String name;

    public Players(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int chooseNumber(int maxGuess) {
        return RandomGenerator.getRandomNum(1, maxGuess);
    }

}
