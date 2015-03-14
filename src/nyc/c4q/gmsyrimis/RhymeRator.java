package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/13/15.
 */
import com.sun.jdi.CharValue;

import java.io.*;
import java.util.ArrayList;

public class RhymeRator {

    public static void main(String[] args){

        String longString="Till I collapse Im spilling these raps long as you feel em Till the day that I drop youll never say that Im not killing them Cause when I am not then Ima stop penning em And I am not hip-hop and Im just not Eminem. Subliminal thoughts when Im stop sending them women are caught in webs spin and hauk venom Adrenaline shots of penicillin could not get the illing to stop. Amoxacilin is just not real enough.The criminal cop killing hip-hop filling a minimal swap to cop millions of Pac listeners.Youre coming with me, feel it or not youre gonna fear it like I showed you the spirit of god lives in us. You hear it a lot, lyrics that shock is it a miracle or am I just a product of pop fizzing up. For sizzle my whizzle this is the plot listen up you bizzles forgot slizzle does not give a fuck.";


        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        int f=0;
        int g=0;
        int h=0;
        int i=0;
        int j=0;
        int k=0;
        int l=0;
        int m=0;
        int n=0;
        int o=0;
        int p=0;
        int q=0;
        int r=0;
        int s=0;
        int t=0;
        int u=0;
        int v=0;
        int w=0;
        int x=0;
        int y=0;
        int z=0;
        
        /* we will loop through the array of words and in each cell we will count the letters. We will then compare each letter of the cell with the alphabet and increase the counter on each letter that appears*/

        String[] wordArray = longString.split(" ");
        int arraySize = wordArray.length;
        // LOOP THROUGH THE ARRAY

        for (int cell = 0; cell <= arraySize-1; cell++) {

            // GET CELL SIZE OF CURRENT CELL print cell
            int cellSize = wordArray[cell].length();
            //GET EACH LETTER
            for (int inCellIndex = 0; inCellIndex <= cellSize -1; inCellIndex++) {
                String letter = wordArray[cell].substring(inCellIndex,inCellIndex+1);
                if(letter.equalsIgnoreCase("")){
                    letter="";
                }
                if(letter.equalsIgnoreCase(",")){
                    letter="";
                }
                if(letter.equalsIgnoreCase(".")){
                    letter="";
                }
                if(letter.equalsIgnoreCase("-")){
                    letter="";
                }

                System.out.print(letter);



            }

        }


    }





}
