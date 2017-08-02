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
            String compare = "";

            for (int x= 0; x<output.length(); x++) {
                compare += "-";
            }

            
            for (int i = 0 ; i <output.length(); i++) {
                System.out.println("Make another: ");
                String answerTwo= bufferedReader.readLine();
                char inputAnother = answerTwo.charAt(0);
                output = newGame.findWord(output, inputAnother);
                System.out.println(output);
                char [] outputArray = output.toCharArray();



                //System.out.println(compare);
                if (output.equals(compare)){
                    System.out.println("you are done!");
                    break;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
