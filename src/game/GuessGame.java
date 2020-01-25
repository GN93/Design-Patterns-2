package game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public GuessGame() {
    }

    private final int NUMBER_OF_ROUNDS = 10;
    private static GuessGame instance = new GuessGame();
    private int score;

    public static GuessGame getInstance(){
        return instance;
    }

    public void play(){
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int loadedNum;
        int generatedNum;
        int pointsEarned = 0;

        for (int i = 0; i < NUMBER_OF_ROUNDS-1; i++) {
            System.out.println("Podaj liczbę z zakresu 0 - 9:");
            loadedNum = in.nextInt();
            generatedNum = generator.nextInt(9);
            if(loadedNum == generatedNum) {
                pointsEarned++;
                System.out.println("Zgadłeś! Twoja liczba punktów to: " + pointsEarned);
            } else {
                System.out.println("Pudło. Wylosowana liczba to:" + generatedNum);
            }
        }

        System.out.println("Końcowa liczba punktów to: " + pointsEarned);
        this.score = pointsEarned;
    }

    public int getScore() {
        return score;
    }


    private Object readResolve() {
        return getInstance();
    }
}