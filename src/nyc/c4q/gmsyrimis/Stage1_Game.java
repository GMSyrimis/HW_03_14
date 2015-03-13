package nyc.c4q.gmsyrimis;

/**
 * Created by c4q-george on 3/12/15.
 */
import java.util.Scanner;
public class Stage1_Game {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);

        int i=0;
        while(i<3){
            System.out.print("choose your destiny");
            String response=keyboard.nextLine();
            if(response.equalsIgnoreCase("die")){
                System.out.println("Game Over!");
                return;
            }
        }
    }

}
