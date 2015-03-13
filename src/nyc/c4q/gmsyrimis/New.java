package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/13/15.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class New {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Rhyme:");
        boolean stillRhyming = true;
        while(stillRhyming==true){
            String oneLine=keyboard.nextLine();
            if(keyboard.next().equalsIgnoreCase("yo!")){
                stillRhyming=false;
            }else{
                ArrayList<Character> chars = new ArrayList<Character>();
                //we just made a character array list. called chars.

                for (char c : oneLine.toCharArray()) {
                    //now we are starting a loop so you could expect this to run a few cycles
                    //the loop depends on a variable c of character type.

                    if(c==' '){
                        chars.remove(c);
                    }
                    else{
                        chars.add(c);
                    }
                }



            }
        }

    }
}
