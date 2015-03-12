package nyc.c4q.gmsyrimis;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * Created by c4q-george on 3/11/15.
 */
public class Stage2_Items {
    public static void main(String[] args) throws IOException {

        List<String> savegame = Files.readAllLines(Paths.get("savegame2.txt"), Charset.defaultCharset());

        boolean hasBoombox=false;
        boolean hasHeadphones=false;
        boolean hasMic=false;
        boolean hasChain=false;
        int points=900;
        int max=4;

        for(String line : savegame){
            String[] data = line.split(" ");
            String variable = data[0];
            String value=data[1];
            if(variable.equalsIgnoreCase("points")){
                points=Integer.parseInt(value);
            }
            else if(variable.equalsIgnoreCase("hasBoombox")){
                hasBoombox=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasHeadphones")){
                hasHeadphones=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasMic")){
                hasMic=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
            else if(variable.equalsIgnoreCase("hasChain")){
                hasChain=value.equals("true");
                if(value.equals("true")){
                    max=max-1;
                }
            }
        }


        Scanner keyboard=new Scanner(System.in);
        String response;


        if(max==0){
            System.out.println("Store is closed for renovations.");
            return;
        }

        for(int i=1;i<=4;i++) {
            System.out.println("What would you like to buy?");
            System.out.println("Credit: $" + points);
            System.out.println("");

            if (hasBoombox == false) {
                System.out.println("Boombox: $500");
            }
            if (hasHeadphones == false) {
                System.out.println("Headphones: $600");
            }
            if (hasMic == false) {
                System.out.println("Mic: $900");
            }
            if (hasChain == false) {
                System.out.println("Chain: $1000");
            }
            response = keyboard.nextLine();


            if (response.equalsIgnoreCase("nothing")) {
                break;
            } else if (response.equalsIgnoreCase("Boombox")) {
                if((points-500)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 500;
                    hasBoombox = true;

                }
            } else if (response.equalsIgnoreCase("Headphones")) {
                if((points-600)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 600;
                    hasHeadphones = true;

                }
            } else if (response.equalsIgnoreCase("Mic")) {
                if((points-900)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 900;
                    hasMic = true;

                }
            } else if (response.equalsIgnoreCase("Chain")) {
                if((points-1000)<0){
                    System.out.println("");
                    System.out.println(">I'm sorry your credit card was declined.");
                    System.out.println("");
                }
                else {
                    points = points - 1000;
                    hasChain = true;

                }
            } else {
                System.out.println("We don't carry that yet.");
                System.out.println("");
                i--;
                continue;
            }
            if(i!=4&&(points-500)>=0) {
                System.out.println("");
                System.out.println("Great choice! Would you like anything else?");
                System.out.println("");
            }
        }
        PrintWriter writer = new PrintWriter("savegame2.txt", "UTF-8");
        writer.println("points " +points);
        writer.println("hasBoombox "+hasBoombox);
        writer.println("hasHeadphones "+hasHeadphones);
        writer.println("hasMic "+hasMic);
        writer.println("hasChain "+hasChain);
        writer.close();
        System.out.println("Thank you for your business. See you next time!");

    }
    //we need to save choices to the saved game file
}

