import Models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Welcome to Hangman... please make your first guess: ");
            String answer= bufferedReader.readLine();
            char input = answer.charAt(0);

            Game newGame = new Game();
            String output = newGame.findWord("", input);
            System.out.println(output);

            System.out.println("Make another: ");
            String answerTwo= bufferedReader.readLine();
            char inputAnother = answerTwo.charAt(0);
            String outputTwo = newGame.findWord(output, inputAnother);
            System.out.println(outputTwo);



        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
