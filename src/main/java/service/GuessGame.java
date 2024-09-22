package service;

public class GuessGame {
    public int luckyNumber;
    public static int remains;

    public GuessGame(int range, int remains) {
        luckyNumber = (int) Math.ceil(Math.random() * 10);
        this.remains = remains;
    }
    public boolean guess(int number) {
        if (luckyNumber == number) {
            return true;
        }
        remains -= 1;
        return false;
    }

    public int getRemains() {
        return remains;
    }

   /* public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        guessGame.GuessGame(10, 3);
        System.out.println(guessGame.getRemains());
    }*/
}

