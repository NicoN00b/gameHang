package Models;

import java.util.Random;


public class Game {
    private String[] wordBank = {"cat", "tea", "apple"};
    private String gameWord = null;


    public boolean findWord(String word, char letter){
        boolean test = false;
        char[] wordArray = word.toCharArray();
        for (char individualWordArray :wordArray) {
            Character wrapperElement = individualWordArray;
            if (wrapperElement.equals(letter)){
                test = true;
            } else{
            }
        }

        return test;
    }

    public String wordChoice(){
        Random myRandomGenerator = new Random();
        int number = myRandomGenerator.nextInt(wordBank.length);
        gameWord = wordBank[number];

        return gameWord;

    }
}
