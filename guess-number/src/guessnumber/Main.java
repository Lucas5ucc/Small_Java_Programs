package org.academiadecodigo.bootcamp.guessnumber;

public class Main {

    public static void main(String[] args) {

        Players[] players = new Players[] {
                new Players("Bianca"),
                new Players("Lucas"),
                new Players("Antonio"),
                new Players("Catarina")
        };

        GuessNum game = new GuessNum(10, players);
        game.startGame();

    }

}
