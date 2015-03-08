package nyc.c4q.gmsyrimis;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
	    Scanner keyboard = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("rapgame.txt","UTF-8");
        String lineA;
        String lineB;

        String rhymeA3;
        String rhymeA2;
        String rhymeA1;

        String rhymeB3;
        String rhymeB2;
        String rhymeB1;

        int lineLengthA;
        int lineLengthB;

        int lineA_LastThree;
        int lineA_LastTwo;
        int lineA_LastOne;

        int lineB_LastThree;
        int lineB_LastTwo;
        int lineB_LastOne;

        int score3=10;
        int score2=7;
        int score1=4;

        int totalScore=0;


        System.out.println("Hey, wassup? My name's G money and I'm here to teach you how to rap like a true MC. Fo real, so listen up. ");

        System.out.println("You gain points for every rhyme you get right.");

        System.out.println("But don't forget about my time, cuz I ain't got all night.");

        System.out.println("You try it now. Write two lines that rhyme at the end.");

        while (totalScore>-50) {

            lineA=keyboard.nextLine();
            lineB=keyboard.nextLine();

            lineLengthA=lineA.length();
            lineA_LastThree=lineLengthA - 3;
            lineA_LastTwo=lineLengthA-2;
            lineA_LastOne=lineLengthA-1;
            rhymeA3=lineA.substring(lineA_LastThree);
            rhymeA2=lineA.substring(lineA_LastTwo);
            rhymeA1=lineA.substring(lineA_LastOne);

            lineLengthB=lineB.length();
            lineB_LastThree=lineLengthB - 3;
            lineB_LastTwo=lineLengthB - 2;
            lineB_LastOne=lineLengthB - 1;
            rhymeB3=lineB.substring(lineB_LastThree);
            rhymeB2=lineB.substring(lineB_LastTwo);
            rhymeB1=lineB.substring(lineB_LastOne);

            if (rhymeA3.equalsIgnoreCase(rhymeB3)) {
                totalScore=totalScore+score3;
                System.out.println("Cool you just scored " + score3 + " points.");
                writer.println(lineA);
                writer.println(lineB);
            } else if(rhymeA2.equalsIgnoreCase(rhymeB2)) {
                totalScore=totalScore+score2;
                System.out.println("Aight, aight, no doubt. That's a good try "+score2+" points.");
                writer.println(lineA);
                writer.println(lineB);
            }else if(rhymeA1.equalsIgnoreCase(rhymeB1)){
                totalScore=totalScore+score1;
                System.out.println("DAMN DAWG... one letter? pssshhh, you'll definitely need to do better than that.");
                System.out.println(score1+" points for the effort.");
                writer.println(lineA);
                writer.println(lineB);
            }else{
                totalScore=totalScore-10;
                System.out.println("I don't know if I'm too stupid to get it, but that's -10 points.");
                writer.println(lineA);
                writer.println(lineB);
            }
        }
        writer.close();
        System.out.println("You've got to do better than that.");
        System.out.println("GAME OVER");
    }
}
