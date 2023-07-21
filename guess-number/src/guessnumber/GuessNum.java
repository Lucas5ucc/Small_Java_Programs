package org.academiadecodigo.bootcamp.guessnumber;

public class GuessNum {

    private int maxGuess;
    private Players[] players;

    public GuessNum(int maxGuess, Players[] players) {

        this.maxGuess = maxGuess;
        this.players = players;

    }
    public void startGame() {

        int systemGuess = chooseNumber();
        System.out.println("## The system chooses the number " + systemGuess);

        boolean endGame = false;

        while (!endGame) {

            for (Players player : players) {

                int playerGuess = player.chooseNumber(maxGuess);
                System.out.println(player.getName() + " guessed number " + playerGuess);

                if (playerGuess == systemGuess) {

                    System.out.println("## " + player.getName() + " wins! ##");
                    endGame = true;
                    break;

                }
            }
        }
    }

    private int chooseNumber() {
        return  RandomGenerator.getRandomNum(maxGuess);
    }

}
