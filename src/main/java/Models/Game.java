package Models;

import java.util.Random;


public class Game {
    private String[] wordBank = {"cat", "tea", "apple"}; //we are creating a list of words to check against.
    private String gameWord = null;


    public String findWord(String test, char letter){
        boolean letterMatch = false;
        String result = "";
        char[] wordArray;
        wordChoice();
        if (test.equals("")){
            wordArray = gameWord.toCharArray();
        } else{
            wordArray = test.toCharArray();
        }

        Character wrapperLetter = letter;

        for (char individualWordArray :wordArray) {
            Character wrapperElement = individualWordArray;
            if (wrapperElement.equals(letter)){
                letterMatch = true;
                wrapperLetter = '-'; //single quotes for char
                //now we can replace the letter in the word with a das OR rebuild the word with dashes in place of the letter we identified.
                result += wrapperLetter;
            }
            else {
                result += individualWordArray;
            }

        }

        return result;
    }

    public String wordChoice(){
        Random myRandomGenerator = new Random();
        int number = myRandomGenerator.nextInt(wordBank.length);
        gameWord = wordBank[number];

        return gameWord;

    }


}
