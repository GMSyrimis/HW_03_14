package nyc.c4q.gmsyrimis;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.PrintWriter;


/* This should be like the main menu */


public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //Need to find a way to remember the tools I initiate.
        Scanner keyboard = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("rapgame.txt","UTF-8");
        // this was a savegame feature idea...
        int totalScore=0;
        //never interupt the system out flow, it confuses people
// an attempt to capture rhymes. a lot learned, should find a way to pace through code in a timeframe.

            System.out.println("");
            System.out.println("                          THE  RAPGAME  ");
            System.out.println("");
            System.out.println("This rap game, this rap game,\n" +
                    "I ain't sell'in my soul for this rap game,\n" +
                    "Now I ain't digg'in no hole for this rap game,\n" +
                    "But I'm tellin ya no it ain't happenin..\n" +
                    "\n" +
                    "This rap game, this rap game,\n" +
                    "I ain't sell'in my soul for this rap game,\n" +
                    "I ain't digg'in no hole for this rap game,\n" +
                    "This rap game, this rap game...");
            System.out.println("");
            System.out.println("");
            System.out.println("__________________________________________________________________");
            System.out.println("_                                                                _");
            System.out.println("_  CHECK IT!                                                     _");
            System.out.println("_                                                                _");
            System.out.println("_                                                                _");
            System.out.println("_  (the mic gets passed over to you)                             _");
            System.out.println("");
            System.out.println("");
            System.out.println("You need write two lines that rhyme and have the last 1, 2 or 3 characters of the string the same.");
            System.out.println("I wanted you to experience more but this is pre-Alpha.");
            System.out.println("");
            System.out.println("You start with: " + totalScore + "points");
            System.out.println("As long as you don't go 30 below, you don't loose.");
        System.out.println("Options:");
        System.out.println("RHYMEBOOK | STORE | EXIT");
        //Need to add functionality to keywords
//THIS IS WHERE MY GAME STARTS

        while (totalScore>-30) {
            //keep user input close to the beginning of the code branch. Know that it's always here.
            String lineA=keyboard.nextLine();
            String lineB=keyboard.nextLine();
            if(lineA.equals("EXIT")){
                break;
            }
            // here are the scores for each rhyme length
                int score3=5;
                int score2=2;
                int score1=1;
            // Line A computations. Maybe method?
                int lineLengthA=lineA.length();
                int lineA_LastThree=lineLengthA - 3;
                int lineA_LastTwo=lineLengthA-2;
                int lineA_LastOne=lineLengthA-1;
                String rhymeA3=lineA.substring(lineA_LastThree);
                String rhymeA2=lineA.substring(lineA_LastTwo);
                String rhymeA1=lineA.substring(lineA_LastOne);
            //Line B computations call Method?
                int lineLengthB=lineB.length();
                int lineB_LastThree=lineLengthB - 3;
                int lineB_LastTwo=lineLengthB - 2;
                int lineB_LastOne=lineLengthB - 1;
                String rhymeB3=lineB.substring(lineB_LastThree);
                String rhymeB2=lineB.substring(lineB_LastTwo);
                String rhymeB1=lineB.substring(lineB_LastOne);
            // Rhyme operations
                if (rhymeA3.equalsIgnoreCase(rhymeB3)) {
                    writer.println(lineA);
                    writer.println(lineB);
                    totalScore=totalScore+score3;
                        System.out.println("");
                        System.out.println("Cool you just scored " + score3 + " points.");
                        System.out.println("");
                }
                else if(rhymeA2.equalsIgnoreCase(rhymeB2)) {
                    totalScore=totalScore+score2;
                    writer.println(lineA);
                    writer.println(lineB);
                        System.out.println("");
                        System.out.println("Aight, aight, no doubt. That's a good try "+score2+" points.");
                        System.out.println("");
                }
                else if(rhymeA1.equalsIgnoreCase(rhymeB1)){
                    totalScore = totalScore + score1;
                    writer.println(lineA);
                    writer.println(lineB);
                        System.out.println("");
                        System.out.println("hey, hey, remember the last 3 characters of your input");
                        System.out.println( score1 + " I'm sorry I have to do this, you may have written an awesome line, but I can't pick everything up yet.");
                }
                else{
                    totalScore=totalScore-10;
                    writer.println(lineA);
                    writer.println(lineB);
                        System.out.println("");
                        System.out.println("I don't know maybe I'm just too stupid to get it, but that's -10 points.");
                        System.out.println("");
                }

   /* ------END OF VERY LONG IF BRANCH CHECKING THE EQUALITY BETWEEN RHYME A AND RHYME B FROM THE TWO LINES */

        }

        //----------END WHILE

        writer.close();
        System.out.println("You've got to do better than that.");
        System.out.println("GAME OVER");
    }
}
