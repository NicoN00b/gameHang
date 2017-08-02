package Models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/2/17.
 */
public class GameTest {
    @Test
    public void  newArray_createCharArray_1() {
        Game testGame = new Game();
        assertEquals(true, testGame.findWord("test", 'e'));
    }
    @Test
    public void  newArray_createCharArray_false() {
        Game testGame = new Game();
        assertEquals(false, testGame.findWord("test", 'v'));
    }
    @Test
    public void  newArray_createCharArray_false2() {
        Game testGame = new Game();
        assertEquals(false, testGame.findWord("test", 'o'));
    }
    @Test
    public void  newArray_createCharArray_false3() {
        Game testGame = new Game();
        assertEquals(false, testGame.findWord("test", 'o'));
    }
    @Test
    public void  newWordBank_findWord_1() {
        Game testGame = new Game();
        String Expected = "apple";
        assertEquals(Expected, testGame.wordChoice());
    }
    @Test
    public void  newWordBank_findWord_2() {
        Game testGame = new Game();
        String Expected = "tea";
        assertEquals(Expected, testGame.wordChoice());
    }
    @Test
    public void  newWordBank_findWord3() {
        Game testGame = new Game();
        String Expected = "cat";
        assertEquals(Expected, testGame.wordChoice());
    }

//    @Test
//    public void newArray_createCharArray_1() {
//        Game testGame = new Game();
//        String Expected = "e";
//        assertEquals(Expected, testGame.testString());
//    }
//
//    @Test
//    public void newGame_grabWordArray_1(){
//        Game testGame = new Game ();
//        assertEquals(e);
//    }
}