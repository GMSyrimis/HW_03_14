package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/13/15.
 */
import com.sun.jdi.CharValue;

import java.io.*;
import java.util.ArrayList;

public class RhymeRator {

    public static void main(String[] args){

        String lineA="Till I collapse I’m spilling these raps long as you feel 'em Till the day that I drop you'll never say that I'm not killing them 'Cause when I am not then I'ma stop penning 'em And I am not hip-hop and I’m just not Eminem. Subliminal thoughts when I'm stop sending them women are caught in webs spin and hauk venom Adrenaline shots of penicillin could not get the illing to stop. Amoxacilin is just not real enough.The criminal cop killing hip-hop filling a minimal swap to cop millions of Pac listeners.You're coming with me, feel it or not you’re gonna fear it like I showed you the spirit of god lives in us. You hear it a lot, lyrics that shock is it a miracle or am I just a product of pop fizzing up. For sizzle my whizzle this is the plot listen up you bizzles forgot slizzle does not give a fuck.";

        ArrayList<Character> chars = new ArrayList<Character>();
        //we just made a character array list. called chars.

        for (char c : lineA.toCharArray()) {
            //now we are starting a loop so you could expect this to run a few cycles
            //the loop depends on a variable c of character type.


            //I will try to add some code
            if(c=='.'){
                chars.remove(c);
            }
            else if(c==','){
                chars.remove(c);
            }
            else if(c=='-'){
                chars.remove(c);
            }
            else {
                chars.add(c);
            }
            //we add the character to the array.


        }
        //Now the ArrayList called chars is useful and full of the characters in this line of text.
        //How do we navigate through this array list? How can we examine the contents?




        String answer=chars.toString();


        System.out.println(answer);













    }





}
