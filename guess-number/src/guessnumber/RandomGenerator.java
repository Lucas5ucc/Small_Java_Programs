package org.academiadecodigo.bootcamp.guessnumber;


public class RandomGenerator {

    public static int getRandomNum(int max) {
        return getRandomNum(0, max);
    }

    public static int getRandomNum(int min, int max) {

        return (int) (Math.random() * (max - min + 1) + min);

    }
}
